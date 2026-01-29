
package org.openapitools.client.model


case class RunObject (
    /* The identifier, which can be referenced in API endpoints. */
    _id: String,
    /* The object type, which is always `thread.run`. */
    _object: String,
    /* The Unix timestamp (in seconds) for when the run was created. */
    _createdAt: Integer,
    /* The ID of the [thread](/docs/api-reference/threads) that was executed on as a part of this run. */
    _threadId: String,
    /* The ID of the [assistant](/docs/api-reference/assistants) used for execution of this run. */
    _assistantId: String,
    /* The status of the run, which can be either `queued`, `in_progress`, `requires_action`, `cancelling`, `cancelled`, `failed`, `completed`, or `expired`. */
    _status: String,
    _requiredAction: RunObjectRequiredAction,
    _lastError: RunObjectLastError,
    /* The Unix timestamp (in seconds) for when the run will expire. */
    _expiresAt: Integer,
    /* The Unix timestamp (in seconds) for when the run was started. */
    _startedAt: Integer,
    /* The Unix timestamp (in seconds) for when the run was cancelled. */
    _cancelledAt: Integer,
    /* The Unix timestamp (in seconds) for when the run failed. */
    _failedAt: Integer,
    /* The Unix timestamp (in seconds) for when the run was completed. */
    _completedAt: Integer,
    _incompleteDetails: RunObjectIncompleteDetails,
    /* The model that the [assistant](/docs/api-reference/assistants) used for this run. */
    _model: String,
    /* The instructions that the [assistant](/docs/api-reference/assistants) used for this run. */
    _instructions: String,
    /* The list of tools that the [assistant](/docs/api-reference/assistants) used for this run. */
    _tools: List[AssistantObjectToolsInner],
    /* The list of [File](/docs/api-reference/files) IDs the [assistant](/docs/api-reference/assistants) used for this run. */
    _fileIds: List[String],
    /* Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long.  */
    _metadata: Any,
    _usage: RunCompletionUsage,
    /* The sampling temperature used for this run. If not set, defaults to 1. */
    _temperature: Option[Number],
    /* The maximum number of prompt tokens specified to have been used over the course of the run.  */
    _maxPromptTokens: Integer,
    /* The maximum number of completion tokens specified to have been used over the course of the run.  */
    _maxCompletionTokens: Integer,
    _truncationStrategy: TruncationObject,
    _toolChoice: AssistantsApiToolChoiceOption,
    _responseFormat: AssistantsApiResponseFormatOption
)
object RunObject {
    def toStringBody(var_id: Object, var_object: Object, var_createdAt: Object, var_threadId: Object, var_assistantId: Object, var_status: Object, var_requiredAction: Object, var_lastError: Object, var_expiresAt: Object, var_startedAt: Object, var_cancelledAt: Object, var_failedAt: Object, var_completedAt: Object, var_incompleteDetails: Object, var_model: Object, var_instructions: Object, var_tools: Object, var_fileIds: Object, var_metadata: Object, var_usage: Object, var_temperature: Object, var_maxPromptTokens: Object, var_maxCompletionTokens: Object, var_truncationStrategy: Object, var_toolChoice: Object, var_responseFormat: Object) =
        s"""
        | {
        | "id":$var_id,"object":$var_object,"createdAt":$var_createdAt,"threadId":$var_threadId,"assistantId":$var_assistantId,"status":$var_status,"requiredAction":$var_requiredAction,"lastError":$var_lastError,"expiresAt":$var_expiresAt,"startedAt":$var_startedAt,"cancelledAt":$var_cancelledAt,"failedAt":$var_failedAt,"completedAt":$var_completedAt,"incompleteDetails":$var_incompleteDetails,"model":$var_model,"instructions":$var_instructions,"tools":$var_tools,"fileIds":$var_fileIds,"metadata":$var_metadata,"usage":$var_usage,"temperature":$var_temperature,"maxPromptTokens":$var_maxPromptTokens,"maxCompletionTokens":$var_maxCompletionTokens,"truncationStrategy":$var_truncationStrategy,"toolChoice":$var_toolChoice,"responseFormat":$var_responseFormat
        | }
        """.stripMargin
}
