'use strict';

define( ['jquery', 'backbone', 'view/search/flightView'], function($, Backbone, FlightView) {
    return function () {
        new FlightView();
    };
});