package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for MessageDeltaContentImageFileObject_image_file.
  * @param fileId The [File](/docs/api-reference/files) ID of the image in the message content.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T10:48:27.489746113Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class MessageDeltaContentImageFileObjectImageFile(
  fileId: Option[String]
)

object MessageDeltaContentImageFileObjectImageFile {
  implicit lazy val messageDeltaContentImageFileObjectImageFileJsonFormat: Format[MessageDeltaContentImageFileObjectImageFile] = Json.format[MessageDeltaContentImageFileObjectImageFile]
}

