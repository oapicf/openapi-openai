goog.provide('API.Client.CreateChatCompletionFunctionResponse_choices_inner');

/**
 * @record
 */
API.Client.CreateChatCompletionFunctionResponseChoicesInner = function() {}

/**
 * The reason the model stopped generating tokens. This will be `stop` if the model hit a natural stop point or a provided stop sequence, `length` if the maximum number of tokens specified in the request was reached, `content_filter` if content was omitted due to a flag from our content filters, or `function_call` if the model called a function. 
 * @type {!string}
 * @export
 */
API.Client.CreateChatCompletionFunctionResponseChoicesInner.prototype.finishReason;

/**
 * The index of the choice in the list of choices.
 * @type {!number}
 * @export
 */
API.Client.CreateChatCompletionFunctionResponseChoicesInner.prototype.index;

/**
 * @type {!API.Client.ChatCompletionResponseMessage}
 * @export
 */
API.Client.CreateChatCompletionFunctionResponseChoicesInner.prototype.message;

/** @enum {string} */
API.Client.CreateChatCompletionFunctionResponseChoicesInner.FinishReasonEnum = { 
  stop: 'stop',
  length: 'length',
  function_call: 'function_call',
  content_filter: 'content_filter',
}
