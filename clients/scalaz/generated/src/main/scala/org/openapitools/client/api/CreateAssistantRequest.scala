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
/* A list of tool enabled on the assistant. There can be a maximum of 128 tools per assistant. Tools can be of types `code_interpreter`, `retrieval`, or `function`.  */
  tools: Option[List[AssistantObjectToolsInner]],
/* A list of [file](/docs/api-reference/files) IDs attached to this assistant. There can be a maximum of 20 files attached to the assistant. Files are ordered by their creation date in ascending order.  */
  fileIds: Option[List[String]],
/* Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long.  */
  metadata: Option[Any])

object CreateAssistantRequest {
  import DateTimeCodecs._

  implicit val CreateAssistantRequestCodecJson: CodecJson[CreateAssistantRequest] = CodecJson.derive[CreateAssistantRequest]
  implicit val CreateAssistantRequestDecoder: EntityDecoder[CreateAssistantRequest] = jsonOf[CreateAssistantRequest]
  implicit val CreateAssistantRequestEncoder: EntityEncoder[CreateAssistantRequest] = jsonEncoderOf[CreateAssistantRequest]
}
