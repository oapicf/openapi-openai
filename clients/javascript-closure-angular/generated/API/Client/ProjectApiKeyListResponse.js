goog.provide('API.Client.ProjectApiKeyListResponse');

/**
 * @record
 */
API.Client.ProjectApiKeyListResponse = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.ProjectApiKeyListResponse.prototype.object;

/**
 * @type {!Array<!API.Client.ProjectApiKey>}
 * @export
 */
API.Client.ProjectApiKeyListResponse.prototype.data;

/**
 * @type {!string}
 * @export
 */
API.Client.ProjectApiKeyListResponse.prototype.firstId;

/**
 * @type {!string}
 * @export
 */
API.Client.ProjectApiKeyListResponse.prototype.lastId;

/**
 * @type {!boolean}
 * @export
 */
API.Client.ProjectApiKeyListResponse.prototype.hasMore;

/** @enum {string} */
API.Client.ProjectApiKeyListResponse.ObjectEnum = { 
  list: 'list',
}
