goog.provide('API.Client.CreateCompletionResponse_choices_inner');

/**
 * @record
 */
API.Client.CreateCompletionResponseChoicesInner = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.CreateCompletionResponseChoicesInner.prototype.text;

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
API.Client.CreateCompletionResponseChoicesInner.prototype.finishReason;

/** @enum {string} */
API.Client.CreateCompletionResponseChoicesInner.FinishReasonEnum = { 
  stop: 'stop',
  length: 'length',
}
