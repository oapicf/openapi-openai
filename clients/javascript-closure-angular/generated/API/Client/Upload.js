goog.provide('API.Client.Upload');

/**
 * The Upload object can accept byte chunks in the form of Parts. 
 * @record
 */
API.Client.Upload = function() {}

/**
 * The Upload unique identifier, which can be referenced in API endpoints.
 * @type {!string}
 * @export
 */
API.Client.Upload.prototype.id;

/**
 * The Unix timestamp (in seconds) for when the Upload was created.
 * @type {!number}
 * @export
 */
API.Client.Upload.prototype.createdAt;

/**
 * The name of the file to be uploaded.
 * @type {!string}
 * @export
 */
API.Client.Upload.prototype.filename;

/**
 * The intended number of bytes to be uploaded.
 * @type {!number}
 * @export
 */
API.Client.Upload.prototype.bytes;

/**
 * The intended purpose of the file. [Please refer here](/docs/api-reference/files/object#files/object-purpose) for acceptable values.
 * @type {!string}
 * @export
 */
API.Client.Upload.prototype.purpose;

/**
 * The status of the Upload.
 * @type {!string}
 * @export
 */
API.Client.Upload.prototype.status;

/**
 * The Unix timestamp (in seconds) for when the Upload was created.
 * @type {!number}
 * @export
 */
API.Client.Upload.prototype.expiresAt;

/**
 * The object type, which is always \"upload\".
 * @type {!string}
 * @export
 */
API.Client.Upload.prototype.object;

/**
 * @type {!API.Client.OpenAIFile}
 * @export
 */
API.Client.Upload.prototype.file;

/** @enum {string} */
API.Client.Upload.StatusEnum = { 
  pending: 'pending',
  completed: 'completed',
  cancelled: 'cancelled',
  expired: 'expired',
}
/** @enum {string} */
API.Client.Upload.ObjectEnum = { 
  upload: 'upload',
}
