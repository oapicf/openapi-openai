package model

import play.api.libs.json._

/**
  * Represents an individual service account in a project.
  * @param `object` The object type, which is always `organization.project.service_account`
  * @param id The identifier, which can be referenced in API endpoints
  * @param name The name of the service account
  * @param role `owner` or `member`
  * @param createdAt The Unix timestamp (in seconds) of when the service account was created
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class ProjectServiceAccount(
  `object`: ProjectServiceAccount.Object.Value,
  id: String,
  name: String,
  role: ProjectServiceAccount.Role.Value,
  createdAt: Int
)

object ProjectServiceAccount {
  implicit lazy val projectServiceAccountJsonFormat: Format[ProjectServiceAccount] = Json.format[ProjectServiceAccount]

  // noinspection TypeAnnotation
  object Object extends Enumeration {
    val OrganizationProjectServiceAccount = Value("organization.project.service_account")

    type Object = Value
    implicit lazy val ObjectJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }

  // noinspection TypeAnnotation
  object Role extends Enumeration {
    val Owner = Value("owner")
    val Member = Value("member")

    type Role = Value
    implicit lazy val RoleJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

