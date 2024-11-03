package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ListRunsResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-03T11:15:39.331426426Z[Etc/UTC]", comments = "Generator version: 7.9.0")
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

