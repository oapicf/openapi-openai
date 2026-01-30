package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for Array_of_content_parts_inner.
  * @param `type` Always `image_file`.
  * @param text Text content to be sent to the model
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class ArrayOfContentPartsInner(
  `type`: ArrayOfContentPartsInner.Type.Value,
  imageFile: MessageContentImageFileObjectImageFile,
  imageUrl: MessageContentImageUrlObjectImageUrl,
  text: String
)

object ArrayOfContentPartsInner {
  implicit lazy val arrayOfContentPartsInnerJsonFormat: Format[ArrayOfContentPartsInner] = Json.format[ArrayOfContentPartsInner]

  // noinspection TypeAnnotation
  object Type extends Enumeration {
    val ImageFile = Value("image_file")
    val ImageUrl = Value("image_url")
    val Text = Value("text")

    type Type = Value
    implicit lazy val TypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

