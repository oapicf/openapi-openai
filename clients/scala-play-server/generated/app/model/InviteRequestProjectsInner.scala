package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for InviteRequest_projects_inner.
  * @param id Project's public ID
  * @param role Project membership role
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:38:29.809972473Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class InviteRequestProjectsInner(
  id: String,
  role: InviteRequestProjectsInner.Role.Value
)

object InviteRequestProjectsInner {
  implicit lazy val inviteRequestProjectsInnerJsonFormat: Format[InviteRequestProjectsInner] = Json.format[InviteRequestProjectsInner]

  // noinspection TypeAnnotation
  object Role extends Enumeration {
    val Member = Value("member")
    val Owner = Value("owner")

    type Role = Value
    implicit lazy val RoleJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

