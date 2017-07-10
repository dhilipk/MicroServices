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
    var SearchFlightView = Backbone.View.extend({
        el: '#mytrip-flight-search',
        events: {
            'click .mytrip-select-travel-type': 'showReturnJourneySelectTemplate'
        },

        initialize: function () {
            console.log('initialize');
            this.render();
        },

        render: function () {
            $('#mytrip-leaving-to-cities-container').hide();
        },

        showReturnJourneySelectTemplate: function () {
            if ($("input[name=mytrip-select-travel-type-name][value='Round Trip']").is(':checked')) {
                $('#mytrip-leaving-to-cities-container').show();
            } else {
                $('#mytrip-leaving-to-cities-container').hide();
            }
        }
    });

    return SearchFlightView;
});
