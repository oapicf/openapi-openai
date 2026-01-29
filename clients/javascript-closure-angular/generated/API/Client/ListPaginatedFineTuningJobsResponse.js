goog.provide('API.Client.ListPaginatedFineTuningJobsResponse');

/**
 * @record
 */
API.Client.ListPaginatedFineTuningJobsResponse = function() {}

/**
 * @type {!Array<!API.Client.FineTuningJob>}
 * @export
 */
API.Client.ListPaginatedFineTuningJobsResponse.prototype.data;

/**
 * @type {!boolean}
 * @export
 */
API.Client.ListPaginatedFineTuningJobsResponse.prototype.hasMore;

/**
 * @type {!string}
 * @export
 */
API.Client.ListPaginatedFineTuningJobsResponse.prototype.object;

/** @enum {string} */
API.Client.ListPaginatedFineTuningJobsResponse.ObjectEnum = { 
  list: 'list',
}
