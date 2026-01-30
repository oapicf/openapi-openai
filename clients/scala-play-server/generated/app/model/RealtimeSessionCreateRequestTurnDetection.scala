package model

import play.api.libs.json._

/**
  * Configuration for turn detection. Can be set to `null` to turn off. Server  VAD means that the model will detect the start and end of speech based on  audio volume and respond at the end of user speech. 
  * @param `type` Type of turn detection, only `server_vad` is currently supported. 
  * @param threshold Activation threshold for VAD (0.0 to 1.0), this defaults to 0.5. A  higher threshold will require louder audio to activate the model, and  thus might perform better in noisy environments. 
  * @param prefixPaddingMs Amount of audio to include before the VAD detected speech (in  milliseconds). Defaults to 300ms. 
  * @param silenceDurationMs Duration of silence to detect speech stop (in milliseconds). Defaults  to 500ms. With shorter values the model will respond more quickly,  but may jump in on short pauses from the user. 
  * @param createResponse Whether or not to automatically generate a response when VAD is enabled. `true` by default. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class RealtimeSessionCreateRequestTurnDetection(
  `type`: Option[String],
  threshold: Option[BigDecimal],
  prefixPaddingMs: Option[Int],
  silenceDurationMs: Option[Int],
  createResponse: Option[Boolean]
)

object RealtimeSessionCreateRequestTurnDetection {
  implicit lazy val realtimeSessionCreateRequestTurnDetectionJsonFormat: Format[RealtimeSessionCreateRequestTurnDetection] = Json.format[RealtimeSessionCreateRequestTurnDetection]
}

