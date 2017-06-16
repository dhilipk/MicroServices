'use strict';

define(['jquery', 'backbone', 'landingView'], function($, Backbone, LandingView) {
    
    var Router = Backbone.Router.extend({
        routes: {
            '': 'renderApplication'
        },

        renderApplication: function() {

            var AboutView = LandingView.extend({
                el          :   '#dynaSection',
                template    :   'about'
            });

            var aboutView = new AboutView();
            aboutView.render();
        }

    });

    return Router;
})