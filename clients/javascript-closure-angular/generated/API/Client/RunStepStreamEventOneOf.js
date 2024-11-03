goog.provide('API.Client.RunStepStreamEvent_oneOf');

/**
 * Occurs when a [run step](/docs/api-reference/runs/step-object) is created.
 * @record
 */
API.Client.RunStepStreamEventOneOf = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.RunStepStreamEventOneOf.prototype.event;

/**
 * @type {!API.Client.RunStepObject}
 * @export
 */
API.Client.RunStepStreamEventOneOf.prototype.data;

/** @enum {string} */
API.Client.RunStepStreamEventOneOf.EventEnum = { 
  thread.run.step.created: 'thread.run.step.created',
}
