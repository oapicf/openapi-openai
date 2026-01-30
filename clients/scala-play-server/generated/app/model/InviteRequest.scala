package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for InviteRequest.
  * @param email Send an email to this address
  * @param role `owner` or `reader`
  * @param projects An array of projects to which membership is granted at the same time the org invite is accepted. If omitted, the user will be invited to the default project for compatibility with legacy behavior.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class InviteRequest(
  email: String,
  role: InviteRequest.Role.Value,
  projects: Option[List[InviteRequestProjectsInner]]
)

object InviteRequest {
  implicit lazy val inviteRequestJsonFormat: Format[InviteRequest] = Json.format[InviteRequest]

  // noinspection TypeAnnotation
  object Role extends Enumeration {
    val Reader = Value("reader")
    val Owner = Value("owner")

    type Role = Value
    implicit lazy val RoleJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

