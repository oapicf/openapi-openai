package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for MessageDeltaObject_delta_content_inner.
  * @param index The index of the content part in the message.
  * @param `type` Always `image_file`.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-04-14T13:53:34.453725706Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class MessageDeltaObjectDeltaContentInner(
  index: Int,
  `type`: MessageDeltaObjectDeltaContentInner.Type.Value,
  imageFile: Option[MessageDeltaContentImageFileObjectImageFile],
  text: Option[MessageDeltaContentTextObjectText]
)

object MessageDeltaObjectDeltaContentInner {
  implicit lazy val messageDeltaObjectDeltaContentInnerJsonFormat: Format[MessageDeltaObjectDeltaContentInner] = Json.format[MessageDeltaObjectDeltaContentInner]

  // noinspection TypeAnnotation
  object Type extends Enumeration {
    val ImageFile = Value("image_file")
    val Text = Value("text")

    type Type = Value
    implicit lazy val TypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

