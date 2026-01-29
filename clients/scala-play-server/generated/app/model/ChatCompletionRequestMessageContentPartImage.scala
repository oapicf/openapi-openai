package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ChatCompletionRequestMessageContentPartImage.
  * @param `type` The type of the content part.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T10:48:27.489746113Z[Etc/UTC]", comments = "Generator version: 7.18.0")
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

