goog.provide('API.Client.MessageDeltaContentTextAnnotationsFilePathObject');

/**
 * A URL for the file that's generated when the assistant used the `code_interpreter` tool to generate a file.
 * @record
 */
API.Client.MessageDeltaContentTextAnnotationsFilePathObject = function() {}

/**
 * The index of the annotation in the text content part.
 * @type {!number}
 * @export
 */
API.Client.MessageDeltaContentTextAnnotationsFilePathObject.prototype.index;

/**
 * Always `file_path`.
 * @type {!string}
 * @export
 */
API.Client.MessageDeltaContentTextAnnotationsFilePathObject.prototype.type;

/**
 * The text in the message content that needs to be replaced.
 * @type {!string}
 * @export
 */
API.Client.MessageDeltaContentTextAnnotationsFilePathObject.prototype.text;

/**
 * @type {!API.Client.MessageDeltaContentTextAnnotationsFilePathObject_file_path}
 * @export
 */
API.Client.MessageDeltaContentTextAnnotationsFilePathObject.prototype.filePath;

/**
 * @type {!number}
 * @export
 */
API.Client.MessageDeltaContentTextAnnotationsFilePathObject.prototype.startIndex;

/**
 * @type {!number}
 * @export
 */
API.Client.MessageDeltaContentTextAnnotationsFilePathObject.prototype.endIndex;

/** @enum {string} */
API.Client.MessageDeltaContentTextAnnotationsFilePathObject.TypeEnum = { 
  file_path: 'file_path',
}
