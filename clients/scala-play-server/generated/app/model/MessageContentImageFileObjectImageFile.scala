package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for MessageContentImageFileObject_image_file.
  * @param fileId The [File](/docs/api-reference/files) ID of the image in the message content.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-04-14T13:53:34.453725706Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class MessageContentImageFileObjectImageFile(
  fileId: String
)

object MessageContentImageFileObjectImageFile {
  implicit lazy val messageContentImageFileObjectImageFileJsonFormat: Format[MessageContentImageFileObjectImageFile] = Json.format[MessageContentImageFileObjectImageFile]
}

