/**
 * Search page for flight booking view
 */
define([
    'jquery',
    'backbone',
    'handlebars',
    'view/common/modalView'
], function($, Backbone, Handlebars, ModalView) {
    var FlightDetailsView = Backbone.View.extend({
        el: '#mytrip-flight-search-details',

        initialize: function () {
            console.log('initialize');
        }
    });
});