package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ListMessageFilesResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-03T11:15:39.331426426Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class ListMessageFilesResponse(
  `object`: String,
  data: List[MessageFileObject],
  firstId: String,
  lastId: String,
  hasMore: Boolean
)

object ListMessageFilesResponse {
  implicit lazy val listMessageFilesResponseJsonFormat: Format[ListMessageFilesResponse] = Json.format[ListMessageFilesResponse]
}

