'use strict';

var supportServiceWrapper = require('../../lib/client-interaction/support-service-wrapper'),
    searchServiceWrapper = require('../../lib/client-interaction/search-service-wrapper'),
    travelScheduleServiceWrapper = require('../../lib/client-interaction/travel-schedule-service-wrapper');

module.exports = function FlightModel() {
    var flightsLeavingData,
        flightsDestinationData,
        flightSearchDetails;

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

        searchDomesticFlight: function(request, callback) {
            searchServiceWrapper.searchFlights(request.body.searchDomesticFlightDetails, function(responseData) {
                flightSearchDetails = responseData;
                callback();
            });
        },

        bookDomesticFlight: function (request, callback) {
            travelScheduleServiceWrapper.bookFlight(request.body.flightBookingDetails, function (err, responseData) {
                callback();
            });
        },

        model: function () {
            return {
                flightsLeavingData: flightsLeavingData,
                flightsDestinationData: flightsDestinationData,
                flightSearchDetails: flightSearchDetails
            };
        }
    };
};
