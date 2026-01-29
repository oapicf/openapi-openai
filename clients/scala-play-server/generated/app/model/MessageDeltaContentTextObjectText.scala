package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for MessageDeltaContentTextObject_text.
  * @param value The data that makes up the text.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T10:48:27.489746113Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class MessageDeltaContentTextObjectText(
  value: Option[String],
  annotations: Option[List[MessageDeltaContentTextObjectTextAnnotationsInner]]
)

object MessageDeltaContentTextObjectText {
  implicit lazy val messageDeltaContentTextObjectTextJsonFormat: Format[MessageDeltaContentTextObjectText] = Json.format[MessageDeltaContentTextObjectText]
}

