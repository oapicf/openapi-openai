goog.provide('API.Client.ListFineTuningJobEventsResponse');

/**
 * @record
 */
API.Client.ListFineTuningJobEventsResponse = function() {}

/**
 * @type {!Array<!API.Client.FineTuningJobEvent>}
 * @export
 */
API.Client.ListFineTuningJobEventsResponse.prototype.data;

/**
 * @type {!string}
 * @export
 */
API.Client.ListFineTuningJobEventsResponse.prototype.object;

/** @enum {string} */
API.Client.ListFineTuningJobEventsResponse.ObjectEnum = { 
  list: 'list',
}
