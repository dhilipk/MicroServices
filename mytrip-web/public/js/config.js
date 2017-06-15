'use strict';

requirejs.config({
    baseUrl: '/js',
    paths: {
        backbone: '../components/backbone/backbone-min',
        jquery: '../components/jquery/jquery-3.2.1.min',
        underscore: '../components/underscore/underscore-min',
        dust: '../components/dustjs-linkedin/dist/dust-full.min'
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
