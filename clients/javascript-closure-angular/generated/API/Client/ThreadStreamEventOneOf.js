goog.provide('API.Client.ThreadStreamEvent_oneOf');

/**
 * Occurs when a new [thread](/docs/api-reference/threads/object) is created.
 * @record
 */
API.Client.ThreadStreamEventOneOf = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.ThreadStreamEventOneOf.prototype.event;

/**
 * @type {!API.Client.ThreadObject}
 * @export
 */
API.Client.ThreadStreamEventOneOf.prototype.data;

/** @enum {string} */
API.Client.ThreadStreamEventOneOf.EventEnum = { 
  thread.created: 'thread.created',
}
