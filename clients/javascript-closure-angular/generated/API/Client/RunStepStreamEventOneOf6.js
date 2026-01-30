goog.provide('API.Client.RunStepStreamEvent_oneOf_6');

/**
 * Occurs when a [run step](/docs/api-reference/run-steps/step-object) expires.
 * @record
 */
API.Client.RunStepStreamEventOneOf6 = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.RunStepStreamEventOneOf6.prototype.event;

/**
 * @type {!API.Client.RunStepObject}
 * @export
 */
API.Client.RunStepStreamEventOneOf6.prototype.data;

/** @enum {string} */
API.Client.RunStepStreamEventOneOf6.EventEnum = { 
  thread.run.step.expired: 'thread.run.step.expired',
}
