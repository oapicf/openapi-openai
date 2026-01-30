package org.openapitools.server.model


/**
 * @param assistantId The ID of the [assistant](/docs/api-reference/assistants) to use to execute this run. for example: ''null''
 * @param model  for example: ''null''
 * @param instructions Overrides the [instructions](/docs/api-reference/assistants/createAssistant) of the assistant. This is useful for modifying the behavior on a per-run basis. for example: ''null''
 * @param additionalInstructions Appends additional instructions at the end of the instructions for the run. This is useful for modifying the behavior on a per-run basis without overriding other instructions. for example: ''null''
 * @param additionalMessages Adds additional messages to the thread before creating the run. for example: ''null''
 * @param tools Override the tools the assistant can use for this run. This is useful for modifying the behavior on a per-run basis. for example: ''null''
 * @param metadata Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.  for example: ''null''
 * @param temperature What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic.  for example: ''1''
 * @param topP An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or temperature but not both.  for example: ''1''
 * @param stream If `true`, returns a stream of events that happen during the Run as server-sent events, terminating when the Run enters a terminal state with a `data: [DONE]` message.  for example: ''null''
 * @param maxPromptTokens The maximum number of prompt tokens that may be used over the course of the run. The run will make a best effort to use only the number of prompt tokens specified, across multiple turns of the run. If the run exceeds the number of prompt tokens specified, the run will end with status `incomplete`. See `incomplete_details` for more info.  for example: ''null''
 * @param maxCompletionTokens The maximum number of completion tokens that may be used over the course of the run. The run will make a best effort to use only the number of completion tokens specified, across multiple turns of the run. If the run exceeds the number of completion tokens specified, the run will end with status `incomplete`. See `incomplete_details` for more info.  for example: ''null''
 * @param truncationStrategy  for example: ''null''
 * @param toolChoice  for example: ''null''
 * @param parallelToolCalls Whether to enable [parallel function calling](/docs/guides/function-calling#configuring-parallel-function-calling) during tool use. for example: ''null''
 * @param responseFormat  for example: ''null''
*/
final case class CreateRunRequest (
  assistantId: String,
  model: Option[CreateRunRequestModel] = None,
  instructions: Option[String] = None,
  additionalInstructions: Option[String] = None,
  additionalMessages: Option[Seq[CreateMessageRequest]] = None,
  tools: Option[Seq[AssistantObjectToolsInner]] = None,
  metadata: Option[Any] = None,
  temperature: Option[Double] = None,
  topP: Option[Double] = None,
  stream: Option[Boolean] = None,
  maxPromptTokens: Option[Int] = None,
  maxCompletionTokens: Option[Int] = None,
  truncationStrategy: Option[TruncationObject] = None,
  toolChoice: Option[AssistantsApiToolChoiceOption] = None,
  parallelToolCalls: Option[Boolean] = None,
  responseFormat: Option[AssistantsApiResponseFormatOption] = None
)

