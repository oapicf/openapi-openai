goog.provide('API.Client.RunStepStreamEvent_oneOf_4');

/**
 * Occurs when a [run step](/docs/api-reference/run-steps/step-object) fails.
 * @record
 */
API.Client.RunStepStreamEventOneOf4 = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.RunStepStreamEventOneOf4.prototype.event;

/**
 * @type {!API.Client.RunStepObject}
 * @export
 */
API.Client.RunStepStreamEventOneOf4.prototype.data;

/** @enum {string} */
API.Client.RunStepStreamEventOneOf4.EventEnum = { 
  thread.run.step.failed: 'thread.run.step.failed',
}
