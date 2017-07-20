define(['backbone'], function (Backbone) {
    var Flight = Backbone.Model.extend({
        defaults: {
            ID: undefined,
            serviceProvider: undefined,
            flightNumber: undefined,
            destinationCity: undefined,
            originCity: undefined,
            dateOfTravel: undefined,
            price: undefined
        },
        idAttribute: 'ID'
    });
    return Flight;
});