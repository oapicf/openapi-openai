package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AssistantObjectToolResources._

case class AssistantObjectToolResources (
  codeInterpreter: Option[AssistantObjectToolResourcesCodeInterpreter],
fileSearch: Option[AssistantObjectToolResourcesFileSearch])

object AssistantObjectToolResources {
  import DateTimeCodecs._

  implicit val AssistantObjectToolResourcesCodecJson: CodecJson[AssistantObjectToolResources] = CodecJson.derive[AssistantObjectToolResources]
  implicit val AssistantObjectToolResourcesDecoder: EntityDecoder[AssistantObjectToolResources] = jsonOf[AssistantObjectToolResources]
  implicit val AssistantObjectToolResourcesEncoder: EntityEncoder[AssistantObjectToolResources] = jsonEncoderOf[AssistantObjectToolResources]
}
