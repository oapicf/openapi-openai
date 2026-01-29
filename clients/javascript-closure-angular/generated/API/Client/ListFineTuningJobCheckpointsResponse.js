goog.provide('API.Client.ListFineTuningJobCheckpointsResponse');

/**
 * @record
 */
API.Client.ListFineTuningJobCheckpointsResponse = function() {}

/**
 * @type {!Array<!API.Client.FineTuningJobCheckpoint>}
 * @export
 */
API.Client.ListFineTuningJobCheckpointsResponse.prototype.data;

/**
 * @type {!string}
 * @export
 */
API.Client.ListFineTuningJobCheckpointsResponse.prototype.object;

/**
 * @type {!string}
 * @export
 */
API.Client.ListFineTuningJobCheckpointsResponse.prototype.firstId;

/**
 * @type {!string}
 * @export
 */
API.Client.ListFineTuningJobCheckpointsResponse.prototype.lastId;

/**
 * @type {!boolean}
 * @export
 */
API.Client.ListFineTuningJobCheckpointsResponse.prototype.hasMore;

/** @enum {string} */
API.Client.ListFineTuningJobCheckpointsResponse.ObjectEnum = { 
  list: 'list',
}
