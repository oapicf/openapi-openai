goog.provide('API.Client.RunStreamEvent_oneOf_7');

/**
 * Occurs when a [run](/docs/api-reference/runs/object) moves to a `cancelling` status.
 * @record
 */
API.Client.RunStreamEventOneOf7 = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.RunStreamEventOneOf7.prototype.event;

/**
 * @type {!API.Client.RunObject}
 * @export
 */
API.Client.RunStreamEventOneOf7.prototype.data;

/** @enum {string} */
API.Client.RunStreamEventOneOf7.EventEnum = { 
  thread.run.cancelling: 'thread.run.cancelling',
}
