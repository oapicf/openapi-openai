goog.provide('API.Client.ChatCompletionRequestSystemMessage');

/**
 * @record
 */
API.Client.ChatCompletionRequestSystemMessage = function() {}

/**
 * The contents of the system message.
 * @type {!string}
 * @export
 */
API.Client.ChatCompletionRequestSystemMessage.prototype.content;

/**
 * The role of the messages author, in this case `system`.
 * @type {!string}
 * @export
 */
API.Client.ChatCompletionRequestSystemMessage.prototype.role;

/**
 * An optional name for the participant. Provides the model information to differentiate between participants of the same role.
 * @type {!string}
 * @export
 */
API.Client.ChatCompletionRequestSystemMessage.prototype.name;

/** @enum {string} */
API.Client.ChatCompletionRequestSystemMessage.RoleEnum = { 
  system: 'system',
}
