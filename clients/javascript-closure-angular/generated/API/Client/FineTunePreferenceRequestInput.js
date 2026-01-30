goog.provide('API.Client.FineTunePreferenceRequestInput');

/**
 * The per-line training example of a fine-tuning input file for chat models using the dpo method.
 * @record
 */
API.Client.FineTunePreferenceRequestInput = function() {}

/**
 * @type {!API.Client.FineTunePreferenceRequestInput_input}
 * @export
 */
API.Client.FineTunePreferenceRequestInput.prototype.input;

/**
 * The preferred completion message for the output.
 * @type {!Array<!API.Client.FineTunePreferenceRequestInput_preferred_completion_inner>}
 * @export
 */
API.Client.FineTunePreferenceRequestInput.prototype.preferredCompletion;

/**
 * The non-preferred completion message for the output.
 * @type {!Array<!API.Client.FineTunePreferenceRequestInput_preferred_completion_inner>}
 * @export
 */
API.Client.FineTunePreferenceRequestInput.prototype.nonPreferredCompletion;

