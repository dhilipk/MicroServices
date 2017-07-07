'use strict';
/**
 * Entry point of this application which gets injected from master.dust.
 *
 * Configures the paths to the libraries in use.
 * Shim configuration, which is used to configure dependencies, exports and custom for older traditional
 * browser globals.
 * Initializes application.
 */
requirejs.config({
    deps: ['app'],
    baseUrl: '/js',
    paths: {
        backbone: '../components/backbone/backbone-min',
        jquery: '../components/jquery/jquery-3.2.1.min',
        jqueryUI: '../components/jquery-ui/jquery-ui.min',
        underscore: '../components/underscore/underscore-min',
        dust: '../components/dustjs-linkedin/dist/dust-full.min',
        handlebars: '../components/handlebars/handlebars-v2.0.0',
        bootstrap: '../components/bootstrap-3.3.7/js/bootstrap.min'
    },
    shim: {
        backbone: {
            deps: ['jquery', 'underscore'],
            exports: 'Backbone'
        },

        bootstrap: {
            deps: ['jquery', 'jqueryUI']
        },
        jqueryUI: {
            deps: ['jquery']
        },
        dust: {
            exports: "dust"
        }
    }
});
