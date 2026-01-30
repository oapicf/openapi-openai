package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import RealtimeSessionTurnDetection._

case class RealtimeSessionTurnDetection (
  /* Type of turn detection, only `server_vad` is currently supported.  */
  `type`: Option[`Type`],
/* Activation threshold for VAD (0.0 to 1.0), this defaults to 0.5. A  higher threshold will require louder audio to activate the model, and  thus might perform better in noisy environments.  */
  threshold: Option[BigDecimal],
/* Amount of audio to include before the VAD detected speech (in  milliseconds). Defaults to 300ms.  */
  prefixPaddingMs: Option[Integer],
/* Duration of silence to detect speech stop (in milliseconds). Defaults  to 500ms. With shorter values the model will respond more quickly,  but may jump in on short pauses from the user.  */
  silenceDurationMs: Option[Integer])

object RealtimeSessionTurnDetection {
  import DateTimeCodecs._
  sealed trait `Type`
  case object ServerVad extends `Type`

  object `Type` {
    def to`Type`(s: String): Option[`Type`] = s match {
      case "ServerVad" => Some(ServerVad)
      case _ => None
    }

    def from`Type`(x: `Type`): String = x match {
      case ServerVad => "ServerVad"
    }
  }

  implicit val `Type`EnumEncoder: EncodeJson[`Type`] =
    EncodeJson[`Type`](is => StringEncodeJson(`Type`.from`Type`(is)))

  implicit val `Type`EnumDecoder: DecodeJson[`Type`] =
    DecodeJson.optionDecoder[`Type`](n => n.string.flatMap(jStr => `Type`.to`Type`(jStr)), "`Type` failed to de-serialize")

  implicit val RealtimeSessionTurnDetectionCodecJson: CodecJson[RealtimeSessionTurnDetection] = CodecJson.derive[RealtimeSessionTurnDetection]
  implicit val RealtimeSessionTurnDetectionDecoder: EntityDecoder[RealtimeSessionTurnDetection] = jsonOf[RealtimeSessionTurnDetection]
  implicit val RealtimeSessionTurnDetectionEncoder: EntityEncoder[RealtimeSessionTurnDetection] = jsonEncoderOf[RealtimeSessionTurnDetection]
}
