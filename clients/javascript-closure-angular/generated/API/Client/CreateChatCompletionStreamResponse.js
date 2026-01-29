goog.provide('API.Client.CreateChatCompletionStreamResponse');

/**
 * Represents a streamed chunk of a chat completion response returned by model, based on the provided input.
 * @record
 */
API.Client.CreateChatCompletionStreamResponse = function() {}

/**
 * A unique identifier for the chat completion. Each chunk has the same ID.
 * @type {!string}
 * @export
 */
API.Client.CreateChatCompletionStreamResponse.prototype.id;

/**
 * A list of chat completion choices. Can be more than one if `n` is greater than 1.
 * @type {!Array<!API.Client.CreateChatCompletionStreamResponse_choices_inner>}
 * @export
 */
API.Client.CreateChatCompletionStreamResponse.prototype.choices;

/**
 * The Unix timestamp (in seconds) of when the chat completion was created. Each chunk has the same timestamp.
 * @type {!number}
 * @export
 */
API.Client.CreateChatCompletionStreamResponse.prototype.created;

/**
 * The model to generate the completion.
 * @type {!string}
 * @export
 */
API.Client.CreateChatCompletionStreamResponse.prototype.model;

/**
 * This fingerprint represents the backend configuration that the model runs with. Can be used in conjunction with the `seed` request parameter to understand when backend changes have been made that might impact determinism. 
 * @type {!string}
 * @export
 */
API.Client.CreateChatCompletionStreamResponse.prototype.systemFingerprint;

/**
 * The object type, which is always `chat.completion.chunk`.
 * @type {!string}
 * @export
 */
API.Client.CreateChatCompletionStreamResponse.prototype.object;

/** @enum {string} */
API.Client.CreateChatCompletionStreamResponse.ObjectEnum = { 
  chat.completion.chunk: 'chat.completion.chunk',
}
