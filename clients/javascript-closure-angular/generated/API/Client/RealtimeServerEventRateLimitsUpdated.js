goog.provide('API.Client.RealtimeServerEventRateLimitsUpdated');

/**
 * Emitted at the beginning of a Response to indicate the updated rate limits.  When a Response is created some tokens will be \"reserved\" for the output  tokens, the rate limits shown here reflect that reservation, which is then  adjusted accordingly once the Response is completed. 
 * @record
 */
API.Client.RealtimeServerEventRateLimitsUpdated = function() {}

/**
 * The unique ID of the server event.
 * @type {!string}
 * @export
 */
API.Client.RealtimeServerEventRateLimitsUpdated.prototype.eventId;

/**
 * The event type, must be `rate_limits.updated`.
 * @type {!string}
 * @export
 */
API.Client.RealtimeServerEventRateLimitsUpdated.prototype.type;

/**
 * List of rate limit information.
 * @type {!Array<!API.Client.RealtimeServerEventRateLimitsUpdated_rate_limits_inner>}
 * @export
 */
API.Client.RealtimeServerEventRateLimitsUpdated.prototype.rateLimits;

/** @enum {string} */
API.Client.RealtimeServerEventRateLimitsUpdated.TypeEnum = { 
  rate_limits.updated: 'rate_limits.updated',
}
