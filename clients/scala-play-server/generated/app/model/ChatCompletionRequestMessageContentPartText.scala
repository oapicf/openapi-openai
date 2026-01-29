package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ChatCompletionRequestMessageContentPartText.
  * @param `type` The type of the content part.
  * @param text The text content.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T10:48:27.489746113Z[Etc/UTC]", comments = "Generator version: 7.18.0")
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

