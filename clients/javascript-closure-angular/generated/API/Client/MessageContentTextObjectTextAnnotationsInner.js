goog.provide('API.Client.MessageContentTextObject_text_annotations_inner');

/**
 * @record
 */
API.Client.MessageContentTextObjectTextAnnotationsInner = function() {}

/**
 * Always `file_citation`.
 * @type {!string}
 * @export
 */
API.Client.MessageContentTextObjectTextAnnotationsInner.prototype.type;

/**
 * The text in the message content that needs to be replaced.
 * @type {!string}
 * @export
 */
API.Client.MessageContentTextObjectTextAnnotationsInner.prototype.text;

/**
 * @type {!API.Client.MessageContentTextAnnotationsFileCitationObject_file_citation}
 * @export
 */
API.Client.MessageContentTextObjectTextAnnotationsInner.prototype.fileCitation;

/**
 * @type {!number}
 * @export
 */
API.Client.MessageContentTextObjectTextAnnotationsInner.prototype.startIndex;

/**
 * @type {!number}
 * @export
 */
API.Client.MessageContentTextObjectTextAnnotationsInner.prototype.endIndex;

/**
 * @type {!API.Client.MessageContentTextAnnotationsFilePathObject_file_path}
 * @export
 */
API.Client.MessageContentTextObjectTextAnnotationsInner.prototype.filePath;

/** @enum {string} */
API.Client.MessageContentTextObjectTextAnnotationsInner.TypeEnum = { 
  file_citation: 'file_citation',
  file_path: 'file_path',
}
