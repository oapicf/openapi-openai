package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for MessageDeltaContentTextObject_text.
  * @param value The data that makes up the text.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-03T11:15:39.331426426Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class MessageDeltaContentTextObjectText(
  value: Option[String],
  annotations: Option[List[MessageDeltaContentTextObjectTextAnnotationsInner]]
)

object MessageDeltaContentTextObjectText {
  implicit lazy val messageDeltaContentTextObjectTextJsonFormat: Format[MessageDeltaContentTextObjectText] = Json.format[MessageDeltaContentTextObjectText]
}

