define(['backbone'], function (Backbone) {
    var Flight = Backbone.Model.extend({
        defaults: {
            ID: undefined,
            serviceProvider: undefined,
            flightNumber: undefined,
            destinationCity: undefined,
            originCity: undefined
        },
        idAttribute: 'ID'
    });
    return Flight;
});