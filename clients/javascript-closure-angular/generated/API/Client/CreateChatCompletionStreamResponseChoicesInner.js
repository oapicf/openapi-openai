goog.provide('API.Client.CreateChatCompletionStreamResponse_choices_inner');

/**
 * @record
 */
API.Client.CreateChatCompletionStreamResponseChoicesInner = function() {}

/**
 * @type {!API.Client.ChatCompletionStreamResponseDelta}
 * @export
 */
API.Client.CreateChatCompletionStreamResponseChoicesInner.prototype.delta;

/**
 * @type {!API.Client.CreateChatCompletionResponse_choices_inner_logprobs}
 * @export
 */
API.Client.CreateChatCompletionStreamResponseChoicesInner.prototype.logprobs;

/**
 * The reason the model stopped generating tokens. This will be `stop` if the model hit a natural stop point or a provided stop sequence, `length` if the maximum number of tokens specified in the request was reached, `content_filter` if content was omitted due to a flag from our content filters, `tool_calls` if the model called a tool, or `function_call` (deprecated) if the model called a function. 
 * @type {!string}
 * @export
 */
API.Client.CreateChatCompletionStreamResponseChoicesInner.prototype.finishReason;

/**
 * The index of the choice in the list of choices.
 * @type {!number}
 * @export
 */
API.Client.CreateChatCompletionStreamResponseChoicesInner.prototype.index;

/** @enum {string} */
API.Client.CreateChatCompletionStreamResponseChoicesInner.FinishReasonEnum = { 
  stop: 'stop',
  length: 'length',
  tool_calls: 'tool_calls',
  content_filter: 'content_filter',
  function_call: 'function_call',
}
