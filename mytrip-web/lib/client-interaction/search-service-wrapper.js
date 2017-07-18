'use strict';

var NodeClient = require('node-rest-client').Client,
    client;

function init() {
    if (!client) {
        client = new NodeClient();
    }
}
module.exports = {
    searchFlights: function (request, callback) {
        init();
        client.post("http://localhost:9000/flight-search-service/v2/search/flights", {
            data: request.body,
            headers: { "Content-Type": "application/json" }
        }, function (responseData, response) {
            callback(responseData, response.statusCode);
        });
    }
};