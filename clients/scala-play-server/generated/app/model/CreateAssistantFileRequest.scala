package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CreateAssistantFileRequest.
  * @param fileId A [File](/docs/api-reference/files) ID (with `purpose=\"assistants\"`) that the assistant should use. Useful for tools like `retrieval` and `code_interpreter` that can access files.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T10:48:27.489746113Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class CreateAssistantFileRequest(
  fileId: String
)

object CreateAssistantFileRequest {
  implicit lazy val createAssistantFileRequestJsonFormat: Format[CreateAssistantFileRequest] = Json.format[CreateAssistantFileRequest]
}

