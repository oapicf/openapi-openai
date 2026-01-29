goog.provide('API.Client.CreateCompletionResponse_choices_inner');

/**
 * @record
 */
API.Client.CreateCompletionResponseChoicesInner = function() {}

/**
 * The reason the model stopped generating tokens. This will be `stop` if the model hit a natural stop point or a provided stop sequence, `length` if the maximum number of tokens specified in the request was reached, or `content_filter` if content was omitted due to a flag from our content filters. 
 * @type {!string}
 * @export
 */
API.Client.CreateCompletionResponseChoicesInner.prototype.finishReason;

/**
 * @type {!number}
 * @export
 */
API.Client.CreateCompletionResponseChoicesInner.prototype.index;

/**
 * @type {!API.Client.CreateCompletionResponse_choices_inner_logprobs}
 * @export
 */
API.Client.CreateCompletionResponseChoicesInner.prototype.logprobs;

/**
 * @type {!string}
 * @export
 */
API.Client.CreateCompletionResponseChoicesInner.prototype.text;

/** @enum {string} */
API.Client.CreateCompletionResponseChoicesInner.FinishReasonEnum = { 
  stop: 'stop',
  length: 'length',
  content_filter: 'content_filter',
}
