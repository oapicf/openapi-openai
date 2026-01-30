package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ModifyAssistantRequestToolResourcesCodeInterpreter._

case class ModifyAssistantRequestToolResourcesCodeInterpreter (
  /* Overrides the list of [file](/docs/api-reference/files) IDs made available to the `code_interpreter` tool. There can be a maximum of 20 files associated with the tool.  */
  fileIds: Option[List[String]])

object ModifyAssistantRequestToolResourcesCodeInterpreter {
  import DateTimeCodecs._

  implicit val ModifyAssistantRequestToolResourcesCodeInterpreterCodecJson: CodecJson[ModifyAssistantRequestToolResourcesCodeInterpreter] = CodecJson.derive[ModifyAssistantRequestToolResourcesCodeInterpreter]
  implicit val ModifyAssistantRequestToolResourcesCodeInterpreterDecoder: EntityDecoder[ModifyAssistantRequestToolResourcesCodeInterpreter] = jsonOf[ModifyAssistantRequestToolResourcesCodeInterpreter]
  implicit val ModifyAssistantRequestToolResourcesCodeInterpreterEncoder: EntityEncoder[ModifyAssistantRequestToolResourcesCodeInterpreter] = jsonEncoderOf[ModifyAssistantRequestToolResourcesCodeInterpreter]
}
