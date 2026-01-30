goog.provide('API.Client.CreateChatCompletionResponse_choices_inner_logprobs');

/**
 * Log probability information for the choice.
 * @record
 */
API.Client.CreateChatCompletionResponseChoicesInnerLogprobs = function() {}

/**
 * A list of message content tokens with log probability information.
 * @type {!Array<!API.Client.ChatCompletionTokenLogprob>}
 * @export
 */
API.Client.CreateChatCompletionResponseChoicesInnerLogprobs.prototype.content;

/**
 * A list of message refusal tokens with log probability information.
 * @type {!Array<!API.Client.ChatCompletionTokenLogprob>}
 * @export
 */
API.Client.CreateChatCompletionResponseChoicesInnerLogprobs.prototype.refusal;

