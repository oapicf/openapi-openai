package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CreateThreadRequestToolResources._

case class CreateThreadRequestToolResources (
  codeInterpreter: Option[CreateAssistantRequestToolResourcesCodeInterpreter],
fileSearch: Option[CreateThreadRequestToolResourcesFileSearch])

object CreateThreadRequestToolResources {
  import DateTimeCodecs._

  implicit val CreateThreadRequestToolResourcesCodecJson: CodecJson[CreateThreadRequestToolResources] = CodecJson.derive[CreateThreadRequestToolResources]
  implicit val CreateThreadRequestToolResourcesDecoder: EntityDecoder[CreateThreadRequestToolResources] = jsonOf[CreateThreadRequestToolResources]
  implicit val CreateThreadRequestToolResourcesEncoder: EntityEncoder[CreateThreadRequestToolResources] = jsonEncoderOf[CreateThreadRequestToolResources]
}
