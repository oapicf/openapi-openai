package model

import play.api.libs.json._

/**
  * The text content that is part of a message.
  * @param `type` Always `text`.
  * @param text Text content to be sent to the model
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:38:29.809972473Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class MessageRequestContentTextObject(
  `type`: MessageRequestContentTextObject.Type.Value,
  text: String
)

object MessageRequestContentTextObject {
  implicit lazy val messageRequestContentTextObjectJsonFormat: Format[MessageRequestContentTextObject] = Json.format[MessageRequestContentTextObject]

  // noinspection TypeAnnotation
  object Type extends Enumeration {
    val Text = Value("text")

    type Type = Value
    implicit lazy val TypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

