goog.provide('API.Client.CreateChatCompletionResponse');

/**
 * Represents a chat completion response returned by model, based on the provided input.
 * @record
 */
API.Client.CreateChatCompletionResponse = function() {}

/**
 * A unique identifier for the chat completion.
 * @type {!string}
 * @export
 */
API.Client.CreateChatCompletionResponse.prototype.id;

/**
 * A list of chat completion choices. Can be more than one if `n` is greater than 1.
 * @type {!Array<!API.Client.CreateChatCompletionResponse_choices_inner>}
 * @export
 */
API.Client.CreateChatCompletionResponse.prototype.choices;

/**
 * The Unix timestamp (in seconds) of when the chat completion was created.
 * @type {!number}
 * @export
 */
API.Client.CreateChatCompletionResponse.prototype.created;

/**
 * The model used for the chat completion.
 * @type {!string}
 * @export
 */
API.Client.CreateChatCompletionResponse.prototype.model;

/**
 * The service tier used for processing the request. This field is only included if the `service_tier` parameter is specified in the request.
 * @type {!string}
 * @export
 */
API.Client.CreateChatCompletionResponse.prototype.serviceTier;

/**
 * This fingerprint represents the backend configuration that the model runs with.  Can be used in conjunction with the `seed` request parameter to understand when backend changes have been made that might impact determinism. 
 * @type {!string}
 * @export
 */
API.Client.CreateChatCompletionResponse.prototype.systemFingerprint;

/**
 * The object type, which is always `chat.completion`.
 * @type {!string}
 * @export
 */
API.Client.CreateChatCompletionResponse.prototype.object;

/**
 * @type {!API.Client.CompletionUsage}
 * @export
 */
API.Client.CreateChatCompletionResponse.prototype.usage;

/** @enum {string} */
API.Client.CreateChatCompletionResponse.ServiceTierEnum = { 
  scale: 'scale',
  default: 'default',
}
/** @enum {string} */
API.Client.CreateChatCompletionResponse.ObjectEnum = { 
  chat.completion: 'chat.completion',
}
