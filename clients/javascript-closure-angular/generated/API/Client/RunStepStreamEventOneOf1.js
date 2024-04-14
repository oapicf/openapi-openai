goog.provide('API.Client.RunStepStreamEvent_oneOf_1');

/**
 * Occurs when a [run step](/docs/api-reference/runs/step-object) moves to an `in_progress` state.
 * @record
 */
API.Client.RunStepStreamEventOneOf1 = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.RunStepStreamEventOneOf1.prototype.event;

/**
 * @type {!API.Client.RunStepObject}
 * @export
 */
API.Client.RunStepStreamEventOneOf1.prototype.data;

/** @enum {string} */
API.Client.RunStepStreamEventOneOf1.EventEnum = { 
  thread.run.step.in_progress: 'thread.run.step.in_progress',
}
