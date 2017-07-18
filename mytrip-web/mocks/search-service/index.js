'use strict';

module.exports = {
    searchFlights:  function (request, callback) {
        var flightSearchDetails;
        try {
            flightSearchDetails = require('./v2/flights');
        } catch (e) {
            flightSearchDetails = require('./v2/default');
        }
        callback(flightSearchDetails, { statusCode: 200, body: flightSearchDetails });
    }
}