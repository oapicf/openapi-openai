goog.provide('API.Client.UsageTimeBucket');

/**
 * @record
 */
API.Client.UsageTimeBucket = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.UsageTimeBucket.prototype.object;

/**
 * @type {!number}
 * @export
 */
API.Client.UsageTimeBucket.prototype.startTime;

/**
 * @type {!number}
 * @export
 */
API.Client.UsageTimeBucket.prototype.endTime;

/**
 * @type {!Array<!API.Client.UsageTimeBucket_result_inner>}
 * @export
 */
API.Client.UsageTimeBucket.prototype.result;

/** @enum {string} */
API.Client.UsageTimeBucket.ObjectEnum = { 
  bucket: 'bucket',
}
