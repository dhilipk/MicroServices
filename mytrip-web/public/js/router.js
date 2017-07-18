'use strict';

define(['jquery', 'backbone', 'landing'
], function($, Backbone, landing) {
    
    var Router = Backbone.Router.extend({
        routes: {
            '': 'renderApplication',
            'about': 'showAbout'
        },

        /**
         * Important setup to start using the router.
         */
        initialize: function () {
            console.log("Initialize application");
            landing();
        },

        showAbout: function () {
            console.log("about page rendered");
        },

        renderApplication: function() {
            console.log("renderApplication");
        }

    });

    return Router;
});