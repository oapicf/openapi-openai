package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for MessageContentTextAnnotationsFilePathObject_file_path.
  * @param fileId The ID of the file that was generated.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-04-14T13:53:34.453725706Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class MessageContentTextAnnotationsFilePathObjectFilePath(
  fileId: String
)

object MessageContentTextAnnotationsFilePathObjectFilePath {
  implicit lazy val messageContentTextAnnotationsFilePathObjectFilePathJsonFormat: Format[MessageContentTextAnnotationsFilePathObjectFilePath] = Json.format[MessageContentTextAnnotationsFilePathObjectFilePath]
}

