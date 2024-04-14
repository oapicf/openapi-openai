package model

import play.api.libs.json._

/**
  * Deletes the association between the assistant and the file, but does not delete the [File](/docs/api-reference/files) object itself.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-04-14T13:53:34.453725706Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class DeleteAssistantFileResponse(
  id: String,
  deleted: Boolean,
  `object`: DeleteAssistantFileResponse.Object.Value
)

object DeleteAssistantFileResponse {
  implicit lazy val deleteAssistantFileResponseJsonFormat: Format[DeleteAssistantFileResponse] = Json.format[DeleteAssistantFileResponse]

  // noinspection TypeAnnotation
  object Object extends Enumeration {
    val AssistantFileDeleted = Value("assistant.file.deleted")

    type Object = Value
    implicit lazy val ObjectJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

