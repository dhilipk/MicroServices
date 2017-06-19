'use strict';

var IndexModel = require('../models/index');
var AboutModel = require('../models/general/about');

module.exports = function (router) {

    var model = new IndexModel();
    var about = new AboutModel();

    router.get('/', function (req, res) {
        res.render('index', model);
    });

    router.get('/about', function (req, res) {
        res.render('about', about);
    });

};
