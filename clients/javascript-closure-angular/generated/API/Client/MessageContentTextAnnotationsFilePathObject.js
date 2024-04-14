goog.provide('API.Client.MessageContentTextAnnotationsFilePathObject');

/**
 * A URL for the file that's generated when the assistant used the `code_interpreter` tool to generate a file.
 * @record
 */
API.Client.MessageContentTextAnnotationsFilePathObject = function() {}

/**
 * Always `file_path`.
 * @type {!string}
 * @export
 */
API.Client.MessageContentTextAnnotationsFilePathObject.prototype.type;

/**
 * The text in the message content that needs to be replaced.
 * @type {!string}
 * @export
 */
API.Client.MessageContentTextAnnotationsFilePathObject.prototype.text;

/**
 * @type {!API.Client.MessageContentTextAnnotationsFilePathObject_file_path}
 * @export
 */
API.Client.MessageContentTextAnnotationsFilePathObject.prototype.filePath;

/**
 * @type {!number}
 * @export
 */
API.Client.MessageContentTextAnnotationsFilePathObject.prototype.startIndex;

/**
 * @type {!number}
 * @export
 */
API.Client.MessageContentTextAnnotationsFilePathObject.prototype.endIndex;

/** @enum {string} */
API.Client.MessageContentTextAnnotationsFilePathObject.TypeEnum = { 
  file_path: 'file_path',
}
