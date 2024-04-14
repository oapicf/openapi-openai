package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ListAssistantsResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-04-14T13:53:34.453725706Z[Etc/UTC]", comments = "Generator version: 7.4.0")
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

