/*global requirejs:true*/
'use strict';

require(['config'/* Dependencies */], function (config) {

    require(['jquery', 'router'], function($, Router) {
        var app = {
            initialize: function () {
                var router = new Router();
            }
        };

        app.initialize();
    });
});
