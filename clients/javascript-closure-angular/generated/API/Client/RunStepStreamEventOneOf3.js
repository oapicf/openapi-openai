goog.provide('API.Client.RunStepStreamEvent_oneOf_3');

/**
 * Occurs when a [run step](/docs/api-reference/runs/step-object) is completed.
 * @record
 */
API.Client.RunStepStreamEventOneOf3 = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.RunStepStreamEventOneOf3.prototype.event;

/**
 * @type {!API.Client.RunStepObject}
 * @export
 */
API.Client.RunStepStreamEventOneOf3.prototype.data;

/** @enum {string} */
API.Client.RunStepStreamEventOneOf3.EventEnum = { 
  thread.run.step.completed: 'thread.run.step.completed',
}
