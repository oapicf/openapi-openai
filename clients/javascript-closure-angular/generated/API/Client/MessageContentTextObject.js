goog.provide('API.Client.MessageContentTextObject');

/**
 * The text content that is part of a message.
 * @record
 */
API.Client.MessageContentTextObject = function() {}

/**
 * Always `text`.
 * @type {!string}
 * @export
 */
API.Client.MessageContentTextObject.prototype.type;

/**
 * @type {!API.Client.MessageContentTextObject_text}
 * @export
 */
API.Client.MessageContentTextObject.prototype.text;

/** @enum {string} */
API.Client.MessageContentTextObject.TypeEnum = { 
  text: 'text',
}
