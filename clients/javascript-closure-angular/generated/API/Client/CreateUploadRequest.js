goog.provide('API.Client.CreateUploadRequest');

/**
 * @record
 */
API.Client.CreateUploadRequest = function() {}

/**
 * The name of the file to upload. 
 * @type {!string}
 * @export
 */
API.Client.CreateUploadRequest.prototype.filename;

/**
 * The intended purpose of the uploaded file.  See the [documentation on File purposes](/docs/api-reference/files/create#files-create-purpose). 
 * @type {!string}
 * @export
 */
API.Client.CreateUploadRequest.prototype.purpose;

/**
 * The number of bytes in the file you are uploading. 
 * @type {!number}
 * @export
 */
API.Client.CreateUploadRequest.prototype.bytes;

/**
 * The MIME type of the file.  This must fall within the supported MIME types for your file purpose. See the supported MIME types for assistants and vision. 
 * @type {!string}
 * @export
 */
API.Client.CreateUploadRequest.prototype.mimeType;

/** @enum {string} */
API.Client.CreateUploadRequest.PurposeEnum = { 
  assistants: 'assistants',
  batch: 'batch',
  fine-tune: 'fine-tune',
  vision: 'vision',
}
