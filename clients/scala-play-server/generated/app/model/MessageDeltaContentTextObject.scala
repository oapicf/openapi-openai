package model

import play.api.libs.json._

/**
  * The text content that is part of a message.
  * @param index The index of the content part in the message.
  * @param `type` Always `text`.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-03T11:15:39.331426426Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class MessageDeltaContentTextObject(
  index: Int,
  `type`: MessageDeltaContentTextObject.Type.Value,
  text: Option[MessageDeltaContentTextObjectText]
)

object MessageDeltaContentTextObject {
  implicit lazy val messageDeltaContentTextObjectJsonFormat: Format[MessageDeltaContentTextObject] = Json.format[MessageDeltaContentTextObject]

  // noinspection TypeAnnotation
  object Type extends Enumeration {
    val Text = Value("text")

    type Type = Value
    implicit lazy val TypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

