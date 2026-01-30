package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ModifyAssistantRequestToolResources._

case class ModifyAssistantRequestToolResources (
  codeInterpreter: Option[ModifyAssistantRequestToolResourcesCodeInterpreter],
fileSearch: Option[ModifyAssistantRequestToolResourcesFileSearch])

object ModifyAssistantRequestToolResources {
  import DateTimeCodecs._

  implicit val ModifyAssistantRequestToolResourcesCodecJson: CodecJson[ModifyAssistantRequestToolResources] = CodecJson.derive[ModifyAssistantRequestToolResources]
  implicit val ModifyAssistantRequestToolResourcesDecoder: EntityDecoder[ModifyAssistantRequestToolResources] = jsonOf[ModifyAssistantRequestToolResources]
  implicit val ModifyAssistantRequestToolResourcesEncoder: EntityEncoder[ModifyAssistantRequestToolResources] = jsonEncoderOf[ModifyAssistantRequestToolResources]
}
