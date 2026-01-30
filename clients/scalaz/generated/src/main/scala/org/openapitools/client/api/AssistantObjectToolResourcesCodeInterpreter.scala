package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AssistantObjectToolResourcesCodeInterpreter._

case class AssistantObjectToolResourcesCodeInterpreter (
  /* A list of [file](/docs/api-reference/files) IDs made available to the `code_interpreter`` tool. There can be a maximum of 20 files associated with the tool.  */
  fileIds: Option[List[String]])

object AssistantObjectToolResourcesCodeInterpreter {
  import DateTimeCodecs._

  implicit val AssistantObjectToolResourcesCodeInterpreterCodecJson: CodecJson[AssistantObjectToolResourcesCodeInterpreter] = CodecJson.derive[AssistantObjectToolResourcesCodeInterpreter]
  implicit val AssistantObjectToolResourcesCodeInterpreterDecoder: EntityDecoder[AssistantObjectToolResourcesCodeInterpreter] = jsonOf[AssistantObjectToolResourcesCodeInterpreter]
  implicit val AssistantObjectToolResourcesCodeInterpreterEncoder: EntityEncoder[AssistantObjectToolResourcesCodeInterpreter] = jsonEncoderOf[AssistantObjectToolResourcesCodeInterpreter]
}
