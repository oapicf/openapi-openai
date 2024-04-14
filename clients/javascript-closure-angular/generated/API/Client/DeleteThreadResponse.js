goog.provide('API.Client.DeleteThreadResponse');

/**
 * @record
 */
API.Client.DeleteThreadResponse = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.DeleteThreadResponse.prototype.id;

/**
 * @type {!boolean}
 * @export
 */
API.Client.DeleteThreadResponse.prototype.deleted;

/**
 * @type {!string}
 * @export
 */
API.Client.DeleteThreadResponse.prototype.object;

/** @enum {string} */
API.Client.DeleteThreadResponse.ObjectEnum = { 
  thread.deleted: 'thread.deleted',
}
