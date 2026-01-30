goog.provide('API.Client.TruncationObject');

/**
 * Controls for how a thread will be truncated prior to the run. Use this to control the intial context window of the run.
 * @record
 */
API.Client.TruncationObject = function() {}

/**
 * The truncation strategy to use for the thread. The default is `auto`. If set to `last_messages`, the thread will be truncated to the n most recent messages in the thread. When set to `auto`, messages in the middle of the thread will be dropped to fit the context length of the model, `max_prompt_tokens`.
 * @type {!string}
 * @export
 */
API.Client.TruncationObject.prototype.type;

/**
 * The number of most recent messages from the thread when constructing the context for the run.
 * @type {!number}
 * @export
 */
API.Client.TruncationObject.prototype.lastMessages;

/** @enum {string} */
API.Client.TruncationObject.TypeEnum = { 
  auto: 'auto',
  last_messages: 'last_messages',
}
