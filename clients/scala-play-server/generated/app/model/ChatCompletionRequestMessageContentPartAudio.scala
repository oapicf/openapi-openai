package model

import play.api.libs.json._

/**
  * Learn about [audio inputs](/docs/guides/audio). 
  * @param `type` The type of the content part. Always `input_audio`.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
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

