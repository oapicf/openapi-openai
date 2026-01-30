package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import RealtimeSessionModel._

case class RealtimeSessionModel (
  
object RealtimeSessionModel {
  import DateTimeCodecs._

  implicit val RealtimeSessionModelCodecJson: CodecJson[RealtimeSessionModel] = CodecJson.derive[RealtimeSessionModel]
  implicit val RealtimeSessionModelDecoder: EntityDecoder[RealtimeSessionModel] = jsonOf[RealtimeSessionModel]
  implicit val RealtimeSessionModelEncoder: EntityEncoder[RealtimeSessionModel] = jsonEncoderOf[RealtimeSessionModel]
}
