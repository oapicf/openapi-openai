goog.provide('API.Client.FineTuneCompletionRequestInput');

/**
 * The per-line training example of a fine-tuning input file for completions models
 * @record
 */
API.Client.FineTuneCompletionRequestInput = function() {}

/**
 * The input prompt for this training example.
 * @type {!string}
 * @export
 */
API.Client.FineTuneCompletionRequestInput.prototype.prompt;

/**
 * The desired completion for this training example.
 * @type {!string}
 * @export
 */
API.Client.FineTuneCompletionRequestInput.prototype.completion;

