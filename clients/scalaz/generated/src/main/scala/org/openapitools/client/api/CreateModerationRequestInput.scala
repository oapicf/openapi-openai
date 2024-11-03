package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CreateModerationRequestInput._

case class CreateModerationRequestInput (
  
object CreateModerationRequestInput {
  import DateTimeCodecs._

  implicit val CreateModerationRequestInputCodecJson: CodecJson[CreateModerationRequestInput] = CodecJson.derive[CreateModerationRequestInput]
  implicit val CreateModerationRequestInputDecoder: EntityDecoder[CreateModerationRequestInput] = jsonOf[CreateModerationRequestInput]
  implicit val CreateModerationRequestInputEncoder: EntityEncoder[CreateModerationRequestInput] = jsonEncoderOf[CreateModerationRequestInput]
}
