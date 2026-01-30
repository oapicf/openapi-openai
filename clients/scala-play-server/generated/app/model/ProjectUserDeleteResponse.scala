package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ProjectUserDeleteResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class ProjectUserDeleteResponse(
  `object`: ProjectUserDeleteResponse.Object.Value,
  id: String,
  deleted: Boolean
)

object ProjectUserDeleteResponse {
  implicit lazy val projectUserDeleteResponseJsonFormat: Format[ProjectUserDeleteResponse] = Json.format[ProjectUserDeleteResponse]

  // noinspection TypeAnnotation
  object Object extends Enumeration {
    val OrganizationProjectUserDeleted = Value("organization.project.user.deleted")

    type Object = Value
    implicit lazy val ObjectJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

