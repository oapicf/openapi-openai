package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import FineTuneEvent._

case class FineTuneEvent (
  `object`: String,
createdAt: Integer,
level: String,
message: String)

object FineTuneEvent {
  import DateTimeCodecs._

  implicit val FineTuneEventCodecJson: CodecJson[FineTuneEvent] = CodecJson.derive[FineTuneEvent]
  implicit val FineTuneEventDecoder: EntityDecoder[FineTuneEvent] = jsonOf[FineTuneEvent]
  implicit val FineTuneEventEncoder: EntityEncoder[FineTuneEvent] = jsonEncoderOf[FineTuneEvent]
}
