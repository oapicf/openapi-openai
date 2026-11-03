package model

import play.api.libs.json._

/**
  * Learn about [audio inputs](/docs/guides/audio). 
  * @param `type` The type of the content part. Always `input_audio`.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:38:29.809972473Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class ChatCompletionRequestMessageContentPartAudio(
  `type`: ChatCompletionRequestMessageContentPartAudio.Type.Value,
  inputAudio: ChatCompletionRequestMessageContentPartAudioInputAudio
)

object ChatCompletionRequestMessageContentPartAudio {
  implicit lazy val chatCompletionRequestMessageContentPartAudioJsonFormat: Format[ChatCompletionRequestMessageContentPartAudio] = Json.format[ChatCompletionRequestMessageContentPartAudio]

  // noinspection TypeAnnotation
  object Type extends Enumeration {
    val InputAudio = Value("input_audio")

    type Type = Value
    implicit lazy val TypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

