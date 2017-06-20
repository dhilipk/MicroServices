'use strict';

var Promise = require('bluebird');

module.exports = function (router) {
    router.get('/search/flight/domestic', function (req, res) {
        console.log("/search/flight/domestic");
    });
};