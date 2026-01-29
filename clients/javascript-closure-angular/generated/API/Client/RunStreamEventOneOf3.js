goog.provide('API.Client.RunStreamEvent_oneOf_3');

/**
 * Occurs when a [run](/docs/api-reference/runs/object) moves to a `requires_action` status.
 * @record
 */
API.Client.RunStreamEventOneOf3 = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.RunStreamEventOneOf3.prototype.event;

/**
 * @type {!API.Client.RunObject}
 * @export
 */
API.Client.RunStreamEventOneOf3.prototype.data;

/** @enum {string} */
API.Client.RunStreamEventOneOf3.EventEnum = { 
  thread.run.requires_action: 'thread.run.requires_action',
}
