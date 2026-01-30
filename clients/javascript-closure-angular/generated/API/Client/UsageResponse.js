goog.provide('API.Client.UsageResponse');

/**
 * @record
 */
API.Client.UsageResponse = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.UsageResponse.prototype.object;

/**
 * @type {!Array<!API.Client.UsageTimeBucket>}
 * @export
 */
API.Client.UsageResponse.prototype.data;

/**
 * @type {!boolean}
 * @export
 */
API.Client.UsageResponse.prototype.hasMore;

/**
 * @type {!string}
 * @export
 */
API.Client.UsageResponse.prototype.nextPage;

/** @enum {string} */
API.Client.UsageResponse.ObjectEnum = { 
  page: 'page',
}
