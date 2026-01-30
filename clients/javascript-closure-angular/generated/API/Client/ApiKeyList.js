goog.provide('API.Client.ApiKeyList');

/**
 * @record
 */
API.Client.ApiKeyList = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.ApiKeyList.prototype.object;

/**
 * @type {!Array<!API.Client.AdminApiKey>}
 * @export
 */
API.Client.ApiKeyList.prototype.data;

/**
 * @type {!boolean}
 * @export
 */
API.Client.ApiKeyList.prototype.hasMore;

/**
 * @type {!string}
 * @export
 */
API.Client.ApiKeyList.prototype.firstId;

/**
 * @type {!string}
 * @export
 */
API.Client.ApiKeyList.prototype.lastId;

