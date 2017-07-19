'use strict';

define(['jquery', 'backbone', 'landing', 'view/search/flightDetails'
], function($, Backbone, landing, flightDetails) {
    
    var Router = Backbone.Router.extend({
        routes: {
            '': 'renderApplication',
            'about': 'showAbout',
            'search/flight/domestic': 'searchFlightDomestic'
        },
        /**
         * Important setup to start using the router.
         */
        initialize: function () {
            console.log("Initialize application");
        },

        showAbout: function () {
            console.log("about page rendered");
        },

        renderApplication: function () {
            console.log("renderApplication");
            landing();
        },

        searchFlightDomestic: function () {
            console.log("search-flight-domestic");
            flightDetails();
        }
    });

    return Router;
});