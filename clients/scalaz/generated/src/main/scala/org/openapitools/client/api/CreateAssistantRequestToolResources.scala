package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CreateAssistantRequestToolResources._

case class CreateAssistantRequestToolResources (
  codeInterpreter: Option[CreateAssistantRequestToolResourcesCodeInterpreter],
fileSearch: Option[CreateAssistantRequestToolResourcesFileSearch])

object CreateAssistantRequestToolResources {
  import DateTimeCodecs._

  implicit val CreateAssistantRequestToolResourcesCodecJson: CodecJson[CreateAssistantRequestToolResources] = CodecJson.derive[CreateAssistantRequestToolResources]
  implicit val CreateAssistantRequestToolResourcesDecoder: EntityDecoder[CreateAssistantRequestToolResources] = jsonOf[CreateAssistantRequestToolResources]
  implicit val CreateAssistantRequestToolResourcesEncoder: EntityEncoder[CreateAssistantRequestToolResources] = jsonEncoderOf[CreateAssistantRequestToolResources]
}
