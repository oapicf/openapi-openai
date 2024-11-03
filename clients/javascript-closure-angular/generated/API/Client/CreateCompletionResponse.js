goog.provide('API.Client.CreateCompletionResponse');

/**
 * Represents a completion response from the API. Note: both the streamed and non-streamed response objects share the same shape (unlike the chat endpoint). 
 * @record
 */
API.Client.CreateCompletionResponse = function() {}

/**
 * A unique identifier for the completion.
 * @type {!string}
 * @export
 */
API.Client.CreateCompletionResponse.prototype.id;

/**
 * The list of completion choices the model generated for the input prompt.
 * @type {!Array<!API.Client.CreateCompletionResponse_choices_inner>}
 * @export
 */
API.Client.CreateCompletionResponse.prototype.choices;

/**
 * The Unix timestamp (in seconds) of when the completion was created.
 * @type {!number}
 * @export
 */
API.Client.CreateCompletionResponse.prototype.created;

/**
 * The model used for completion.
 * @type {!string}
 * @export
 */
API.Client.CreateCompletionResponse.prototype.model;

/**
 * This fingerprint represents the backend configuration that the model runs with.  Can be used in conjunction with the `seed` request parameter to understand when backend changes have been made that might impact determinism. 
 * @type {!string}
 * @export
 */
API.Client.CreateCompletionResponse.prototype.systemFingerprint;

/**
 * The object type, which is always \"text_completion\"
 * @type {!string}
 * @export
 */
API.Client.CreateCompletionResponse.prototype.object;

/**
 * @type {!API.Client.CompletionUsage}
 * @export
 */
API.Client.CreateCompletionResponse.prototype.usage;

/** @enum {string} */
API.Client.CreateCompletionResponse.ObjectEnum = { 
  text_completion: 'text_completion',
}
