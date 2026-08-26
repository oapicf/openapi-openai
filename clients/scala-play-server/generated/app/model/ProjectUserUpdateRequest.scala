package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ProjectUserUpdateRequest.
  * @param role `owner` or `member`
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-26T05:22:02.282422614Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ProjectUserUpdateRequest(
  role: ProjectUserUpdateRequest.Role.Value
)

object ProjectUserUpdateRequest {
  implicit lazy val projectUserUpdateRequestJsonFormat: Format[ProjectUserUpdateRequest] = Json.format[ProjectUserUpdateRequest]

  // noinspection TypeAnnotation
  object Role extends Enumeration {
    val Owner = Value("owner")
    val Member = Value("member")

    type Role = Value
    implicit lazy val RoleJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

