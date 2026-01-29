package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CreateThreadAndRunRequest.
  * @param assistantId The ID of the [assistant](/docs/api-reference/assistants) to use to execute this run.
  * @param instructions Override the default system message of the assistant. This is useful for modifying the behavior on a per-run basis.
  * @param tools Override the tools the assistant can use for this run. This is useful for modifying the behavior on a per-run basis.
  * @param metadata Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. 
  * @param temperature What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. 
  * @param stream If `true`, returns a stream of events that happen during the Run as server-sent events, terminating when the Run enters a terminal state with a `data: [DONE]` message. 
  * @param maxPromptTokens The maximum number of prompt tokens that may be used over the course of the run. The run will make a best effort to use only the number of prompt tokens specified, across multiple turns of the run. If the run exceeds the number of prompt tokens specified, the run will end with status `complete`. See `incomplete_details` for more info. 
  * @param maxCompletionTokens The maximum number of completion tokens that may be used over the course of the run. The run will make a best effort to use only the number of completion tokens specified, across multiple turns of the run. If the run exceeds the number of completion tokens specified, the run will end with status `incomplete`. See `incomplete_details` for more info. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T10:48:27.489746113Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class CreateThreadAndRunRequest(
  assistantId: String,
  thread: Option[CreateThreadRequest],
  model: Option[CreateRunRequestModel],
  instructions: Option[String],
  tools: Option[List[CreateThreadAndRunRequestToolsInner]],
  metadata: Option[JsObject],
  temperature: Option[BigDecimal],
  stream: Option[Boolean],
  maxPromptTokens: Option[Int],
  maxCompletionTokens: Option[Int],
  truncationStrategy: Option[TruncationObject],
  toolChoice: Option[AssistantsApiToolChoiceOption],
  responseFormat: Option[AssistantsApiResponseFormatOption]
)

object CreateThreadAndRunRequest {
  implicit lazy val createThreadAndRunRequestJsonFormat: Format[CreateThreadAndRunRequest] = Json.format[CreateThreadAndRunRequest]
}

