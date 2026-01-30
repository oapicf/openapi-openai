package model

import play.api.libs.json._

/**
  * The refusal content that is part of a message.
  * @param index The index of the refusal part in the message.
  * @param `type` Always `refusal`.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class MessageDeltaContentRefusalObject(
  index: Int,
  `type`: MessageDeltaContentRefusalObject.Type.Value,
  refusal: Option[String]
)

object MessageDeltaContentRefusalObject {
  implicit lazy val messageDeltaContentRefusalObjectJsonFormat: Format[MessageDeltaContentRefusalObject] = Json.format[MessageDeltaContentRefusalObject]

  // noinspection TypeAnnotation
  object Type extends Enumeration {
    val Refusal = Value("refusal")

    type Type = Value
    implicit lazy val TypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

