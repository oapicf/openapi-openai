goog.provide('API.Client.RealtimeConversationItem_content_inner');

/**
 * @record
 */
API.Client.RealtimeConversationItemContentInner = function() {}

/**
 * The content type (`input_text`, `input_audio`, `item_reference`, `text`). 
 * @type {!string}
 * @export
 */
API.Client.RealtimeConversationItemContentInner.prototype.type;

/**
 * The text content, used for `input_text` and `text` content types. 
 * @type {!string}
 * @export
 */
API.Client.RealtimeConversationItemContentInner.prototype.text;

/**
 * ID of a previous conversation item to reference (for `item_reference` content types in `response.create` events). These can reference both client and server created items. 
 * @type {!string}
 * @export
 */
API.Client.RealtimeConversationItemContentInner.prototype.id;

/**
 * Base64-encoded audio bytes, used for `input_audio` content type. 
 * @type {!string}
 * @export
 */
API.Client.RealtimeConversationItemContentInner.prototype.audio;

/**
 * The transcript of the audio, used for `input_audio` content type. 
 * @type {!string}
 * @export
 */
API.Client.RealtimeConversationItemContentInner.prototype.transcript;

/** @enum {string} */
API.Client.RealtimeConversationItemContentInner.TypeEnum = { 
  input_audio: 'input_audio',
  input_text: 'input_text',
  item_reference: 'item_reference',
  text: 'text',
}
