goog.provide('API.Client.ChatCompletionRequestDeveloperMessage');

/**
 * Developer-provided instructions that the model should follow, regardless of messages sent by the user. With o1 models and newer, `developer` messages replace the previous `system` messages. 
 * @record
 */
API.Client.ChatCompletionRequestDeveloperMessage = function() {}

/**
 * @type {!API.Client.ChatCompletionRequestDeveloperMessage_content}
 * @export
 */
API.Client.ChatCompletionRequestDeveloperMessage.prototype.content;

/**
 * The role of the messages author, in this case `developer`.
 * @type {!string}
 * @export
 */
API.Client.ChatCompletionRequestDeveloperMessage.prototype.role;

/**
 * An optional name for the participant. Provides the model information to differentiate between participants of the same role.
 * @type {!string}
 * @export
 */
API.Client.ChatCompletionRequestDeveloperMessage.prototype.name;

/** @enum {string} */
API.Client.ChatCompletionRequestDeveloperMessage.RoleEnum = { 
  developer: 'developer',
}
