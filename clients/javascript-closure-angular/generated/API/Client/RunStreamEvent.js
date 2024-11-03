goog.provide('API.Client.RunStreamEvent');

/**
 * @record
 */
API.Client.RunStreamEvent = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.RunStreamEvent.prototype.event;

/**
 * @type {!API.Client.RunObject}
 * @export
 */
API.Client.RunStreamEvent.prototype.data;

/** @enum {string} */
API.Client.RunStreamEvent.EventEnum = { 
  thread.run.expired: 'thread.run.expired',
}
