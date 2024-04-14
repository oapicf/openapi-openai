goog.provide('API.Client.RunStreamEvent_oneOf_6');

/**
 * Occurs when a [run](/docs/api-reference/runs/object) moves to a `cancelling` status.
 * @record
 */
API.Client.RunStreamEventOneOf6 = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.RunStreamEventOneOf6.prototype.event;

/**
 * @type {!API.Client.RunObject}
 * @export
 */
API.Client.RunStreamEventOneOf6.prototype.data;

/** @enum {string} */
API.Client.RunStreamEventOneOf6.EventEnum = { 
  thread.run.cancelling: 'thread.run.cancelling',
}
