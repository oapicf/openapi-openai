goog.provide('API.Client.FineTunePreferenceRequestInput_input');

/**
 * @record
 */
API.Client.FineTunePreferenceRequestInputInput = function() {}

/**
 * @type {!Array<!API.Client.FineTuneChatRequestInput_messages_inner>}
 * @export
 */
API.Client.FineTunePreferenceRequestInputInput.prototype.messages;

/**
 * A list of tools the model may generate JSON inputs for.
 * @type {!Array<!API.Client.ChatCompletionTool>}
 * @export
 */
API.Client.FineTunePreferenceRequestInputInput.prototype.tools;

/**
 * Whether to enable [parallel function calling](/docs/guides/function-calling#configuring-parallel-function-calling) during tool use.
 * @type {!boolean}
 * @export
 */
API.Client.FineTunePreferenceRequestInputInput.prototype.parallelToolCalls;

