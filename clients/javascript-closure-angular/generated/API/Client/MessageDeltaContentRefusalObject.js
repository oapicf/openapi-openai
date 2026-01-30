goog.provide('API.Client.MessageDeltaContentRefusalObject');

/**
 * The refusal content that is part of a message.
 * @record
 */
API.Client.MessageDeltaContentRefusalObject = function() {}

/**
 * The index of the refusal part in the message.
 * @type {!number}
 * @export
 */
API.Client.MessageDeltaContentRefusalObject.prototype.index;

/**
 * Always `refusal`.
 * @type {!string}
 * @export
 */
API.Client.MessageDeltaContentRefusalObject.prototype.type;

/**
 * @type {!string}
 * @export
 */
API.Client.MessageDeltaContentRefusalObject.prototype.refusal;

/** @enum {string} */
API.Client.MessageDeltaContentRefusalObject.TypeEnum = { 
  refusal: 'refusal',
}
