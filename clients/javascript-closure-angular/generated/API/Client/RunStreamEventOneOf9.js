goog.provide('API.Client.RunStreamEvent_oneOf_9');

/**
 * Occurs when a [run](/docs/api-reference/runs/object) expires.
 * @record
 */
API.Client.RunStreamEventOneOf9 = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.RunStreamEventOneOf9.prototype.event;

/**
 * @type {!API.Client.RunObject}
 * @export
 */
API.Client.RunStreamEventOneOf9.prototype.data;

/** @enum {string} */
API.Client.RunStreamEventOneOf9.EventEnum = { 
  thread.run.expired: 'thread.run.expired',
}
