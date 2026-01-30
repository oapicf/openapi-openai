package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ProjectUserCreateRequest.
  * @param userId The ID of the user.
  * @param role `owner` or `member`
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class ProjectUserCreateRequest(
  userId: String,
  role: ProjectUserCreateRequest.Role.Value
)

object ProjectUserCreateRequest {
  implicit lazy val projectUserCreateRequestJsonFormat: Format[ProjectUserCreateRequest] = Json.format[ProjectUserCreateRequest]

  // noinspection TypeAnnotation
  object Role extends Enumeration {
    val Owner = Value("owner")
    val Member = Value("member")

    type Role = Value
    implicit lazy val RoleJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

