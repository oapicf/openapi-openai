package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ChatCompletionRequestMessageContentPart.
  * @param `type` The type of the content part.
  * @param text The text content.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-03T11:15:39.331426426Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class ChatCompletionRequestMessageContentPart(
  `type`: ChatCompletionRequestMessageContentPart.Type.Value,
  text: String,
  imageUrl: ChatCompletionRequestMessageContentPartImageImageUrl
)

object ChatCompletionRequestMessageContentPart {
  implicit lazy val chatCompletionRequestMessageContentPartJsonFormat: Format[ChatCompletionRequestMessageContentPart] = Json.format[ChatCompletionRequestMessageContentPart]

  // noinspection TypeAnnotation
  object Type extends Enumeration {
    val Text = Value("text")
    val ImageUrl = Value("image_url")

    type Type = Value
    implicit lazy val TypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

