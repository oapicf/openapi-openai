package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ListAssistantFilesResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T10:48:27.489746113Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class ListAssistantFilesResponse(
  `object`: String,
  data: List[AssistantFileObject],
  firstId: String,
  lastId: String,
  hasMore: Boolean
)

object ListAssistantFilesResponse {
  implicit lazy val listAssistantFilesResponseJsonFormat: Format[ListAssistantFilesResponse] = Json.format[ListAssistantFilesResponse]
}

