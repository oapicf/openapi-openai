goog.provide('API.Client.MessageContentTextAnnotationsFileCitationObject');

/**
 * A citation within the message that points to a specific quote from a specific File associated with the assistant or the message. Generated when the assistant uses the \"file_search\" tool to search files.
 * @record
 */
API.Client.MessageContentTextAnnotationsFileCitationObject = function() {}

/**
 * Always `file_citation`.
 * @type {!string}
 * @export
 */
API.Client.MessageContentTextAnnotationsFileCitationObject.prototype.type;

/**
 * The text in the message content that needs to be replaced.
 * @type {!string}
 * @export
 */
API.Client.MessageContentTextAnnotationsFileCitationObject.prototype.text;

/**
 * @type {!API.Client.MessageContentTextAnnotationsFileCitationObject_file_citation}
 * @export
 */
API.Client.MessageContentTextAnnotationsFileCitationObject.prototype.fileCitation;

/**
 * @type {!number}
 * @export
 */
API.Client.MessageContentTextAnnotationsFileCitationObject.prototype.startIndex;

/**
 * @type {!number}
 * @export
 */
API.Client.MessageContentTextAnnotationsFileCitationObject.prototype.endIndex;

/** @enum {string} */
API.Client.MessageContentTextAnnotationsFileCitationObject.TypeEnum = { 
  file_citation: 'file_citation',
}
