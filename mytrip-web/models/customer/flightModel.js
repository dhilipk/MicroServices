'use strict';

var supportServiceWrapper = require('../../lib/client-interaction/support-service-wrapper');

module.exports = function FlightModel() {
    var flightsLeavingData;

    return {
        name: 'flight',
        flightsLeavingFrom: function (request, callback) {
            console.log("models/customer/flightModel->flightsLeavingFrom");
            supportServiceWrapper.findAllCities(function (responseData) {
                flightsLeavingData = responseData;
                callback();
            });
        },
        model: function () {
            return {
                flightsLeavingData: flightsLeavingData
            };
        }
    };
};
