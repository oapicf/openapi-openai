package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for Invite_projects_inner.
  * @param id Project's public ID
  * @param role Project membership role
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class InviteProjectsInner(
  id: Option[String],
  role: Option[InviteProjectsInner.Role.Value]
)

object InviteProjectsInner {
  implicit lazy val inviteProjectsInnerJsonFormat: Format[InviteProjectsInner] = Json.format[InviteProjectsInner]

  // noinspection TypeAnnotation
  object Role extends Enumeration {
    val Member = Value("member")
    val Owner = Value("owner")

    type Role = Value
    implicit lazy val RoleJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

