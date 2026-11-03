package model

import play.api.libs.json._

/**
  * Learn about [image inputs](/docs/guides/vision). 
  * @param `type` The type of the content part.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:38:29.809972473Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class ChatCompletionRequestMessageContentPartImage(
  `type`: ChatCompletionRequestMessageContentPartImage.Type.Value,
  imageUrl: ChatCompletionRequestMessageContentPartImageImageUrl
)

object ChatCompletionRequestMessageContentPartImage {
  implicit lazy val chatCompletionRequestMessageContentPartImageJsonFormat: Format[ChatCompletionRequestMessageContentPartImage] = Json.format[ChatCompletionRequestMessageContentPartImage]

  // noinspection TypeAnnotation
  object Type extends Enumeration {
    val ImageUrl = Value("image_url")

    type Type = Value
    implicit lazy val TypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

