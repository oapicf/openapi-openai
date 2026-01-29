goog.provide('API.Client.RunStreamEvent_oneOf_5');

/**
 * Occurs when a [run](/docs/api-reference/runs/object) fails.
 * @record
 */
API.Client.RunStreamEventOneOf5 = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.RunStreamEventOneOf5.prototype.event;

/**
 * @type {!API.Client.RunObject}
 * @export
 */
API.Client.RunStreamEventOneOf5.prototype.data;

/** @enum {string} */
API.Client.RunStreamEventOneOf5.EventEnum = { 
  thread.run.failed: 'thread.run.failed',
}
