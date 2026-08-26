package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ProjectUserListResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-26T05:22:02.282422614Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ProjectUserListResponse(
  `object`: String,
  data: List[ProjectUser],
  firstId: String,
  lastId: String,
  hasMore: Boolean
)

object ProjectUserListResponse {
  implicit lazy val projectUserListResponseJsonFormat: Format[ProjectUserListResponse] = Json.format[ProjectUserListResponse]
}

