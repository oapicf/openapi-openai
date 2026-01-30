package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for MessageDeltaObject_delta_content_inner.
  * @param index The index of the content part in the message.
  * @param `type` Always `image_file`.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class MessageDeltaObjectDeltaContentInner(
  index: Int,
  `type`: MessageDeltaObjectDeltaContentInner.Type.Value,
  imageFile: Option[MessageDeltaContentImageFileObjectImageFile],
  text: Option[MessageDeltaContentTextObjectText],
  refusal: Option[String],
  imageUrl: Option[MessageDeltaContentImageUrlObjectImageUrl]
)

object MessageDeltaObjectDeltaContentInner {
  implicit lazy val messageDeltaObjectDeltaContentInnerJsonFormat: Format[MessageDeltaObjectDeltaContentInner] = Json.format[MessageDeltaObjectDeltaContentInner]

  // noinspection TypeAnnotation
  object Type extends Enumeration {
    val ImageFile = Value("image_file")
    val Text = Value("text")
    val Refusal = Value("refusal")
    val ImageUrl = Value("image_url")

    type Type = Value
    implicit lazy val TypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

