package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for MessageDeltaContentTextAnnotationsFilePathObject_file_path.
  * @param fileId The ID of the file that was generated.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-04-14T13:53:34.453725706Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class MessageDeltaContentTextAnnotationsFilePathObjectFilePath(
  fileId: Option[String]
)

object MessageDeltaContentTextAnnotationsFilePathObjectFilePath {
  implicit lazy val messageDeltaContentTextAnnotationsFilePathObjectFilePathJsonFormat: Format[MessageDeltaContentTextAnnotationsFilePathObjectFilePath] = Json.format[MessageDeltaContentTextAnnotationsFilePathObjectFilePath]
}

