goog.provide('API.Client.CreateChatCompletionStreamResponse_choices_inner');

/**
 * @record
 */
API.Client.CreateChatCompletionStreamResponseChoicesInner = function() {}

/**
 * @type {!number}
 * @export
 */
API.Client.CreateChatCompletionStreamResponseChoicesInner.prototype.index;

/**
 * @type {!API.Client.ChatCompletionStreamResponseDelta}
 * @export
 */
API.Client.CreateChatCompletionStreamResponseChoicesInner.prototype.delta;

/**
 * @type {!string}
 * @export
 */
API.Client.CreateChatCompletionStreamResponseChoicesInner.prototype.finishReason;

/** @enum {string} */
API.Client.CreateChatCompletionStreamResponseChoicesInner.FinishReasonEnum = { 
  stop: 'stop',
  length: 'length',
  function_call: 'function_call',
}
