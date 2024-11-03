goog.provide('API.Client.RunStreamEvent_oneOf');

/**
 * Occurs when a new [run](/docs/api-reference/runs/object) is created.
 * @record
 */
API.Client.RunStreamEventOneOf = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.RunStreamEventOneOf.prototype.event;

/**
 * @type {!API.Client.RunObject}
 * @export
 */
API.Client.RunStreamEventOneOf.prototype.data;

/** @enum {string} */
API.Client.RunStreamEventOneOf.EventEnum = { 
  thread.run.created: 'thread.run.created',
}
