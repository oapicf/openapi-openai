goog.provide('API.Client.RealtimeServerEventRateLimitsUpdated_rate_limits_inner');

/**
 * @record
 */
API.Client.RealtimeServerEventRateLimitsUpdatedRateLimitsInner = function() {}

/**
 * The name of the rate limit (`requests`, `tokens`). 
 * @type {!string}
 * @export
 */
API.Client.RealtimeServerEventRateLimitsUpdatedRateLimitsInner.prototype.name;

/**
 * The maximum allowed value for the rate limit.
 * @type {!number}
 * @export
 */
API.Client.RealtimeServerEventRateLimitsUpdatedRateLimitsInner.prototype.limit;

/**
 * The remaining value before the limit is reached.
 * @type {!number}
 * @export
 */
API.Client.RealtimeServerEventRateLimitsUpdatedRateLimitsInner.prototype.remaining;

/**
 * Seconds until the rate limit resets.
 * @type {!number}
 * @export
 */
API.Client.RealtimeServerEventRateLimitsUpdatedRateLimitsInner.prototype.resetSeconds;

/** @enum {string} */
API.Client.RealtimeServerEventRateLimitsUpdatedRateLimitsInner.NameEnum = { 
  requests: 'requests',
  tokens: 'tokens',
}
