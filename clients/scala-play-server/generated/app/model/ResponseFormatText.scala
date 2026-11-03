package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ResponseFormatText.
  * @param `type` The type of response format being defined: `text`
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:38:29.809972473Z[Etc/UTC]", comments = "Generator version: 7.26.0")
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

