goog.provide('API.Client.AdminApiKey');

/**
 * @record
 */
API.Client.AdminApiKey = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.AdminApiKey.prototype.object;

/**
 * @type {!string}
 * @export
 */
API.Client.AdminApiKey.prototype.id;

/**
 * @type {!string}
 * @export
 */
API.Client.AdminApiKey.prototype.name;

/**
 * @type {!string}
 * @export
 */
API.Client.AdminApiKey.prototype.redactedValue;

/**
 * @type {!string}
 * @export
 */
API.Client.AdminApiKey.prototype.value;

/**
 * @type {!number}
 * @export
 */
API.Client.AdminApiKey.prototype.createdAt;

/**
 * @type {!API.Client.AdminApiKey_owner}
 * @export
 */
API.Client.AdminApiKey.prototype.owner;

