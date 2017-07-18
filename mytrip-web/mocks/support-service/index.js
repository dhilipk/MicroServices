'use strict';

module.exports = {
    findAllCities: function (callback) {
        var cities;
        try {
            cities = require('./findAllCities');
        } catch (e) {
            cities = require('./findAllCities/default');
        }
        callback(cities, { statusCode: 200, body: cities });
    }
}