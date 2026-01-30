package model

import play.api.libs.json._

/**
  * An object describing text to classify.
  * @param `type` Always `text`.
  * @param text A string of text to classify.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class CreateModerationRequestInputOneOfInnerOneOf1(
  `type`: CreateModerationRequestInputOneOfInnerOneOf1.Type.Value,
  text: String
)

object CreateModerationRequestInputOneOfInnerOneOf1 {
  implicit lazy val createModerationRequestInputOneOfInnerOneOf1JsonFormat: Format[CreateModerationRequestInputOneOfInnerOneOf1] = Json.format[CreateModerationRequestInputOneOfInnerOneOf1]

  // noinspection TypeAnnotation
  object Type extends Enumeration {
    val Text = Value("text")

    type Type = Value
    implicit lazy val TypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

