/**
 * Search page for flight booking view
 */
define([
    'jquery',
    'backbone',
    'handlebars',
    'view/common/modalView'
], function($, Backbone, Handlebars, ModalView) {
    var data = JSON.parse($('#mytrip-leaving-from-data').html() || ''),
    flightsDestinationData = JSON.parse($('#mytrip-leaving-to-data').html() || '{}'),
    searchFlightViewTemplate = Handlebars.compile($('#mytrip-leaving-from-select-template').html() || ''),
    leavingToSelectTemplate = Handlebars.compile($('#mytrip-leaving-to-select-template').html() || '');
    $('#mytrip-leaving-from-cities-container').html(searchFlightViewTemplate(data));
            $('#mytrip-leaving-to-cities-container').html(leavingToSelectTemplate(flightsDestinationData));
    var SearchFlightView = ModalView.extend({
        attributes: {
            template: searchFlightViewTemplate
        },

        initialize: function () {
            ModalView.prototype.initialize.call(this);
        },

        render: function () {
            ModalView.prototype.render.call(this);
        },

        events: {
            'click .mytrip-select-travel-type': 'showReturnJourneySelectTemplate'
        },

        showReturnJourneySelectTemplate: function () {
            console.log('Return Retrieval');
        },

        show: function () {
            console.log("show function " + this.template());
            if (this.template() !== '') {
                ModalView.prototype.show.call(this);
            }
        }
    });

    return SearchFlightView;
});
