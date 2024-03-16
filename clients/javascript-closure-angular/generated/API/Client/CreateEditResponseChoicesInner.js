goog.provide('API.Client.CreateEditResponse_choices_inner');

/**
 * @record
 */
API.Client.CreateEditResponseChoicesInner = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.CreateEditResponseChoicesInner.prototype.text;

/**
 * @type {!number}
 * @export
 */
API.Client.CreateEditResponseChoicesInner.prototype.index;

/**
 * @type {!API.Client.CreateCompletionResponse_choices_inner_logprobs}
 * @export
 */
API.Client.CreateEditResponseChoicesInner.prototype.logprobs;

/**
 * @type {!string}
 * @export
 */
API.Client.CreateEditResponseChoicesInner.prototype.finishReason;

/** @enum {string} */
API.Client.CreateEditResponseChoicesInner.FinishReasonEnum = { 
  stop: 'stop',
  length: 'length',
}
