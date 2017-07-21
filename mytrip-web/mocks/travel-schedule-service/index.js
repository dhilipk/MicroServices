'use strict';

module.exports = {
    bookFlight:  function (request, callback) {
        var flightBookingDetails;
        try {
            flightBookingDetails = require('./v1/flights');
        } catch (e) {
            flightBookingDetails = require('./v1/default');
        }
        callback(flightBookingDetails, { statusCode: 200, body: flightBookingDetails });
    }
}