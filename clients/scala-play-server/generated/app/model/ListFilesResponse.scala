package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ListFilesResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:38:29.809972473Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class ListFilesResponse(
  `object`: String,
  data: List[OpenAIFile],
  firstId: String,
  lastId: String,
  hasMore: Boolean
)

object ListFilesResponse {
  implicit lazy val listFilesResponseJsonFormat: Format[ListFilesResponse] = Json.format[ListFilesResponse]
}

