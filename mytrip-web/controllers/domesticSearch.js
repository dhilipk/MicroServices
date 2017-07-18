'use strict';

var Promise = require('bluebird'),
    FlightModel = require('../models/customer/flightModel');

module.exports = function (router) {
    router.post('/search/flight/domestic', function (req, res) {
        var flightModel = FlightModel();
        console.log("/search/flight/domestic");
        res.render('flight-search', flightModel);
    });
};