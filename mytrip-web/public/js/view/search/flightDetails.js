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
            el: '#mytrip-flight-book-details-table',
            initialize: function () {
                console.log('initialize: FlightDetailsView');
                $('#flight-list-data-template-container').html(flightSearchDetailsTemplate(flightSearchDetailsData));
                /*collectionDetails = new FlightCollections();
                var flightModel1 = new FlightModel({ ID: 4, flightNumber: '6E-3434', price: '200' });
                var flightModel2 = new FlightModel({ ID: 5, flightNumber: '6E-8756', price: '300' });
                collectionDetails.add([flightModel1, flightModel2]);
                var tbody = this.$el.find('tbody');
                var viewHtml = '';
                //Iterate through the collection 
                _.each(collectionDetails.models, function (m) {
                    var empRecHtml = '<tr><td>' + m.get('ID') + '</td><td>' + m.get('flightNumber') + '</td><td>' + m.get('price') + '</td></tr>';
                    viewHtml += empRecHtml;
                });*/
            },
            render: function () {
                
            }
        });
        return new FlightDetailsView;
    };
    
});