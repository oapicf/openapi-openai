goog.provide('API.Client.CreateThreadAndRunRequest');

/**
 * @record
 */
API.Client.CreateThreadAndRunRequest = function() {}

/**
 * The ID of the [assistant](/docs/api-reference/assistants) to use to execute this run.
 * @type {!string}
 * @export
 */
API.Client.CreateThreadAndRunRequest.prototype.assistantId;

/**
 * @type {!API.Client.CreateThreadRequest}
 * @export
 */
API.Client.CreateThreadAndRunRequest.prototype.thread;

/**
 * @type {!API.Client.CreateRunRequest_model}
 * @export
 */
API.Client.CreateThreadAndRunRequest.prototype.model;

/**
 * Override the default system message of the assistant. This is useful for modifying the behavior on a per-run basis.
 * @type {!string}
 * @export
 */
API.Client.CreateThreadAndRunRequest.prototype.instructions;

/**
 * Override the tools the assistant can use for this run. This is useful for modifying the behavior on a per-run basis.
 * @type {!Array<!API.Client.CreateThreadAndRunRequest_tools_inner>}
 * @export
 */
API.Client.CreateThreadAndRunRequest.prototype.tools;

/**
 * Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. 
 * @type {!API.Client.Object}
 * @export
 */
API.Client.CreateThreadAndRunRequest.prototype.metadata;

/**
 * What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. 
 * @type {!number}
 * @export
 */
API.Client.CreateThreadAndRunRequest.prototype.temperature;

/**
 * If `true`, returns a stream of events that happen during the Run as server-sent events, terminating when the Run enters a terminal state with a `data: [DONE]` message. 
 * @type {!boolean}
 * @export
 */
API.Client.CreateThreadAndRunRequest.prototype.stream;

/**
 * The maximum number of prompt tokens that may be used over the course of the run. The run will make a best effort to use only the number of prompt tokens specified, across multiple turns of the run. If the run exceeds the number of prompt tokens specified, the run will end with status `complete`. See `incomplete_details` for more info. 
 * @type {!number}
 * @export
 */
API.Client.CreateThreadAndRunRequest.prototype.maxPromptTokens;

/**
 * The maximum number of completion tokens that may be used over the course of the run. The run will make a best effort to use only the number of completion tokens specified, across multiple turns of the run. If the run exceeds the number of completion tokens specified, the run will end with status `incomplete`. See `incomplete_details` for more info. 
 * @type {!number}
 * @export
 */
API.Client.CreateThreadAndRunRequest.prototype.maxCompletionTokens;

/**
 * @type {!API.Client.TruncationObject}
 * @export
 */
API.Client.CreateThreadAndRunRequest.prototype.truncationStrategy;

/**
 * @type {!API.Client.AssistantsApiToolChoiceOption}
 * @export
 */
API.Client.CreateThreadAndRunRequest.prototype.toolChoice;

/**
 * @type {!API.Client.AssistantsApiResponseFormatOption}
 * @export
 */
API.Client.CreateThreadAndRunRequest.prototype.responseFormat;

