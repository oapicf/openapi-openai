goog.provide('API.Client.ProjectListResponse');

/**
 * @record
 */
API.Client.ProjectListResponse = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.ProjectListResponse.prototype.object;

/**
 * @type {!Array<!API.Client.Project>}
 * @export
 */
API.Client.ProjectListResponse.prototype.data;

/**
 * @type {!string}
 * @export
 */
API.Client.ProjectListResponse.prototype.firstId;

/**
 * @type {!string}
 * @export
 */
API.Client.ProjectListResponse.prototype.lastId;

/**
 * @type {!boolean}
 * @export
 */
API.Client.ProjectListResponse.prototype.hasMore;

/** @enum {string} */
API.Client.ProjectListResponse.ObjectEnum = { 
  list: 'list',
}
