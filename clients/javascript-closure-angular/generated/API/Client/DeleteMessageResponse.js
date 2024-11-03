goog.provide('API.Client.DeleteMessageResponse');

/**
 * @record
 */
API.Client.DeleteMessageResponse = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.DeleteMessageResponse.prototype.id;

/**
 * @type {!boolean}
 * @export
 */
API.Client.DeleteMessageResponse.prototype.deleted;

/**
 * @type {!string}
 * @export
 */
API.Client.DeleteMessageResponse.prototype.object;

/** @enum {string} */
API.Client.DeleteMessageResponse.ObjectEnum = { 
  thread.message.deleted: 'thread.message.deleted',
}
