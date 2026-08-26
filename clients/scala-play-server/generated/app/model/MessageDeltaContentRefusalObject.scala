package model

import play.api.libs.json._

/**
  * The refusal content that is part of a message.
  * @param index The index of the refusal part in the message.
  * @param `type` Always `refusal`.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-26T05:22:02.282422614Z[Etc/UTC]", comments = "Generator version: 7.24.0")
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

