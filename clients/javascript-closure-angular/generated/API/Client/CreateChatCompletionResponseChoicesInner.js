goog.provide('API.Client.CreateChatCompletionResponse_choices_inner');

/**
 * @record
 */
API.Client.CreateChatCompletionResponseChoicesInner = function() {}

/**
 * @type {!number}
 * @export
 */
API.Client.CreateChatCompletionResponseChoicesInner.prototype.index;

/**
 * @type {!API.Client.ChatCompletionResponseMessage}
 * @export
 */
API.Client.CreateChatCompletionResponseChoicesInner.prototype.message;

/**
 * @type {!string}
 * @export
 */
API.Client.CreateChatCompletionResponseChoicesInner.prototype.finishReason;

/** @enum {string} */
API.Client.CreateChatCompletionResponseChoicesInner.FinishReasonEnum = { 
  stop: 'stop',
  length: 'length',
  function_call: 'function_call',
}
