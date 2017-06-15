'use strict';

define(['jquery', 'backbone'], function($, Backbone) {
    
    var Router = Backbone.Router.extend({
        routes: {
            'about': 'renderApplication'
        },

        renderApplication: function () {
            alert('BAckbone Router Working');
        },

    });

    return Router;
})