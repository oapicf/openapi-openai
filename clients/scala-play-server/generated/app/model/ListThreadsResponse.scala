package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ListThreadsResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-03T11:15:39.331426426Z[Etc/UTC]", comments = "Generator version: 7.9.0")
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

