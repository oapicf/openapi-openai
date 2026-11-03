package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ProjectServiceAccountDeleteResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:38:29.809972473Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class ProjectServiceAccountDeleteResponse(
  `object`: ProjectServiceAccountDeleteResponse.Object.Value,
  id: String,
  deleted: Boolean
)

object ProjectServiceAccountDeleteResponse {
  implicit lazy val projectServiceAccountDeleteResponseJsonFormat: Format[ProjectServiceAccountDeleteResponse] = Json.format[ProjectServiceAccountDeleteResponse]

  // noinspection TypeAnnotation
  object Object extends Enumeration {
    val OrganizationProjectServiceAccountDeleted = Value("organization.project.service_account.deleted")

    type Object = Value
    implicit lazy val ObjectJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

