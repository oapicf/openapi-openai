package model

import play.api.libs.json._

/**
  * The text content that is part of a message.
  * @param `type` Always `text`.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-26T05:22:02.282422614Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class MessageContentTextObject(
  `type`: MessageContentTextObject.Type.Value,
  text: MessageContentTextObjectText
)

object MessageContentTextObject {
  implicit lazy val messageContentTextObjectJsonFormat: Format[MessageContentTextObject] = Json.format[MessageContentTextObject]

  // noinspection TypeAnnotation
  object Type extends Enumeration {
    val Text = Value("text")

    type Type = Value
    implicit lazy val TypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

