package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ChatCompletionRequestMessageContentPartImage.
  * @param `type` The type of the content part.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-03T11:15:39.331426426Z[Etc/UTC]", comments = "Generator version: 7.9.0")
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

