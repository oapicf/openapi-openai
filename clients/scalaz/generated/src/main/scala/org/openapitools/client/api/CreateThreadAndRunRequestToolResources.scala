package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CreateThreadAndRunRequestToolResources._

case class CreateThreadAndRunRequestToolResources (
  codeInterpreter: Option[CreateAssistantRequestToolResourcesCodeInterpreter],
fileSearch: Option[AssistantObjectToolResourcesFileSearch])

object CreateThreadAndRunRequestToolResources {
  import DateTimeCodecs._

  implicit val CreateThreadAndRunRequestToolResourcesCodecJson: CodecJson[CreateThreadAndRunRequestToolResources] = CodecJson.derive[CreateThreadAndRunRequestToolResources]
  implicit val CreateThreadAndRunRequestToolResourcesDecoder: EntityDecoder[CreateThreadAndRunRequestToolResources] = jsonOf[CreateThreadAndRunRequestToolResources]
  implicit val CreateThreadAndRunRequestToolResourcesEncoder: EntityEncoder[CreateThreadAndRunRequestToolResources] = jsonEncoderOf[CreateThreadAndRunRequestToolResources]
}
