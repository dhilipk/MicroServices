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

        renderApplication: function() {
            console.log("renderApplication");
            /*var AboutView = landing.extend({
                el          :   '#dynaSection',
                template    :   'about'
            });

            var aboutView = new AboutView();
            aboutView.render();*/
        }

    });

    return Router;
});