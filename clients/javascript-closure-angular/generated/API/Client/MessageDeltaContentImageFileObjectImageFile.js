goog.provide('API.Client.MessageDeltaContentImageFileObject_image_file');

/**
 * @record
 */
API.Client.MessageDeltaContentImageFileObjectImageFile = function() {}

/**
 * The [File](/docs/api-reference/files) ID of the image in the message content. Set `purpose=\"vision\"` when uploading the File if you need to later display the file content.
 * @type {!string}
 * @export
 */
API.Client.MessageDeltaContentImageFileObjectImageFile.prototype.fileId;

/**
 * Specifies the detail level of the image if specified by the user. `low` uses fewer tokens, you can opt in to high resolution using `high`.
 * @type {!string}
 * @export
 */
API.Client.MessageDeltaContentImageFileObjectImageFile.prototype.detail;

/** @enum {string} */
API.Client.MessageDeltaContentImageFileObjectImageFile.DetailEnum = { 
  auto: 'auto',
  low: 'low',
  high: 'high',
}
