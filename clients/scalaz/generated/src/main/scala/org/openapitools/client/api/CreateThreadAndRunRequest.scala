package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CreateThreadAndRunRequest._

case class CreateThreadAndRunRequest (
  /* The ID of the [assistant](/docs/api-reference/assistants) to use to execute this run. */
  assistantId: String,
thread: Option[CreateThreadRequest],
model: Option[CreateRunRequestModel],
/* Override the default system message of the assistant. This is useful for modifying the behavior on a per-run basis. */
  instructions: Option[String],
/* Override the tools the assistant can use for this run. This is useful for modifying the behavior on a per-run basis. */
  tools: Option[List[CreateThreadAndRunRequestToolsInner]],
toolResources: Option[CreateThreadAndRunRequestToolResources],
/* Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.  */
  metadata: Option[Any],
/* What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic.  */
  temperature: Option[BigDecimal],
/* An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or temperature but not both.  */
  topP: Option[BigDecimal],
/* If `true`, returns a stream of events that happen during the Run as server-sent events, terminating when the Run enters a terminal state with a `data: [DONE]` message.  */
  stream: Option[Boolean],
/* The maximum number of prompt tokens that may be used over the course of the run. The run will make a best effort to use only the number of prompt tokens specified, across multiple turns of the run. If the run exceeds the number of prompt tokens specified, the run will end with status `incomplete`. See `incomplete_details` for more info.  */
  maxPromptTokens: Option[Integer],
/* The maximum number of completion tokens that may be used over the course of the run. The run will make a best effort to use only the number of completion tokens specified, across multiple turns of the run. If the run exceeds the number of completion tokens specified, the run will end with status `incomplete`. See `incomplete_details` for more info.  */
  maxCompletionTokens: Option[Integer],
truncationStrategy: Option[TruncationObject],
toolChoice: Option[AssistantsApiToolChoiceOption],
/* Whether to enable [parallel function calling](/docs/guides/function-calling#configuring-parallel-function-calling) during tool use. */
  parallelToolCalls: Option[Boolean],
responseFormat: Option[AssistantsApiResponseFormatOption])

object CreateThreadAndRunRequest {
  import DateTimeCodecs._

  implicit val CreateThreadAndRunRequestCodecJson: CodecJson[CreateThreadAndRunRequest] = CodecJson.derive[CreateThreadAndRunRequest]
  implicit val CreateThreadAndRunRequestDecoder: EntityDecoder[CreateThreadAndRunRequest] = jsonOf[CreateThreadAndRunRequest]
  implicit val CreateThreadAndRunRequestEncoder: EntityEncoder[CreateThreadAndRunRequest] = jsonEncoderOf[CreateThreadAndRunRequest]
}
