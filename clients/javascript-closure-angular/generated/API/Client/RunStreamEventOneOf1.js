goog.provide('API.Client.RunStreamEvent_oneOf_1');

/**
 * Occurs when a [run](/docs/api-reference/runs/object) moves to a `queued` status.
 * @record
 */
API.Client.RunStreamEventOneOf1 = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.RunStreamEventOneOf1.prototype.event;

/**
 * @type {!API.Client.RunObject}
 * @export
 */
API.Client.RunStreamEventOneOf1.prototype.data;

/** @enum {string} */
API.Client.RunStreamEventOneOf1.EventEnum = { 
  thread.run.queued: 'thread.run.queued',
}
