goog.provide('API.Client.RealtimeResponse_usage');

/**
 * Usage statistics for the Response, this will correspond to billing. A  Realtime API session will maintain a conversation context and append new  Items to the Conversation, thus output from previous turns (text and  audio tokens) will become the input for later turns. 
 * @record
 */
API.Client.RealtimeResponseUsage = function() {}

/**
 * The total number of tokens in the Response including input and output  text and audio tokens. 
 * @type {!number}
 * @export
 */
API.Client.RealtimeResponseUsage.prototype.totalTokens;

/**
 * The number of input tokens used in the Response, including text and  audio tokens. 
 * @type {!number}
 * @export
 */
API.Client.RealtimeResponseUsage.prototype.inputTokens;

/**
 * The number of output tokens sent in the Response, including text and  audio tokens. 
 * @type {!number}
 * @export
 */
API.Client.RealtimeResponseUsage.prototype.outputTokens;

/**
 * @type {!API.Client.RealtimeResponse_usage_input_token_details}
 * @export
 */
API.Client.RealtimeResponseUsage.prototype.inputTokenDetails;

/**
 * @type {!API.Client.RealtimeResponse_usage_output_token_details}
 * @export
 */
API.Client.RealtimeResponseUsage.prototype.outputTokenDetails;

