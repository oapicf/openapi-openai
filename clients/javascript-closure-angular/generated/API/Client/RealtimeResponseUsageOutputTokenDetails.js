goog.provide('API.Client.RealtimeResponse_usage_output_token_details');

/**
 * Details about the output tokens used in the Response.
 * @record
 */
API.Client.RealtimeResponseUsageOutputTokenDetails = function() {}

/**
 * The number of text tokens used in the Response.
 * @type {!number}
 * @export
 */
API.Client.RealtimeResponseUsageOutputTokenDetails.prototype.textTokens;

/**
 * The number of audio tokens used in the Response.
 * @type {!number}
 * @export
 */
API.Client.RealtimeResponseUsageOutputTokenDetails.prototype.audioTokens;

