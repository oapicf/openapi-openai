goog.provide('API.Client.ProjectUserListResponse');

/**
 * @record
 */
API.Client.ProjectUserListResponse = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.ProjectUserListResponse.prototype.object;

/**
 * @type {!Array<!API.Client.ProjectUser>}
 * @export
 */
API.Client.ProjectUserListResponse.prototype.data;

/**
 * @type {!string}
 * @export
 */
API.Client.ProjectUserListResponse.prototype.firstId;

/**
 * @type {!string}
 * @export
 */
API.Client.ProjectUserListResponse.prototype.lastId;

/**
 * @type {!boolean}
 * @export
 */
API.Client.ProjectUserListResponse.prototype.hasMore;

