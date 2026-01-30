goog.provide('API.Client.FineTuneChatRequestInput');

/**
 * The per-line training example of a fine-tuning input file for chat models using the supervised method.
 * @record
 */
API.Client.FineTuneChatRequestInput = function() {}

/**
 * @type {!Array<!API.Client.FineTuneChatRequestInput_messages_inner>}
 * @export
 */
API.Client.FineTuneChatRequestInput.prototype.messages;

/**
 * A list of tools the model may generate JSON inputs for.
 * @type {!Array<!API.Client.ChatCompletionTool>}
 * @export
 */
API.Client.FineTuneChatRequestInput.prototype.tools;

/**
 * Whether to enable [parallel function calling](/docs/guides/function-calling#configuring-parallel-function-calling) during tool use.
 * @type {!boolean}
 * @export
 */
API.Client.FineTuneChatRequestInput.prototype.parallelToolCalls;

/**
 * A list of functions the model may generate JSON inputs for.
 * @type {!Array<!API.Client.ChatCompletionFunctions>}
 * @export
 */
API.Client.FineTuneChatRequestInput.prototype.functions;

