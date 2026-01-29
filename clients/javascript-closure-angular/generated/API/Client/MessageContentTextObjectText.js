goog.provide('API.Client.MessageContentTextObject_text');

/**
 * @record
 */
API.Client.MessageContentTextObjectText = function() {}

/**
 * The data that makes up the text.
 * @type {!string}
 * @export
 */
API.Client.MessageContentTextObjectText.prototype.value;

/**
 * @type {!Array<!API.Client.MessageContentTextObject_text_annotations_inner>}
 * @export
 */
API.Client.MessageContentTextObjectText.prototype.annotations;

