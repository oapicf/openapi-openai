package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ListAssistantsResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T10:48:27.489746113Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class ListAssistantsResponse(
  `object`: String,
  data: List[AssistantObject],
  firstId: String,
  lastId: String,
  hasMore: Boolean
)

object ListAssistantsResponse {
  implicit lazy val listAssistantsResponseJsonFormat: Format[ListAssistantsResponse] = Json.format[ListAssistantsResponse]
}

