package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ChatCompletionRequestUserMessageContentPart.
  * @param `type` The type of the content part.
  * @param text The text content.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:38:29.809972473Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class ChatCompletionRequestUserMessageContentPart(
  `type`: ChatCompletionRequestUserMessageContentPart.Type.Value,
  text: String,
  imageUrl: ChatCompletionRequestMessageContentPartImageImageUrl,
  inputAudio: ChatCompletionRequestMessageContentPartAudioInputAudio
)

object ChatCompletionRequestUserMessageContentPart {
  implicit lazy val chatCompletionRequestUserMessageContentPartJsonFormat: Format[ChatCompletionRequestUserMessageContentPart] = Json.format[ChatCompletionRequestUserMessageContentPart]

  // noinspection TypeAnnotation
  object Type extends Enumeration {
    val Text = Value("text")
    val ImageUrl = Value("image_url")
    val InputAudio = Value("input_audio")

    type Type = Value
    implicit lazy val TypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

