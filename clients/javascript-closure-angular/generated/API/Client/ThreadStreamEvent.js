goog.provide('API.Client.ThreadStreamEvent');

/**
 * Occurs when a new [thread](/docs/api-reference/threads/object) is created.
 * @record
 */
API.Client.ThreadStreamEvent = function() {}

/**
 * Whether to enable input audio transcription.
 * @type {!boolean}
 * @export
 */
API.Client.ThreadStreamEvent.prototype.enabled;

/**
 * @type {!string}
 * @export
 */
API.Client.ThreadStreamEvent.prototype.event;

/**
 * @type {!API.Client.ThreadObject}
 * @export
 */
API.Client.ThreadStreamEvent.prototype.data;

/** @enum {string} */
API.Client.ThreadStreamEvent.EventEnum = { 
  thread.created: 'thread.created',
}
