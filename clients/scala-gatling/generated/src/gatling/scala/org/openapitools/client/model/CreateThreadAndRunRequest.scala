
package org.openapitools.client.model


case class CreateThreadAndRunRequest (
    /* The ID of the [assistant](/docs/api-reference/assistants) to use to execute this run. */
    _assistantId: String,
    _thread: Option[CreateThreadRequest],
    _model: Option[CreateRunRequestModel],
    /* Override the default system message of the assistant. This is useful for modifying the behavior on a per-run basis. */
    _instructions: Option[String],
    /* Override the tools the assistant can use for this run. This is useful for modifying the behavior on a per-run basis. */
    _tools: Option[List[CreateThreadAndRunRequestToolsInner]],
    _toolResources: Option[CreateThreadAndRunRequestToolResources],
    /* Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.  */
    _metadata: Option[Any],
    /* What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic.  */
    _temperature: Option[Number],
    /* An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or temperature but not both.  */
    _topP: Option[Number],
    /* If `true`, returns a stream of events that happen during the Run as server-sent events, terminating when the Run enters a terminal state with a `data: [DONE]` message.  */
    _stream: Option[Boolean],
    /* The maximum number of prompt tokens that may be used over the course of the run. The run will make a best effort to use only the number of prompt tokens specified, across multiple turns of the run. If the run exceeds the number of prompt tokens specified, the run will end with status `incomplete`. See `incomplete_details` for more info.  */
    _maxPromptTokens: Option[Integer],
    /* The maximum number of completion tokens that may be used over the course of the run. The run will make a best effort to use only the number of completion tokens specified, across multiple turns of the run. If the run exceeds the number of completion tokens specified, the run will end with status `incomplete`. See `incomplete_details` for more info.  */
    _maxCompletionTokens: Option[Integer],
    _truncationStrategy: Option[TruncationObject],
    _toolChoice: Option[AssistantsApiToolChoiceOption],
    /* Whether to enable [parallel function calling](/docs/guides/function-calling#configuring-parallel-function-calling) during tool use. */
    _parallelToolCalls: Option[Boolean],
    _responseFormat: Option[AssistantsApiResponseFormatOption]
)
object CreateThreadAndRunRequest {
    def toStringBody(var_assistantId: Object, var_thread: Object, var_model: Object, var_instructions: Object, var_tools: Object, var_toolResources: Object, var_metadata: Object, var_temperature: Object, var_topP: Object, var_stream: Object, var_maxPromptTokens: Object, var_maxCompletionTokens: Object, var_truncationStrategy: Object, var_toolChoice: Object, var_parallelToolCalls: Object, var_responseFormat: Object) =
        s"""
        | {
        | "assistantId":$var_assistantId,"thread":$var_thread,"model":$var_model,"instructions":$var_instructions,"tools":$var_tools,"toolResources":$var_toolResources,"metadata":$var_metadata,"temperature":$var_temperature,"topP":$var_topP,"stream":$var_stream,"maxPromptTokens":$var_maxPromptTokens,"maxCompletionTokens":$var_maxCompletionTokens,"truncationStrategy":$var_truncationStrategy,"toolChoice":$var_toolChoice,"parallelToolCalls":$var_parallelToolCalls,"responseFormat":$var_responseFormat
        | }
        """.stripMargin
}
