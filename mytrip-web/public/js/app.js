/*global requirejs:true*/

'use strict';

define(['jquery',
         'backbone',
         'router'/* Dependencies */
], function ($, Backbone, Router) {
    $(document).ready(function () {
        console.log('Backbone application loaded');
    });

    var router = new Router();
});
