package model

import play.api.libs.json._

/**
  * Represents an individual `user` within an organization.
  * @param `object` The object type, which is always `organization.user`
  * @param id The identifier, which can be referenced in API endpoints
  * @param name The name of the user
  * @param email The email address of the user
  * @param role `owner` or `reader`
  * @param addedAt The Unix timestamp (in seconds) of when the user was added.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class User(
  `object`: User.Object.Value,
  id: String,
  name: String,
  email: String,
  role: User.Role.Value,
  addedAt: Int
)

object User {
  implicit lazy val userJsonFormat: Format[User] = Json.format[User]

  // noinspection TypeAnnotation
  object Object extends Enumeration {
    val OrganizationUser = Value("organization.user")

    type Object = Value
    implicit lazy val ObjectJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }

  // noinspection TypeAnnotation
  object Role extends Enumeration {
    val Owner = Value("owner")
    val Reader = Value("reader")

    type Role = Value
    implicit lazy val RoleJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

