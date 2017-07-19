/**
 * Search page for flight booking view
 */
define([
    'jquery',
    'backbone',
    'handlebars',
    'view/common/modalView'
], function($, Backbone, Handlebars, ModalView) {
    return function () {
        var FlightDetailsView = Backbone.View.extend({
            initialize: function () {
                console.log('initialize: FlightDetailsView');
            }
        });
        return new FlightDetailsView;
    };
    
});