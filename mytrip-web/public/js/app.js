'use strict';

define(['jquery', 'backbone', 'router'/* Dependencies */,
    // Any things which need to be initialized here but don't get used directly should go last.
    'bootstrap'
], function ($, Backbone, Router) {
    $(document).ready(function () {
        console.log('Backbone application loaded');
    });

    var router = new Router();
});
