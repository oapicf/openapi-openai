package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ModifyMessageRequest._

case class ModifyMessageRequest (
  /* Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long.  */
  metadata: Option[Any])

object ModifyMessageRequest {
  import DateTimeCodecs._

  implicit val ModifyMessageRequestCodecJson: CodecJson[ModifyMessageRequest] = CodecJson.derive[ModifyMessageRequest]
  implicit val ModifyMessageRequestDecoder: EntityDecoder[ModifyMessageRequest] = jsonOf[ModifyMessageRequest]
  implicit val ModifyMessageRequestEncoder: EntityEncoder[ModifyMessageRequest] = jsonEncoderOf[ModifyMessageRequest]
}
