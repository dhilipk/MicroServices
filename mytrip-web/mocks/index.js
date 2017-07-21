'use strict';

var mockery = require('mockery'),
    SupportServiceMock = require('./support-service'),
    SearchServiceMock = require('./search-service'),
    TravelScheduleServiceMock = require('./travel-schedule-service');

module.exports.enableMocks = function () {
    mockery.enable({
        warnOnReplace: false,
        warnOnUnregistered: false,
        useCleanCache: true
    });
}

module.exports.mockForSupportService = function() {
    mockery.registerMock('../../lib/client-interaction/support-service-wrapper', SupportServiceMock);
}

module.exports.mockForSearchService = function() {
    mockery.registerMock('../../lib/client-interaction/search-service-wrapper', SearchServiceMock);
}

module.exports.mockForTravelScheduleService = function() {
    mockery.registerMock('../../lib/client-interaction/travel-schedule-service-wrapper', TravelScheduleServiceMock);
}

module.exports.configureMocks = function (conf) {
    var Mocks = module.exports;
    if (conf) {
        Mocks.enableMocks();
        Object.keys(conf).forEach(function (key) {
            if (conf[key] === true) {
                if (Mocks['mockFor' + key]) {
                    Mocks['mockFor' + key]();
                }
            }
        });
    }
};