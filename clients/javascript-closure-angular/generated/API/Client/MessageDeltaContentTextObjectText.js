goog.provide('API.Client.MessageDeltaContentTextObject_text');

/**
 * @record
 */
API.Client.MessageDeltaContentTextObjectText = function() {}

/**
 * The data that makes up the text.
 * @type {!string}
 * @export
 */
API.Client.MessageDeltaContentTextObjectText.prototype.value;

/**
 * @type {!Array<!API.Client.MessageDeltaContentTextObject_text_annotations_inner>}
 * @export
 */
API.Client.MessageDeltaContentTextObjectText.prototype.annotations;

