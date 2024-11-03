goog.provide('API.Client.ChatCompletionRequestUserMessage');

/**
 * @record
 */
API.Client.ChatCompletionRequestUserMessage = function() {}

/**
 * @type {!API.Client.ChatCompletionRequestUserMessage_content}
 * @export
 */
API.Client.ChatCompletionRequestUserMessage.prototype.content;

/**
 * The role of the messages author, in this case `user`.
 * @type {!string}
 * @export
 */
API.Client.ChatCompletionRequestUserMessage.prototype.role;

/**
 * An optional name for the participant. Provides the model information to differentiate between participants of the same role.
 * @type {!string}
 * @export
 */
API.Client.ChatCompletionRequestUserMessage.prototype.name;

/** @enum {string} */
API.Client.ChatCompletionRequestUserMessage.RoleEnum = { 
  user: 'user',
}
