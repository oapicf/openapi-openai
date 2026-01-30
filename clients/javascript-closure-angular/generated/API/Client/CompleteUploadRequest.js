goog.provide('API.Client.CompleteUploadRequest');

/**
 * @record
 */
API.Client.CompleteUploadRequest = function() {}

/**
 * The ordered list of Part IDs. 
 * @type {!Array<!string>}
 * @export
 */
API.Client.CompleteUploadRequest.prototype.partIds;

/**
 * The optional md5 checksum for the file contents to verify if the bytes uploaded matches what you expect. 
 * @type {!string}
 * @export
 */
API.Client.CompleteUploadRequest.prototype.md5;

