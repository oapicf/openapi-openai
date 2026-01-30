package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ModifyThreadRequestToolResources._

case class ModifyThreadRequestToolResources (
  codeInterpreter: Option[CreateAssistantRequestToolResourcesCodeInterpreter],
fileSearch: Option[ModifyThreadRequestToolResourcesFileSearch])

object ModifyThreadRequestToolResources {
  import DateTimeCodecs._

  implicit val ModifyThreadRequestToolResourcesCodecJson: CodecJson[ModifyThreadRequestToolResources] = CodecJson.derive[ModifyThreadRequestToolResources]
  implicit val ModifyThreadRequestToolResourcesDecoder: EntityDecoder[ModifyThreadRequestToolResources] = jsonOf[ModifyThreadRequestToolResources]
  implicit val ModifyThreadRequestToolResourcesEncoder: EntityEncoder[ModifyThreadRequestToolResources] = jsonEncoderOf[ModifyThreadRequestToolResources]
}
