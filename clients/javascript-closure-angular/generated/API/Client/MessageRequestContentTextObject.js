goog.provide('API.Client.MessageRequestContentTextObject');

/**
 * The text content that is part of a message.
 * @record
 */
API.Client.MessageRequestContentTextObject = function() {}

/**
 * Always `text`.
 * @type {!string}
 * @export
 */
API.Client.MessageRequestContentTextObject.prototype.type;

/**
 * Text content to be sent to the model
 * @type {!string}
 * @export
 */
API.Client.MessageRequestContentTextObject.prototype.text;

/** @enum {string} */
API.Client.MessageRequestContentTextObject.TypeEnum = { 
  text: 'text',
}
