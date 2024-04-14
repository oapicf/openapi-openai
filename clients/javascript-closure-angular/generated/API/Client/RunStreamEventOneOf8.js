goog.provide('API.Client.RunStreamEvent_oneOf_8');

/**
 * Occurs when a [run](/docs/api-reference/runs/object) expires.
 * @record
 */
API.Client.RunStreamEventOneOf8 = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.RunStreamEventOneOf8.prototype.event;

/**
 * @type {!API.Client.RunObject}
 * @export
 */
API.Client.RunStreamEventOneOf8.prototype.data;

/** @enum {string} */
API.Client.RunStreamEventOneOf8.EventEnum = { 
  thread.run.expired: 'thread.run.expired',
}
