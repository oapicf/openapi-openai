goog.provide('API.Client.RunStreamEvent_oneOf_4');

/**
 * Occurs when a [run](/docs/api-reference/runs/object) is completed.
 * @record
 */
API.Client.RunStreamEventOneOf4 = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.RunStreamEventOneOf4.prototype.event;

/**
 * @type {!API.Client.RunObject}
 * @export
 */
API.Client.RunStreamEventOneOf4.prototype.data;

/** @enum {string} */
API.Client.RunStreamEventOneOf4.EventEnum = { 
  thread.run.completed: 'thread.run.completed',
}
