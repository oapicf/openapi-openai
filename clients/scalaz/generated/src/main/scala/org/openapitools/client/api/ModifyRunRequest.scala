package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ModifyRunRequest._

case class ModifyRunRequest (
  /* Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long.  */
  metadata: Option[Any])

object ModifyRunRequest {
  import DateTimeCodecs._

  implicit val ModifyRunRequestCodecJson: CodecJson[ModifyRunRequest] = CodecJson.derive[ModifyRunRequest]
  implicit val ModifyRunRequestDecoder: EntityDecoder[ModifyRunRequest] = jsonOf[ModifyRunRequest]
  implicit val ModifyRunRequestEncoder: EntityEncoder[ModifyRunRequest] = jsonEncoderOf[ModifyRunRequest]
}
