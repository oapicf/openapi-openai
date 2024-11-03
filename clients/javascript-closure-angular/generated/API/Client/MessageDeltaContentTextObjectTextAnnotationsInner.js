goog.provide('API.Client.MessageDeltaContentTextObject_text_annotations_inner');

/**
 * @record
 */
API.Client.MessageDeltaContentTextObjectTextAnnotationsInner = function() {}

/**
 * The index of the annotation in the text content part.
 * @type {!number}
 * @export
 */
API.Client.MessageDeltaContentTextObjectTextAnnotationsInner.prototype.index;

/**
 * Always `file_citation`.
 * @type {!string}
 * @export
 */
API.Client.MessageDeltaContentTextObjectTextAnnotationsInner.prototype.type;

/**
 * The text in the message content that needs to be replaced.
 * @type {!string}
 * @export
 */
API.Client.MessageDeltaContentTextObjectTextAnnotationsInner.prototype.text;

/**
 * @type {!API.Client.MessageDeltaContentTextAnnotationsFileCitationObject_file_citation}
 * @export
 */
API.Client.MessageDeltaContentTextObjectTextAnnotationsInner.prototype.fileCitation;

/**
 * @type {!number}
 * @export
 */
API.Client.MessageDeltaContentTextObjectTextAnnotationsInner.prototype.startIndex;

/**
 * @type {!number}
 * @export
 */
API.Client.MessageDeltaContentTextObjectTextAnnotationsInner.prototype.endIndex;

/**
 * @type {!API.Client.MessageDeltaContentTextAnnotationsFilePathObject_file_path}
 * @export
 */
API.Client.MessageDeltaContentTextObjectTextAnnotationsInner.prototype.filePath;

/** @enum {string} */
API.Client.MessageDeltaContentTextObjectTextAnnotationsInner.TypeEnum = { 
  file_citation: 'file_citation',
  file_path: 'file_path',
}
