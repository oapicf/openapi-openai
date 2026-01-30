package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ListRunsResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class ListRunsResponse(
  `object`: String,
  data: List[RunObject],
  firstId: String,
  lastId: String,
  hasMore: Boolean
)

object ListRunsResponse {
  implicit lazy val listRunsResponseJsonFormat: Format[ListRunsResponse] = Json.format[ListRunsResponse]
}

