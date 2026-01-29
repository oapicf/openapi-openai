package model

import play.api.libs.json._

/**
  * References an image [File](/docs/api-reference/files) in the content of a message.
  * @param index The index of the content part in the message.
  * @param `type` Always `image_file`.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T10:48:27.489746113Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class MessageDeltaContentImageFileObject(
  index: Int,
  `type`: MessageDeltaContentImageFileObject.Type.Value,
  imageFile: Option[MessageDeltaContentImageFileObjectImageFile]
)

object MessageDeltaContentImageFileObject {
  implicit lazy val messageDeltaContentImageFileObjectJsonFormat: Format[MessageDeltaContentImageFileObject] = Json.format[MessageDeltaContentImageFileObject]

  // noinspection TypeAnnotation
  object Type extends Enumeration {
    val ImageFile = Value("image_file")

    type Type = Value
    implicit lazy val TypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

