package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ListRunsResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T10:48:27.489746113Z[Etc/UTC]", comments = "Generator version: 7.18.0")
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

