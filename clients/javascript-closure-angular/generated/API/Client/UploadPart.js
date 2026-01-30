goog.provide('API.Client.UploadPart');

/**
 * The upload Part represents a chunk of bytes we can add to an Upload object. 
 * @record
 */
API.Client.UploadPart = function() {}

/**
 * The upload Part unique identifier, which can be referenced in API endpoints.
 * @type {!string}
 * @export
 */
API.Client.UploadPart.prototype.id;

/**
 * The Unix timestamp (in seconds) for when the Part was created.
 * @type {!number}
 * @export
 */
API.Client.UploadPart.prototype.createdAt;

/**
 * The ID of the Upload object that this Part was added to.
 * @type {!string}
 * @export
 */
API.Client.UploadPart.prototype.uploadId;

/**
 * The object type, which is always `upload.part`.
 * @type {!string}
 * @export
 */
API.Client.UploadPart.prototype.object;

/** @enum {string} */
API.Client.UploadPart.ObjectEnum = { 
  upload.part: 'upload.part',
}
