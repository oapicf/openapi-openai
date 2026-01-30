package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import RealtimeResponseStatusDetailsError._

case class RealtimeResponseStatusDetailsError (
  /* The type of error. */
  `type`: Option[String],
/* Error code, if any. */
  code: Option[String])

object RealtimeResponseStatusDetailsError {
  import DateTimeCodecs._

  implicit val RealtimeResponseStatusDetailsErrorCodecJson: CodecJson[RealtimeResponseStatusDetailsError] = CodecJson.derive[RealtimeResponseStatusDetailsError]
  implicit val RealtimeResponseStatusDetailsErrorDecoder: EntityDecoder[RealtimeResponseStatusDetailsError] = jsonOf[RealtimeResponseStatusDetailsError]
  implicit val RealtimeResponseStatusDetailsErrorEncoder: EntityEncoder[RealtimeResponseStatusDetailsError] = jsonEncoderOf[RealtimeResponseStatusDetailsError]
}
