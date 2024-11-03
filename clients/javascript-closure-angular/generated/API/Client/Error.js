goog.provide('API.Client.Error');

/**
 * @record
 */
API.Client.Error = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.Error.prototype.code;

/**
 * @type {!string}
 * @export
 */
API.Client.Error.prototype.message;

/**
 * @type {!string}
 * @export
 */
API.Client.Error.prototype.param;

/**
 * @type {!string}
 * @export
 */
API.Client.Error.prototype.type;

