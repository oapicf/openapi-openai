goog.provide('API.Client.UserListResponse');

/**
 * @record
 */
API.Client.UserListResponse = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.UserListResponse.prototype.object;

/**
 * @type {!Array<!API.Client.User>}
 * @export
 */
API.Client.UserListResponse.prototype.data;

/**
 * @type {!string}
 * @export
 */
API.Client.UserListResponse.prototype.firstId;

/**
 * @type {!string}
 * @export
 */
API.Client.UserListResponse.prototype.lastId;

/**
 * @type {!boolean}
 * @export
 */
API.Client.UserListResponse.prototype.hasMore;

/** @enum {string} */
API.Client.UserListResponse.ObjectEnum = { 
  list: 'list',
}
