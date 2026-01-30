package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CreateAssistantRequestToolResourcesCodeInterpreter._

case class CreateAssistantRequestToolResourcesCodeInterpreter (
  /* A list of [file](/docs/api-reference/files) IDs made available to the `code_interpreter` tool. There can be a maximum of 20 files associated with the tool.  */
  fileIds: Option[List[String]])

object CreateAssistantRequestToolResourcesCodeInterpreter {
  import DateTimeCodecs._

  implicit val CreateAssistantRequestToolResourcesCodeInterpreterCodecJson: CodecJson[CreateAssistantRequestToolResourcesCodeInterpreter] = CodecJson.derive[CreateAssistantRequestToolResourcesCodeInterpreter]
  implicit val CreateAssistantRequestToolResourcesCodeInterpreterDecoder: EntityDecoder[CreateAssistantRequestToolResourcesCodeInterpreter] = jsonOf[CreateAssistantRequestToolResourcesCodeInterpreter]
  implicit val CreateAssistantRequestToolResourcesCodeInterpreterEncoder: EntityEncoder[CreateAssistantRequestToolResourcesCodeInterpreter] = jsonEncoderOf[CreateAssistantRequestToolResourcesCodeInterpreter]
}
