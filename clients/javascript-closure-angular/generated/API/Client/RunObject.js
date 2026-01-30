goog.provide('API.Client.RunObject');

/**
 * Represents an execution run on a [thread](/docs/api-reference/threads).
 * @record
 */
API.Client.RunObject = function() {}

/**
 * The identifier, which can be referenced in API endpoints.
 * @type {!string}
 * @export
 */
API.Client.RunObject.prototype.id;

/**
 * The object type, which is always `thread.run`.
 * @type {!string}
 * @export
 */
API.Client.RunObject.prototype.object;

/**
 * The Unix timestamp (in seconds) for when the run was created.
 * @type {!number}
 * @export
 */
API.Client.RunObject.prototype.createdAt;

/**
 * The ID of the [thread](/docs/api-reference/threads) that was executed on as a part of this run.
 * @type {!string}
 * @export
 */
API.Client.RunObject.prototype.threadId;

/**
 * The ID of the [assistant](/docs/api-reference/assistants) used for execution of this run.
 * @type {!string}
 * @export
 */
API.Client.RunObject.prototype.assistantId;

/**
 * The status of the run, which can be either `queued`, `in_progress`, `requires_action`, `cancelling`, `cancelled`, `failed`, `completed`, `incomplete`, or `expired`.
 * @type {!string}
 * @export
 */
API.Client.RunObject.prototype.status;

/**
 * @type {!API.Client.RunObject_required_action}
 * @export
 */
API.Client.RunObject.prototype.requiredAction;

/**
 * @type {!API.Client.RunObject_last_error}
 * @export
 */
API.Client.RunObject.prototype.lastError;

/**
 * The Unix timestamp (in seconds) for when the run will expire.
 * @type {!number}
 * @export
 */
API.Client.RunObject.prototype.expiresAt;

/**
 * The Unix timestamp (in seconds) for when the run was started.
 * @type {!number}
 * @export
 */
API.Client.RunObject.prototype.startedAt;

/**
 * The Unix timestamp (in seconds) for when the run was cancelled.
 * @type {!number}
 * @export
 */
API.Client.RunObject.prototype.cancelledAt;

/**
 * The Unix timestamp (in seconds) for when the run failed.
 * @type {!number}
 * @export
 */
API.Client.RunObject.prototype.failedAt;

/**
 * The Unix timestamp (in seconds) for when the run was completed.
 * @type {!number}
 * @export
 */
API.Client.RunObject.prototype.completedAt;

/**
 * @type {!API.Client.RunObject_incomplete_details}
 * @export
 */
API.Client.RunObject.prototype.incompleteDetails;

/**
 * The model that the [assistant](/docs/api-reference/assistants) used for this run.
 * @type {!string}
 * @export
 */
API.Client.RunObject.prototype.model;

/**
 * The instructions that the [assistant](/docs/api-reference/assistants) used for this run.
 * @type {!string}
 * @export
 */
API.Client.RunObject.prototype.instructions;

/**
 * The list of tools that the [assistant](/docs/api-reference/assistants) used for this run.
 * @type {!Array<!API.Client.AssistantObject_tools_inner>}
 * @export
 */
API.Client.RunObject.prototype.tools;

/**
 * Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
 * @type {!API.Client.Object}
 * @export
 */
API.Client.RunObject.prototype.metadata;

/**
 * @type {!API.Client.RunCompletionUsage}
 * @export
 */
API.Client.RunObject.prototype.usage;

/**
 * The sampling temperature used for this run. If not set, defaults to 1.
 * @type {!number}
 * @export
 */
API.Client.RunObject.prototype.temperature;

/**
 * The nucleus sampling value used for this run. If not set, defaults to 1.
 * @type {!number}
 * @export
 */
API.Client.RunObject.prototype.topP;

/**
 * The maximum number of prompt tokens specified to have been used over the course of the run. 
 * @type {!number}
 * @export
 */
API.Client.RunObject.prototype.maxPromptTokens;

/**
 * The maximum number of completion tokens specified to have been used over the course of the run. 
 * @type {!number}
 * @export
 */
API.Client.RunObject.prototype.maxCompletionTokens;

/**
 * @type {!API.Client.TruncationObject}
 * @export
 */
API.Client.RunObject.prototype.truncationStrategy;

/**
 * @type {!API.Client.AssistantsApiToolChoiceOption}
 * @export
 */
API.Client.RunObject.prototype.toolChoice;

/**
 * Whether to enable [parallel function calling](/docs/guides/function-calling#configuring-parallel-function-calling) during tool use.
 * @type {!boolean}
 * @export
 */
API.Client.RunObject.prototype.parallelToolCalls;

/**
 * @type {!API.Client.AssistantsApiResponseFormatOption}
 * @export
 */
API.Client.RunObject.prototype.responseFormat;

/** @enum {string} */
API.Client.RunObject.ObjectEnum = { 
  thread.run: 'thread.run',
}
/** @enum {string} */
API.Client.RunObject.StatusEnum = { 
  queued: 'queued',
  in_progress: 'in_progress',
  requires_action: 'requires_action',
  cancelling: 'cancelling',
  cancelled: 'cancelled',
  failed: 'failed',
  completed: 'completed',
  incomplete: 'incomplete',
  expired: 'expired',
}
