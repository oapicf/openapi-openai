goog.provide('API.Client.RunStepStreamEvent');

/**
 * @record
 */
API.Client.RunStepStreamEvent = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.RunStepStreamEvent.prototype.event;

/**
 * @type {!API.Client.RunStepObject}
 * @export
 */
API.Client.RunStepStreamEvent.prototype.data;

/** @enum {string} */
API.Client.RunStepStreamEvent.EventEnum = { 
  thread.run.step.expired: 'thread.run.step.expired',
}
