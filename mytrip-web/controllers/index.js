'use strict';
var Promise = require('bluebird'),
    IndexModel = require('../models/index'),
    FlightModel = require('../models/customer/flightModel'),
    AboutModel = require('../models/general/about');

module.exports = function (router) {
    require('./domestic')(router);
    require('./register')(router);
    var about = new AboutModel();

    router.get('/', function (req, res) {
        var flightModel = FlightModel(),
        flightDetailsPromiseList = [
            Promise.promisify(flightModel.flightsLeavingFrom)(req),
            Promise.promisify(flightModel.flightsDestinationTo)(req),
        ];
        console.log("/");
        Promise.settle(flightDetailsPromiseList).then(function () {
            res.render('index', flightModel.model());
        }).finally(function () {
            console.log('finally block in controller/index');
        });
    });

    router.get('/about', function (req, res) {
        console.log("/about");
        res.render('about', about);
    });

};
