package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for MessageDeltaContentTextAnnotationsFilePathObject_file_path.
  * @param fileId The ID of the file that was generated.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T10:48:27.489746113Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class MessageDeltaContentTextAnnotationsFilePathObjectFilePath(
  fileId: Option[String]
)

object MessageDeltaContentTextAnnotationsFilePathObjectFilePath {
  implicit lazy val messageDeltaContentTextAnnotationsFilePathObjectFilePathJsonFormat: Format[MessageDeltaContentTextAnnotationsFilePathObjectFilePath] = Json.format[MessageDeltaContentTextAnnotationsFilePathObjectFilePath]
}

