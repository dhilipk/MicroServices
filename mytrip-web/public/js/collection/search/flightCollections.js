define([
    'backbone',
    'model/search/flightModel'
], function (Backbone, flightModel) {
    'use strict';
    var FlightCollection = Backbone.Collection.extend({
        model: flightModel,

        initialize: function() {
            console.log('initialize: FlightCollection');
        }
    });
});