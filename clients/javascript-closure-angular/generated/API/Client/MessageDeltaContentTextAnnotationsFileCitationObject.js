goog.provide('API.Client.MessageDeltaContentTextAnnotationsFileCitationObject');

/**
 * A citation within the message that points to a specific quote from a specific File associated with the assistant or the message. Generated when the assistant uses the \"file_search\" tool to search files.
 * @record
 */
API.Client.MessageDeltaContentTextAnnotationsFileCitationObject = function() {}

/**
 * The index of the annotation in the text content part.
 * @type {!number}
 * @export
 */
API.Client.MessageDeltaContentTextAnnotationsFileCitationObject.prototype.index;

/**
 * Always `file_citation`.
 * @type {!string}
 * @export
 */
API.Client.MessageDeltaContentTextAnnotationsFileCitationObject.prototype.type;

/**
 * The text in the message content that needs to be replaced.
 * @type {!string}
 * @export
 */
API.Client.MessageDeltaContentTextAnnotationsFileCitationObject.prototype.text;

/**
 * @type {!API.Client.MessageDeltaContentTextAnnotationsFileCitationObject_file_citation}
 * @export
 */
API.Client.MessageDeltaContentTextAnnotationsFileCitationObject.prototype.fileCitation;

/**
 * @type {!number}
 * @export
 */
API.Client.MessageDeltaContentTextAnnotationsFileCitationObject.prototype.startIndex;

/**
 * @type {!number}
 * @export
 */
API.Client.MessageDeltaContentTextAnnotationsFileCitationObject.prototype.endIndex;

/** @enum {string} */
API.Client.MessageDeltaContentTextAnnotationsFileCitationObject.TypeEnum = { 
  file_citation: 'file_citation',
}
