package model

import play.api.libs.json._

/**
  * Represents an individual `invite` to the organization.
  * @param `object` The object type, which is always `organization.invite`
  * @param id The identifier, which can be referenced in API endpoints
  * @param email The email address of the individual to whom the invite was sent
  * @param role `owner` or `reader`
  * @param status `accepted`,`expired`, or `pending`
  * @param invitedAt The Unix timestamp (in seconds) of when the invite was sent.
  * @param expiresAt The Unix timestamp (in seconds) of when the invite expires.
  * @param acceptedAt The Unix timestamp (in seconds) of when the invite was accepted.
  * @param projects The projects that were granted membership upon acceptance of the invite.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class Invite(
  `object`: Invite.Object.Value,
  id: String,
  email: String,
  role: Invite.Role.Value,
  status: Invite.Status.Value,
  invitedAt: Int,
  expiresAt: Int,
  acceptedAt: Option[Int],
  projects: Option[List[InviteProjectsInner]]
)

object Invite {
  implicit lazy val inviteJsonFormat: Format[Invite] = Json.format[Invite]

  // noinspection TypeAnnotation
  object Object extends Enumeration {
    val OrganizationInvite = Value("organization.invite")

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

  // noinspection TypeAnnotation
  object Status extends Enumeration {
    val Accepted = Value("accepted")
    val Expired = Value("expired")
    val Pending = Value("pending")

    type Status = Value
    implicit lazy val StatusJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

