goog.provide('API.Client.ProjectRateLimitListResponse');

/**
 * @record
 */
API.Client.ProjectRateLimitListResponse = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.ProjectRateLimitListResponse.prototype.object;

/**
 * @type {!Array<!API.Client.ProjectRateLimit>}
 * @export
 */
API.Client.ProjectRateLimitListResponse.prototype.data;

/**
 * @type {!string}
 * @export
 */
API.Client.ProjectRateLimitListResponse.prototype.firstId;

/**
 * @type {!string}
 * @export
 */
API.Client.ProjectRateLimitListResponse.prototype.lastId;

/**
 * @type {!boolean}
 * @export
 */
API.Client.ProjectRateLimitListResponse.prototype.hasMore;

/** @enum {string} */
API.Client.ProjectRateLimitListResponse.ObjectEnum = { 
  list: 'list',
}
