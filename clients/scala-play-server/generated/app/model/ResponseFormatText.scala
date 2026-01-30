package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ResponseFormatText.
  * @param `type` The type of response format being defined: `text`
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class ResponseFormatText(
  `type`: ResponseFormatText.Type.Value
)

object ResponseFormatText {
  implicit lazy val responseFormatTextJsonFormat: Format[ResponseFormatText] = Json.format[ResponseFormatText]

  // noinspection TypeAnnotation
  object Type extends Enumeration {
    val Text = Value("text")

    type Type = Value
    implicit lazy val TypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

