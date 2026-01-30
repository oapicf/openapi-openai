goog.provide('API.Client.CreateRunRequest');

/**
 * @record
 */
API.Client.CreateRunRequest = function() {}

/**
 * The ID of the [assistant](/docs/api-reference/assistants) to use to execute this run.
 * @type {!string}
 * @export
 */
API.Client.CreateRunRequest.prototype.assistantId;

/**
 * @type {!API.Client.CreateRunRequest_model}
 * @export
 */
API.Client.CreateRunRequest.prototype.model;

/**
 * Overrides the [instructions](/docs/api-reference/assistants/createAssistant) of the assistant. This is useful for modifying the behavior on a per-run basis.
 * @type {!string}
 * @export
 */
API.Client.CreateRunRequest.prototype.instructions;

/**
 * Appends additional instructions at the end of the instructions for the run. This is useful for modifying the behavior on a per-run basis without overriding other instructions.
 * @type {!string}
 * @export
 */
API.Client.CreateRunRequest.prototype.additionalInstructions;

/**
 * Adds additional messages to the thread before creating the run.
 * @type {!Array<!API.Client.CreateMessageRequest>}
 * @export
 */
API.Client.CreateRunRequest.prototype.additionalMessages;

/**
 * Override the tools the assistant can use for this run. This is useful for modifying the behavior on a per-run basis.
 * @type {!Array<!API.Client.AssistantObject_tools_inner>}
 * @export
 */
API.Client.CreateRunRequest.prototype.tools;

/**
 * Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
 * @type {!API.Client.Object}
 * @export
 */
API.Client.CreateRunRequest.prototype.metadata;

/**
 * What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. 
 * @type {!number}
 * @export
 */
API.Client.CreateRunRequest.prototype.temperature;

/**
 * An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or temperature but not both. 
 * @type {!number}
 * @export
 */
API.Client.CreateRunRequest.prototype.topP;

/**
 * If `true`, returns a stream of events that happen during the Run as server-sent events, terminating when the Run enters a terminal state with a `data: [DONE]` message. 
 * @type {!boolean}
 * @export
 */
API.Client.CreateRunRequest.prototype.stream;

/**
 * The maximum number of prompt tokens that may be used over the course of the run. The run will make a best effort to use only the number of prompt tokens specified, across multiple turns of the run. If the run exceeds the number of prompt tokens specified, the run will end with status `incomplete`. See `incomplete_details` for more info. 
 * @type {!number}
 * @export
 */
API.Client.CreateRunRequest.prototype.maxPromptTokens;

/**
 * The maximum number of completion tokens that may be used over the course of the run. The run will make a best effort to use only the number of completion tokens specified, across multiple turns of the run. If the run exceeds the number of completion tokens specified, the run will end with status `incomplete`. See `incomplete_details` for more info. 
 * @type {!number}
 * @export
 */
API.Client.CreateRunRequest.prototype.maxCompletionTokens;

/**
 * @type {!API.Client.TruncationObject}
 * @export
 */
API.Client.CreateRunRequest.prototype.truncationStrategy;

/**
 * @type {!API.Client.AssistantsApiToolChoiceOption}
 * @export
 */
API.Client.CreateRunRequest.prototype.toolChoice;

/**
 * Whether to enable [parallel function calling](/docs/guides/function-calling#configuring-parallel-function-calling) during tool use.
 * @type {!boolean}
 * @export
 */
API.Client.CreateRunRequest.prototype.parallelToolCalls;

/**
 * @type {!API.Client.AssistantsApiResponseFormatOption}
 * @export
 */
API.Client.CreateRunRequest.prototype.responseFormat;

