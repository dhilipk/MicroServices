'use strict';
var Promise = require('bluebird'),
    IndexModel = require('../models/index'),
    AboutModel = require('../models/general/about');

module.exports = function (router) {
    require('./domesticSearch')(router);
    var about = new AboutModel();

    router.get('/', function (req, res) {
        var indexModel = IndexModel(),
        flightsLeavingFrom = Promise.promisify(indexModel.flightsLeavingFrom);
        console.log("/");
        flightsLeavingFrom(req).then(function () {
            res.render('index', indexModel.model());
        });
    });

    router.get('/about', function (req, res) {
        console.log("/about");
        res.render('about', about);
    });

};
