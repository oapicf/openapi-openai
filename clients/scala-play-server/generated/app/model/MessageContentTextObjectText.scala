package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for MessageContentTextObject_text.
  * @param value The data that makes up the text.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-04-14T13:53:34.453725706Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class MessageContentTextObjectText(
  value: String,
  annotations: List[MessageContentTextObjectTextAnnotationsInner]
)

object MessageContentTextObjectText {
  implicit lazy val messageContentTextObjectTextJsonFormat: Format[MessageContentTextObjectText] = Json.format[MessageContentTextObjectText]
}

