'use strict';

var Promise = require('bluebird'),
    FlightModel = require('../models/customer/flightModel');

module.exports = function (router) {
    router.post('/search/flight/domestic', function (req, res) {
        var flightModel = FlightModel(),
        flightsLeavingFrom = Promise.promisify(flightModel.searchDomesticFlight);
        flightsLeavingFrom(req).then(function () {
            res.render('flight-search', flightModel.model());
        });
    });

    router.post('/book/flight/domestic', function (req, res) {
        var flightModel = FlightModel(),
        flightsLeavingFrom = Promise.promisify(flightModel.bookDomesticFlight);
        flightsLeavingFrom(req).then(function () {
            res.render('flight-confirm', flightModel.model());
        });
    });
};