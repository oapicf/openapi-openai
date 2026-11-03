package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for MessageContentImageFileObject_image_file.
  * @param fileId The [File](/docs/api-reference/files) ID of the image in the message content. Set `purpose=\"vision\"` when uploading the File if you need to later display the file content.
  * @param detail Specifies the detail level of the image if specified by the user. `low` uses fewer tokens, you can opt in to high resolution using `high`.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:38:29.809972473Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class MessageContentImageFileObjectImageFile(
  fileId: String,
  detail: Option[MessageContentImageFileObjectImageFile.Detail.Value]
)

object MessageContentImageFileObjectImageFile {
  implicit lazy val messageContentImageFileObjectImageFileJsonFormat: Format[MessageContentImageFileObjectImageFile] = Json.format[MessageContentImageFileObjectImageFile]

  // noinspection TypeAnnotation
  object Detail extends Enumeration {
    val Auto = Value("auto")
    val Low = Value("low")
    val High = Value("high")

    type Detail = Value
    implicit lazy val DetailJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

