goog.provide('API.Client.RunStepObject');

/**
 * Represents a step in execution of a run. 
 * @record
 */
API.Client.RunStepObject = function() {}

/**
 * The identifier of the run step, which can be referenced in API endpoints.
 * @type {!string}
 * @export
 */
API.Client.RunStepObject.prototype.id;

/**
 * The object type, which is always `thread.run.step`.
 * @type {!string}
 * @export
 */
API.Client.RunStepObject.prototype.object;

/**
 * The Unix timestamp (in seconds) for when the run step was created.
 * @type {!number}
 * @export
 */
API.Client.RunStepObject.prototype.createdAt;

/**
 * The ID of the [assistant](/docs/api-reference/assistants) associated with the run step.
 * @type {!string}
 * @export
 */
API.Client.RunStepObject.prototype.assistantId;

/**
 * The ID of the [thread](/docs/api-reference/threads) that was run.
 * @type {!string}
 * @export
 */
API.Client.RunStepObject.prototype.threadId;

/**
 * The ID of the [run](/docs/api-reference/runs) that this run step is a part of.
 * @type {!string}
 * @export
 */
API.Client.RunStepObject.prototype.runId;

/**
 * The type of run step, which can be either `message_creation` or `tool_calls`.
 * @type {!string}
 * @export
 */
API.Client.RunStepObject.prototype.type;

/**
 * The status of the run step, which can be either `in_progress`, `cancelled`, `failed`, `completed`, or `expired`.
 * @type {!string}
 * @export
 */
API.Client.RunStepObject.prototype.status;

/**
 * @type {!API.Client.RunStepObject_step_details}
 * @export
 */
API.Client.RunStepObject.prototype.stepDetails;

/**
 * @type {!API.Client.RunStepObject_last_error}
 * @export
 */
API.Client.RunStepObject.prototype.lastError;

/**
 * The Unix timestamp (in seconds) for when the run step expired. A step is considered expired if the parent run is expired.
 * @type {!number}
 * @export
 */
API.Client.RunStepObject.prototype.expiredAt;

/**
 * The Unix timestamp (in seconds) for when the run step was cancelled.
 * @type {!number}
 * @export
 */
API.Client.RunStepObject.prototype.cancelledAt;

/**
 * The Unix timestamp (in seconds) for when the run step failed.
 * @type {!number}
 * @export
 */
API.Client.RunStepObject.prototype.failedAt;

/**
 * The Unix timestamp (in seconds) for when the run step completed.
 * @type {!number}
 * @export
 */
API.Client.RunStepObject.prototype.completedAt;

/**
 * Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
 * @type {!API.Client.Object}
 * @export
 */
API.Client.RunStepObject.prototype.metadata;

/**
 * @type {!API.Client.RunStepCompletionUsage}
 * @export
 */
API.Client.RunStepObject.prototype.usage;

/** @enum {string} */
API.Client.RunStepObject.ObjectEnum = { 
  thread.run.step: 'thread.run.step',
}
/** @enum {string} */
API.Client.RunStepObject.TypeEnum = { 
  message_creation: 'message_creation',
  tool_calls: 'tool_calls',
}
/** @enum {string} */
API.Client.RunStepObject.StatusEnum = { 
  in_progress: 'in_progress',
  cancelled: 'cancelled',
  failed: 'failed',
  completed: 'completed',
  expired: 'expired',
}
