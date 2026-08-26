package model

import play.api.libs.json._

/**
  * References an image [File](/docs/api-reference/files) in the content of a message.
  * @param `type` Always `image_file`.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-26T05:22:02.282422614Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class MessageContentImageFileObject(
  `type`: MessageContentImageFileObject.Type.Value,
  imageFile: MessageContentImageFileObjectImageFile
)

object MessageContentImageFileObject {
  implicit lazy val messageContentImageFileObjectJsonFormat: Format[MessageContentImageFileObject] = Json.format[MessageContentImageFileObject]

  // noinspection TypeAnnotation
  object Type extends Enumeration {
    val ImageFile = Value("image_file")

    type Type = Value
    implicit lazy val TypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

