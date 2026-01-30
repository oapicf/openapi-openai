package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for UserRoleUpdateRequest.
  * @param role `owner` or `reader`
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class UserRoleUpdateRequest(
  role: UserRoleUpdateRequest.Role.Value
)

object UserRoleUpdateRequest {
  implicit lazy val userRoleUpdateRequestJsonFormat: Format[UserRoleUpdateRequest] = Json.format[UserRoleUpdateRequest]

  // noinspection TypeAnnotation
  object Role extends Enumeration {
    val Owner = Value("owner")
    val Reader = Value("reader")

    type Role = Value
    implicit lazy val RoleJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

