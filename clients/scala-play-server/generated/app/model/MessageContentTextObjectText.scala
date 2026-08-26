package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for MessageContentTextObject_text.
  * @param value The data that makes up the text.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-26T05:22:02.282422614Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class MessageContentTextObjectText(
  value: String,
  annotations: List[MessageContentTextObjectTextAnnotationsInner]
)

object MessageContentTextObjectText {
  implicit lazy val messageContentTextObjectTextJsonFormat: Format[MessageContentTextObjectText] = Json.format[MessageContentTextObjectText]
}

