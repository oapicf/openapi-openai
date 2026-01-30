goog.provide('API.Client.RunStepStreamEvent_oneOf_2');

/**
 * Occurs when parts of a [run step](/docs/api-reference/run-steps/step-object) are being streamed.
 * @record
 */
API.Client.RunStepStreamEventOneOf2 = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.RunStepStreamEventOneOf2.prototype.event;

/**
 * @type {!API.Client.RunStepDeltaObject}
 * @export
 */
API.Client.RunStepStreamEventOneOf2.prototype.data;

/** @enum {string} */
API.Client.RunStepStreamEventOneOf2.EventEnum = { 
  thread.run.step.delta: 'thread.run.step.delta',
}
