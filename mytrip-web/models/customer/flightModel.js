'use strict';

var supportServiceWrapper = require('../../lib/client-interaction/support-service-wrapper');

module.exports = function FlightModel() {
    var flightsLeavingData,
    flightsDestinationData;

    return {
        name: 'flight',
        flightsLeavingFrom: function (request, callback) {
            console.log("models/customer/flightModel->flightsLeavingFrom");
            supportServiceWrapper.findAllCities(function (responseData) {
                flightsLeavingData = responseData;
                callback();
            });

        },

        flightsDestinationTo: function (request, callback) {
            console.log("models/customer/flightModel->flightsDestinationTo");
            supportServiceWrapper.findAllCities(function (responseData) {
                flightsDestinationData = responseData;
                callback();
            });

        },
        model: function () {
            return {
                flightsLeavingData: flightsLeavingData,
                flightsDestinationData: flightsDestinationData
            };
        }
    };
};
