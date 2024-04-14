goog.provide('API.Client.DeleteFileResponse');

/**
 * @record
 */
API.Client.DeleteFileResponse = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.DeleteFileResponse.prototype.id;

/**
 * @type {!string}
 * @export
 */
API.Client.DeleteFileResponse.prototype.object;

/**
 * @type {!boolean}
 * @export
 */
API.Client.DeleteFileResponse.prototype.deleted;

/** @enum {string} */
API.Client.DeleteFileResponse.ObjectEnum = { 
  file: 'file',
}
