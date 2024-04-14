package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for DeleteAssistantResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-04-14T13:53:34.453725706Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class DeleteAssistantResponse(
  id: String,
  deleted: Boolean,
  `object`: DeleteAssistantResponse.Object.Value
)

object DeleteAssistantResponse {
  implicit lazy val deleteAssistantResponseJsonFormat: Format[DeleteAssistantResponse] = Json.format[DeleteAssistantResponse]

  // noinspection TypeAnnotation
  object Object extends Enumeration {
    val AssistantDeleted = Value("assistant.deleted")

    type Object = Value
    implicit lazy val ObjectJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

