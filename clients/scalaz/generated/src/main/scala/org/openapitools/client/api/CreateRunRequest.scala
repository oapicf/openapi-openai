package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CreateRunRequest._

case class CreateRunRequest (
  /* The ID of the [assistant](/docs/api-reference/assistants) to use to execute this run. */
  assistantId: String,
model: Option[CreateRunRequestModel],
/* Overrides the [instructions](/docs/api-reference/assistants/createAssistant) of the assistant. This is useful for modifying the behavior on a per-run basis. */
  instructions: Option[String],
/* Appends additional instructions at the end of the instructions for the run. This is useful for modifying the behavior on a per-run basis without overriding other instructions. */
  additionalInstructions: Option[String],
/* Adds additional messages to the thread before creating the run. */
  additionalMessages: Option[List[CreateMessageRequest]],
/* Override the tools the assistant can use for this run. This is useful for modifying the behavior on a per-run basis. */
  tools: Option[List[AssistantObjectToolsInner]],
/* Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long.  */
  metadata: Option[Any],
/* What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic.  */
  temperature: Option[BigDecimal],
/* If `true`, returns a stream of events that happen during the Run as server-sent events, terminating when the Run enters a terminal state with a `data: [DONE]` message.  */
  stream: Option[Boolean],
/* The maximum number of prompt tokens that may be used over the course of the run. The run will make a best effort to use only the number of prompt tokens specified, across multiple turns of the run. If the run exceeds the number of prompt tokens specified, the run will end with status `complete`. See `incomplete_details` for more info.  */
  maxPromptTokens: Option[Integer],
/* The maximum number of completion tokens that may be used over the course of the run. The run will make a best effort to use only the number of completion tokens specified, across multiple turns of the run. If the run exceeds the number of completion tokens specified, the run will end with status `complete`. See `incomplete_details` for more info.  */
  maxCompletionTokens: Option[Integer],
truncationStrategy: Option[TruncationObject],
toolChoice: Option[AssistantsApiToolChoiceOption],
responseFormat: Option[AssistantsApiResponseFormatOption])

object CreateRunRequest {
  import DateTimeCodecs._

  implicit val CreateRunRequestCodecJson: CodecJson[CreateRunRequest] = CodecJson.derive[CreateRunRequest]
  implicit val CreateRunRequestDecoder: EntityDecoder[CreateRunRequest] = jsonOf[CreateRunRequest]
  implicit val CreateRunRequestEncoder: EntityEncoder[CreateRunRequest] = jsonEncoderOf[CreateRunRequest]
}