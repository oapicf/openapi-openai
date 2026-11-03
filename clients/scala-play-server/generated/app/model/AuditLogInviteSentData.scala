package model

import play.api.libs.json._

/**
  * The payload used to create the invite.
  * @param email The email invited to the organization.
  * @param role The role the email was invited to be. Is either `owner` or `member`.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:38:29.809972473Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class AuditLogInviteSentData(
  email: Option[String],
  role: Option[String]
)

object AuditLogInviteSentData {
  implicit lazy val auditLogInviteSentDataJsonFormat: Format[AuditLogInviteSentData] = Json.format[AuditLogInviteSentData]
}

