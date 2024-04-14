package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ChatCompletionRequestMessageContentPartText.
  * @param `type` The type of the content part.
  * @param text The text content.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-04-14T13:53:34.453725706Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class ChatCompletionRequestMessageContentPartText(
  `type`: ChatCompletionRequestMessageContentPartText.Type.Value,
  text: String
)

object ChatCompletionRequestMessageContentPartText {
  implicit lazy val chatCompletionRequestMessageContentPartTextJsonFormat: Format[ChatCompletionRequestMessageContentPartText] = Json.format[ChatCompletionRequestMessageContentPartText]

  // noinspection TypeAnnotation
  object Type extends Enumeration {
    val Text = Value("text")

    type Type = Value
    implicit lazy val TypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

