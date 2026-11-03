package model

import play.api.libs.json._

/**
  * The details for events with this `type`.
  * @param id The ID of the invite.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:38:29.809972473Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class AuditLogInviteAccepted(
  id: Option[String]
)

object AuditLogInviteAccepted {
  implicit lazy val auditLogInviteAcceptedJsonFormat: Format[AuditLogInviteAccepted] = Json.format[AuditLogInviteAccepted]
}

