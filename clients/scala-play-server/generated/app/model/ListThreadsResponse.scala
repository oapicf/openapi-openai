package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ListThreadsResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T10:48:27.489746113Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class ListThreadsResponse(
  `object`: String,
  data: List[ThreadObject],
  firstId: String,
  lastId: String,
  hasMore: Boolean
)

object ListThreadsResponse {
  implicit lazy val listThreadsResponseJsonFormat: Format[ListThreadsResponse] = Json.format[ListThreadsResponse]
}

