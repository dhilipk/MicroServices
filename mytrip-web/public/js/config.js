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
        underscore: '../components/underscore/underscore-min',
        dust: '../components/dustjs-linkedin/dist/dust-full.min',
        handlebars: '../components/handlebars/handlebars-v2.0.0'
    },
    shim: {
        backbone: {
            deps: ['jquery', 'underscore'],
            exports: 'Backbone'
        },

        bootstrap: {
            deps: ['jquery']
        },

        'dust': {
            exports: "dust"
        }
    }
});
