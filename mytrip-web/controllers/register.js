'use strict';

var Promise = require('bluebird'),
    RegisterModel = require('../models/customer/register');

module.exports = function (router) {

    router.get('/login', function (req, res) {
        var registerModel = RegisterModel();
        console.log("/login");
        res.render('login', registerModel);
    });
};