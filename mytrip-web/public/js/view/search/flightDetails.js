/**
 * Search page for flight booking view
 */
define([
    'jquery',
    'backbone',
    'underscore',
    'handlebars',
    'collection/search/flightCollections',
    'model/search/flightModel'
], function($, Backbone, _, Handlebars, FlightCollections, FlightModel) {
    return function () {
        var flightSearchDetailsData = JSON.parse($('#mytrip-flight-search-details-data').html() || ''),
            flightSearchDetailsTemplate = Handlebars.compile($('#mytrip-flight-list-template').html() || ''),
            FlightDetailsView = Backbone.View.extend({
            el: '#mytrip-flight-book-form',

            events: {
                'click .mytrip-search-flight-confirm-btn': 'submitFlightBooking'
            },

            initialize: function () {
                console.log('initialize: FlightDetailsView');
                $('#flight-list-data-template-container').html(flightSearchDetailsTemplate(flightSearchDetailsData));
            },

            submitFlightBooking: function () {
                $('#mytrip-flight-book-form').submit();
            }
        });
        
        $(".mytrip-search-flight-confirm-btn").click(function(){ alert("success"); });
        return new FlightDetailsView;
    };
    
});