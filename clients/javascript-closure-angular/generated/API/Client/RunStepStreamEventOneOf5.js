goog.provide('API.Client.RunStepStreamEvent_oneOf_5');

/**
 * Occurs when a [run step](/docs/api-reference/runs/step-object) is cancelled.
 * @record
 */
API.Client.RunStepStreamEventOneOf5 = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.RunStepStreamEventOneOf5.prototype.event;

/**
 * @type {!API.Client.RunStepObject}
 * @export
 */
API.Client.RunStepStreamEventOneOf5.prototype.data;

/** @enum {string} */
API.Client.RunStepStreamEventOneOf5.EventEnum = { 
  thread.run.step.cancelled: 'thread.run.step.cancelled',
}
