/**
 * ModalView
 * A common view for handling modals.
 * el - mytrip model view div element id, in-general an element must be specified 
 * when instantiating so that the view knows where to bind.
 * template - inner content of the modal (MANDATORY).
 * data - The data with which the template will be rendered (MANDATORY).
 */
define([
    'backbone'
], function(Backbone) {
    var ModalView = Backbone.View.extend({

        el: '#mytrip-common-modal-base',

        attributes: {
            template: undefined,
            data: undefined
        },

        initialize: function () {
            if (this.attributes.template) {
                this.template = this.attributes.template;
            }
        },

        render: function () {
            var modalContent = this.$el.find('.modal-content');

            modalContent.empty();
            modalContent.append(this.template(this.attributes.data));
        },

        show: function () {
            this.render();
            this.$el.modal('show');
        },

        hide: function () {
            this.$el.modal('hide');
        }
    });

    return ModalView;
});