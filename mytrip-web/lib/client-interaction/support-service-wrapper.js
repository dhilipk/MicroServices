'use strict';

var NodeClient = require('node-rest-client').Client,
    client;

function init() {
    if (!client) {
        client = new NodeClient();
    }
}
module.exports = {
    findAllCities: function (callback) {
        init();
        client.get("http://localhost:9000/support-service/v1/cities", function (data, response) {
            callback(data);
        });
    }
};