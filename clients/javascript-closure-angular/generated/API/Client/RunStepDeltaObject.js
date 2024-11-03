goog.provide('API.Client.RunStepDeltaObject');

/**
 * Represents a run step delta i.e. any changed fields on a run step during streaming. 
 * @record
 */
API.Client.RunStepDeltaObject = function() {}

/**
 * The identifier of the run step, which can be referenced in API endpoints.
 * @type {!string}
 * @export
 */
API.Client.RunStepDeltaObject.prototype.id;

/**
 * The object type, which is always `thread.run.step.delta`.
 * @type {!string}
 * @export
 */
API.Client.RunStepDeltaObject.prototype.object;

/**
 * @type {!API.Client.RunStepDeltaObject_delta}
 * @export
 */
API.Client.RunStepDeltaObject.prototype.delta;

/** @enum {string} */
API.Client.RunStepDeltaObject.ObjectEnum = { 
  thread.run.step.delta: 'thread.run.step.delta',
}
