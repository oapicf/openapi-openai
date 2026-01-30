package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CreateAssistantRequest._

case class CreateAssistantRequest (
  model: CreateAssistantRequestModel,
/* The name of the assistant. The maximum length is 256 characters.  */
  name: Option[String],
/* The description of the assistant. The maximum length is 512 characters.  */
  description: Option[String],
/* The system instructions that the assistant uses. The maximum length is 256,000 characters.  */
  instructions: Option[String],
/* A list of tool enabled on the assistant. There can be a maximum of 128 tools per assistant. Tools can be of types `code_interpreter`, `file_search`, or `function`.  */
  tools: Option[List[AssistantObjectToolsInner]],
toolResources: Option[CreateAssistantRequestToolResources],
/* Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.  */
  metadata: Option[Any],
/* What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic.  */
  temperature: Option[BigDecimal],
/* An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or temperature but not both.  */
  topP: Option[BigDecimal],
responseFormat: Option[AssistantsApiResponseFormatOption])

object CreateAssistantRequest {
  import DateTimeCodecs._

  implicit val CreateAssistantRequestCodecJson: CodecJson[CreateAssistantRequest] = CodecJson.derive[CreateAssistantRequest]
  implicit val CreateAssistantRequestDecoder: EntityDecoder[CreateAssistantRequest] = jsonOf[CreateAssistantRequest]
  implicit val CreateAssistantRequestEncoder: EntityEncoder[CreateAssistantRequest] = jsonEncoderOf[CreateAssistantRequest]
}
