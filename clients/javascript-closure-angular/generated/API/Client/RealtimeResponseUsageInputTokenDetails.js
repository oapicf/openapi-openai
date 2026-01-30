goog.provide('API.Client.RealtimeResponse_usage_input_token_details');

/**
 * Details about the input tokens used in the Response.
 * @record
 */
API.Client.RealtimeResponseUsageInputTokenDetails = function() {}

/**
 * The number of cached tokens used in the Response.
 * @type {!number}
 * @export
 */
API.Client.RealtimeResponseUsageInputTokenDetails.prototype.cachedTokens;

/**
 * The number of text tokens used in the Response.
 * @type {!number}
 * @export
 */
API.Client.RealtimeResponseUsageInputTokenDetails.prototype.textTokens;

/**
 * The number of audio tokens used in the Response.
 * @type {!number}
 * @export
 */
API.Client.RealtimeResponseUsageInputTokenDetails.prototype.audioTokens;

