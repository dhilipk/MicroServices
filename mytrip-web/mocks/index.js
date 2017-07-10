'use strict';

var mockery = require('mockery');

module.exports.enableMocks = function () {
    mockery.enable({
        warnOnReplace: false,
        warnOnUnregistered: false,
        useCleanCache: true
    });
}

module.exports.configureMocks = function (conf) {
    var Mocks = module.exports;
    if (conf) {
        Mocks.enableMocks();
        Object.keys(conf).forEach(function (key) {
            if (conf[key] === true) {
                if (Mocks['createMock' + key]) {
                    Mocks['createMock' + key]();
                }
            }
        });
    }
};