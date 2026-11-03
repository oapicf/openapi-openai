package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ChatCompletionRequestMessageContentPartAudio_input_audio.
  * @param data Base64 encoded audio data.
  * @param format The format of the encoded audio data. Currently supports \"wav\" and \"mp3\". 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:38:29.809972473Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class ChatCompletionRequestMessageContentPartAudioInputAudio(
  data: String,
  format: ChatCompletionRequestMessageContentPartAudioInputAudio.Format.Value
)

object ChatCompletionRequestMessageContentPartAudioInputAudio {
  implicit lazy val chatCompletionRequestMessageContentPartAudioInputAudioJsonFormat: Format[ChatCompletionRequestMessageContentPartAudioInputAudio] = Json.format[ChatCompletionRequestMessageContentPartAudioInputAudio]

  // noinspection TypeAnnotation
  object Format extends Enumeration {
    val Wav = Value("wav")
    val Mp3 = Value("mp3")

    type Format = Value
    implicit lazy val FormatJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

