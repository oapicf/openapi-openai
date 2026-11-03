package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ListRunsResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:38:29.809972473Z[Etc/UTC]", comments = "Generator version: 7.26.0")
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

