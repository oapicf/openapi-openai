package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import RealtimeSessionCreateResponseTurnDetection._

case class RealtimeSessionCreateResponseTurnDetection (
  /* Type of turn detection, only `server_vad` is currently supported.  */
  `type`: Option[String],
/* Activation threshold for VAD (0.0 to 1.0), this defaults to 0.5. A  higher threshold will require louder audio to activate the model, and  thus might perform better in noisy environments.  */
  threshold: Option[BigDecimal],
/* Amount of audio to include before the VAD detected speech (in  milliseconds). Defaults to 300ms.  */
  prefixPaddingMs: Option[Integer],
/* Duration of silence to detect speech stop (in milliseconds). Defaults  to 500ms. With shorter values the model will respond more quickly,  but may jump in on short pauses from the user.  */
  silenceDurationMs: Option[Integer])

object RealtimeSessionCreateResponseTurnDetection {
  import DateTimeCodecs._

  implicit val RealtimeSessionCreateResponseTurnDetectionCodecJson: CodecJson[RealtimeSessionCreateResponseTurnDetection] = CodecJson.derive[RealtimeSessionCreateResponseTurnDetection]
  implicit val RealtimeSessionCreateResponseTurnDetectionDecoder: EntityDecoder[RealtimeSessionCreateResponseTurnDetection] = jsonOf[RealtimeSessionCreateResponseTurnDetection]
  implicit val RealtimeSessionCreateResponseTurnDetectionEncoder: EntityEncoder[RealtimeSessionCreateResponseTurnDetection] = jsonEncoderOf[RealtimeSessionCreateResponseTurnDetection]
}
