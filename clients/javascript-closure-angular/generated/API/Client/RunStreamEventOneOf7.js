goog.provide('API.Client.RunStreamEvent_oneOf_7');

/**
 * Occurs when a [run](/docs/api-reference/runs/object) is cancelled.
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
  thread.run.cancelled: 'thread.run.cancelled',
}
