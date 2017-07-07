'use strict';
var Promise = require('bluebird'),
    IndexModel = require('../models/index'),
    FlightModel = require('../models/customer/flightModel'),
    AboutModel = require('../models/general/about');

module.exports = function (router) {
    require('./domesticSearch')(router);
    require('./register')(router);
    var about = new AboutModel();

    router.get('/', function (req, res) {
        var flightModel = FlightModel(),
        flightsLeavingFrom = Promise.promisify(flightModel.flightsLeavingFrom);
        console.log("/");
        flightsLeavingFrom(req).then(function () {
            res.render('index', flightModel.model());
        });
    });

    router.get('/about', function (req, res) {
        console.log("/about");
        res.render('about', about);
    });

};
