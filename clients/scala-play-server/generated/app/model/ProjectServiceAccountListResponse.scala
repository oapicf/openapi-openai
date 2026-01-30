package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ProjectServiceAccountListResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class ProjectServiceAccountListResponse(
  `object`: ProjectServiceAccountListResponse.Object.Value,
  data: List[ProjectServiceAccount],
  firstId: String,
  lastId: String,
  hasMore: Boolean
)

object ProjectServiceAccountListResponse {
  implicit lazy val projectServiceAccountListResponseJsonFormat: Format[ProjectServiceAccountListResponse] = Json.format[ProjectServiceAccountListResponse]

  // noinspection TypeAnnotation
  object Object extends Enumeration {
    val List = Value("list")

    type Object = Value
    implicit lazy val ObjectJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

