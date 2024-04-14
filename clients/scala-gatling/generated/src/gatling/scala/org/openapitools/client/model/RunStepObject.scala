
package org.openapitools.client.model


case class RunStepObject (
    /* The identifier of the run step, which can be referenced in API endpoints. */
    _id: String,
    /* The object type, which is always `thread.run.step`. */
    _object: String,
    /* The Unix timestamp (in seconds) for when the run step was created. */
    _createdAt: Integer,
    /* The ID of the [assistant](/docs/api-reference/assistants) associated with the run step. */
    _assistantId: String,
    /* The ID of the [thread](/docs/api-reference/threads) that was run. */
    _threadId: String,
    /* The ID of the [run](/docs/api-reference/runs) that this run step is a part of. */
    _runId: String,
    /* The type of run step, which can be either `message_creation` or `tool_calls`. */
    _type: String,
    /* The status of the run step, which can be either `in_progress`, `cancelled`, `failed`, `completed`, or `expired`. */
    _status: String,
    _stepDetails: RunStepObjectStepDetails,
    _lastError: RunStepObjectLastError,
    /* The Unix timestamp (in seconds) for when the run step expired. A step is considered expired if the parent run is expired. */
    _expiredAt: Integer,
    /* The Unix timestamp (in seconds) for when the run step was cancelled. */
    _cancelledAt: Integer,
    /* The Unix timestamp (in seconds) for when the run step failed. */
    _failedAt: Integer,
    /* The Unix timestamp (in seconds) for when the run step completed. */
    _completedAt: Integer,
    /* Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long.  */
    _metadata: Any,
    _usage: RunStepCompletionUsage
)
object RunStepObject {
    def toStringBody(var_id: Object, var_object: Object, var_createdAt: Object, var_assistantId: Object, var_threadId: Object, var_runId: Object, var_type: Object, var_status: Object, var_stepDetails: Object, var_lastError: Object, var_expiredAt: Object, var_cancelledAt: Object, var_failedAt: Object, var_completedAt: Object, var_metadata: Object, var_usage: Object) =
        s"""
        | {
        | "id":$var_id,"object":$var_object,"createdAt":$var_createdAt,"assistantId":$var_assistantId,"threadId":$var_threadId,"runId":$var_runId,"type":$var_type,"status":$var_status,"stepDetails":$var_stepDetails,"lastError":$var_lastError,"expiredAt":$var_expiredAt,"cancelledAt":$var_cancelledAt,"failedAt":$var_failedAt,"completedAt":$var_completedAt,"metadata":$var_metadata,"usage":$var_usage
        | }
        """.stripMargin
}
