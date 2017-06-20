'use strict';
var Client = require('node-rest-client').Client;

var IndexModel = function() {
    var flightsLeavingData;
    return {
        name: 'index',
        flightsLeavingFrom: function (request, callback) {
            console.log("models/index->flightsLeavingFrom");
            var client = new Client();
            // direct way 
            client.get("http://localhost:8092/v1/cities", function (data, response) {
                // parsed response body as js object 
                console.log(data);
                flightsLeavingData = data;
            });
            callback();
        },
        model: function () {
            return {
                flightsLeavingData: flightsLeavingData
            };
        },
    };
};

module.exports = IndexModel;