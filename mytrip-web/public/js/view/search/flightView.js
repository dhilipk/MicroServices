/**
 * Search page for flight booking view
 */
define([
    'jquery',
    'backbone',
    'handlebars',
    'view/common/modalView'
], function($, Backbone, Handlebars, ModalView) {
    var flightSearchDetails = {},
        SearchFlightView = Backbone.View.extend({
        el: '#mytrip-flight-search',
        events: {
            'click .mytrip-select-travel-type': 'showReturnJourneySelectTemplate',
            'click .mytrip-search-flight-confirm-btn': 'submitFlightSearch'
        },

        initialize: function () {
            console.log('initialize: SearchFlightView');
            var data = JSON.parse($('#mytrip-leaving-from-data').html() || ''),
                flightsDestinationData = JSON.parse($('#mytrip-leaving-to-data').html() || '{}'),
                searchFlightViewTemplate = Handlebars.compile($('#mytrip-leaving-from-select-template').html() || ''),
                leavingToSelectTemplate = Handlebars.compile($('#mytrip-leaving-to-select-template').html() || '');
            $('#mytrip-leaving-from-cities-container').html(searchFlightViewTemplate(data));
            $('#mytrip-leaving-to-cities-container').html(leavingToSelectTemplate(flightsDestinationData));
            this.render();
        },

        render: function () {
            //$('#mytrip-leaving-to-cities-container').hide();
        },

        showReturnJourneySelectTemplate: function () {
            if ($("input[name=mytrip-select-travel-type-name][value='Round Trip']").is(':checked')) {
                //$('#mytrip-leaving-to-cities-container').show();
            } else {
                //$('#mytrip-leaving-to-cities-container').hide();
            }
        },

        submitFlightSearch: function () {
            console.log('submit flight search page');
            flightSearchDetails = {
                tripType: $('input[name=mytrip-select-travel-type-name]').val(),
                leavingFrom: $('#select-leaving-from').val(),
                leavingTo: $('#select-leaving-to').val(),
                departingDate: $('#departing-on').val()
            };
            $('#search-domestic-flight-details').val(JSON.stringify(flightSearchDetails));
            $('#mytrip-search-flights-form').submit();
        }
    });

    return SearchFlightView;
});
