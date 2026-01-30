package model

import play.api.libs.json._

/**
  * Represents an individual user in a project.
  * @param `object` The object type, which is always `organization.project.user`
  * @param id The identifier, which can be referenced in API endpoints
  * @param name The name of the user
  * @param email The email address of the user
  * @param role `owner` or `member`
  * @param addedAt The Unix timestamp (in seconds) of when the project was added.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class ProjectUser(
  `object`: ProjectUser.Object.Value,
  id: String,
  name: String,
  email: String,
  role: ProjectUser.Role.Value,
  addedAt: Int
)

object ProjectUser {
  implicit lazy val projectUserJsonFormat: Format[ProjectUser] = Json.format[ProjectUser]

  // noinspection TypeAnnotation
  object Object extends Enumeration {
    val OrganizationProjectUser = Value("organization.project.user")

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

