package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for MessageContentTextAnnotationsFilePathObject_file_path.
  * @param fileId The ID of the file that was generated.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T10:48:27.489746113Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class MessageContentTextAnnotationsFilePathObjectFilePath(
  fileId: String
)

object MessageContentTextAnnotationsFilePathObjectFilePath {
  implicit lazy val messageContentTextAnnotationsFilePathObjectFilePathJsonFormat: Format[MessageContentTextAnnotationsFilePathObjectFilePath] = Json.format[MessageContentTextAnnotationsFilePathObjectFilePath]
}

