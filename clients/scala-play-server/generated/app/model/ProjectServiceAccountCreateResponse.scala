package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ProjectServiceAccountCreateResponse.
  * @param role Service accounts can only have one role of type `member`
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class ProjectServiceAccountCreateResponse(
  `object`: ProjectServiceAccountCreateResponse.Object.Value,
  id: String,
  name: String,
  role: ProjectServiceAccountCreateResponse.Role.Value,
  createdAt: Int,
  apiKey: ProjectServiceAccountApiKey
)

object ProjectServiceAccountCreateResponse {
  implicit lazy val projectServiceAccountCreateResponseJsonFormat: Format[ProjectServiceAccountCreateResponse] = Json.format[ProjectServiceAccountCreateResponse]

  // noinspection TypeAnnotation
  object Object extends Enumeration {
    val OrganizationProjectServiceAccount = Value("organization.project.service_account")

    type Object = Value
    implicit lazy val ObjectJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }

  // noinspection TypeAnnotation
  object Role extends Enumeration {
    val Member = Value("member")

    type Role = Value
    implicit lazy val RoleJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

