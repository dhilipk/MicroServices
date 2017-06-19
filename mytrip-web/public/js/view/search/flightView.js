/**
 * Search page for flight booking view
 */
define([
    'backbone',
    'handlebars',
    'view/common/modalView'
], function(Backbone, Handlebars, ModalView) {
    var searchFlightViewTemplate = Handlebars.compile($('#mytrip-search-flight-view-template').html() || '');

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

        show: function () {
            console.log("show function" + this.template());
            if (this.template() !== '') {
                ModalView.prototype.show.call(this);
            }
        }
    });

    return SearchFlightView;
});
