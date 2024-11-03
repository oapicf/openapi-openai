goog.provide('API.Client.MessageDeltaContentTextObject');

/**
 * The text content that is part of a message.
 * @record
 */
API.Client.MessageDeltaContentTextObject = function() {}

/**
 * The index of the content part in the message.
 * @type {!number}
 * @export
 */
API.Client.MessageDeltaContentTextObject.prototype.index;

/**
 * Always `text`.
 * @type {!string}
 * @export
 */
API.Client.MessageDeltaContentTextObject.prototype.type;

/**
 * @type {!API.Client.MessageDeltaContentTextObject_text}
 * @export
 */
API.Client.MessageDeltaContentTextObject.prototype.text;

/** @enum {string} */
API.Client.MessageDeltaContentTextObject.TypeEnum = { 
  text: 'text',
}
