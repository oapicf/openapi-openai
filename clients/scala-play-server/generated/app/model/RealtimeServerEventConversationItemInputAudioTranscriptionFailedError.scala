package model

import play.api.libs.json._

/**
  * Details of the transcription error.
  * @param `type` The type of error.
  * @param code Error code, if any.
  * @param message A human-readable error message.
  * @param param Parameter related to the error, if any.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:38:29.809972473Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class RealtimeServerEventConversationItemInputAudioTranscriptionFailedError(
  `type`: Option[String],
  code: Option[String],
  message: Option[String],
  param: Option[String]
)

object RealtimeServerEventConversationItemInputAudioTranscriptionFailedError {
  implicit lazy val realtimeServerEventConversationItemInputAudioTranscriptionFailedErrorJsonFormat: Format[RealtimeServerEventConversationItemInputAudioTranscriptionFailedError] = Json.format[RealtimeServerEventConversationItemInputAudioTranscriptionFailedError]
}

