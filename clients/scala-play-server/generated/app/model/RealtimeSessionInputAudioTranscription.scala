package model

import play.api.libs.json._

/**
  * Configuration for input audio transcription, defaults to off and can be  set to `null` to turn off once on. Input audio transcription is not native  to the model, since the model consumes audio directly. Transcription runs  asynchronously through Whisper and should be treated as rough guidance  rather than the representation understood by the model. 
  * @param model The model to use for transcription, `whisper-1` is the only currently  supported model. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:38:29.809972473Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class RealtimeSessionInputAudioTranscription(
  model: Option[String]
)

object RealtimeSessionInputAudioTranscription {
  implicit lazy val realtimeSessionInputAudioTranscriptionJsonFormat: Format[RealtimeSessionInputAudioTranscription] = Json.format[RealtimeSessionInputAudioTranscription]
}

