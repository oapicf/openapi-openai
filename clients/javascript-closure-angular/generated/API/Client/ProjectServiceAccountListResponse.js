goog.provide('API.Client.ProjectServiceAccountListResponse');

/**
 * @record
 */
API.Client.ProjectServiceAccountListResponse = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.ProjectServiceAccountListResponse.prototype.object;

/**
 * @type {!Array<!API.Client.ProjectServiceAccount>}
 * @export
 */
API.Client.ProjectServiceAccountListResponse.prototype.data;

/**
 * @type {!string}
 * @export
 */
API.Client.ProjectServiceAccountListResponse.prototype.firstId;

/**
 * @type {!string}
 * @export
 */
API.Client.ProjectServiceAccountListResponse.prototype.lastId;

/**
 * @type {!boolean}
 * @export
 */
API.Client.ProjectServiceAccountListResponse.prototype.hasMore;

/** @enum {string} */
API.Client.ProjectServiceAccountListResponse.ObjectEnum = { 
  list: 'list',
}
