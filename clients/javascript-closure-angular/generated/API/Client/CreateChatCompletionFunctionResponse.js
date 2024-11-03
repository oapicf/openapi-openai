goog.provide('API.Client.CreateChatCompletionFunctionResponse');

/**
 * Represents a chat completion response returned by model, based on the provided input.
 * @record
 */
API.Client.CreateChatCompletionFunctionResponse = function() {}

/**
 * A unique identifier for the chat completion.
 * @type {!string}
 * @export
 */
API.Client.CreateChatCompletionFunctionResponse.prototype.id;

/**
 * A list of chat completion choices. Can be more than one if `n` is greater than 1.
 * @type {!Array<!API.Client.CreateChatCompletionFunctionResponse_choices_inner>}
 * @export
 */
API.Client.CreateChatCompletionFunctionResponse.prototype.choices;

/**
 * The Unix timestamp (in seconds) of when the chat completion was created.
 * @type {!number}
 * @export
 */
API.Client.CreateChatCompletionFunctionResponse.prototype.created;

/**
 * The model used for the chat completion.
 * @type {!string}
 * @export
 */
API.Client.CreateChatCompletionFunctionResponse.prototype.model;

/**
 * This fingerprint represents the backend configuration that the model runs with.  Can be used in conjunction with the `seed` request parameter to understand when backend changes have been made that might impact determinism. 
 * @type {!string}
 * @export
 */
API.Client.CreateChatCompletionFunctionResponse.prototype.systemFingerprint;

/**
 * The object type, which is always `chat.completion`.
 * @type {!string}
 * @export
 */
API.Client.CreateChatCompletionFunctionResponse.prototype.object;

/**
 * @type {!API.Client.CompletionUsage}
 * @export
 */
API.Client.CreateChatCompletionFunctionResponse.prototype.usage;

/** @enum {string} */
API.Client.CreateChatCompletionFunctionResponse.ObjectEnum = { 
  chat.completion: 'chat.completion',
}
