package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for MessageObject_content_inner.
  * @param `type` Always `image_file`.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:38:29.809972473Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class MessageObjectContentInner(
  `type`: MessageObjectContentInner.Type.Value,
  imageFile: MessageContentImageFileObjectImageFile,
  imageUrl: MessageContentImageUrlObjectImageUrl,
  text: MessageContentTextObjectText,
  refusal: String
)

object MessageObjectContentInner {
  implicit lazy val messageObjectContentInnerJsonFormat: Format[MessageObjectContentInner] = Json.format[MessageObjectContentInner]

  // noinspection TypeAnnotation
  object Type extends Enumeration {
    val ImageFile = Value("image_file")
    val ImageUrl = Value("image_url")
    val Text = Value("text")
    val Refusal = Value("refusal")

    type Type = Value
    implicit lazy val TypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

