goog.provide('API.Client.RunStreamEvent_oneOf_2');

/**
 * Occurs when a [run](/docs/api-reference/runs/object) moves to an `in_progress` status.
 * @record
 */
API.Client.RunStreamEventOneOf2 = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.RunStreamEventOneOf2.prototype.event;

/**
 * @type {!API.Client.RunObject}
 * @export
 */
API.Client.RunStreamEventOneOf2.prototype.data;

/** @enum {string} */
API.Client.RunStreamEventOneOf2.EventEnum = { 
  thread.run.in_progress: 'thread.run.in_progress',
}
