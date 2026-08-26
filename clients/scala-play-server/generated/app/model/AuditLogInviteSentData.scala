package model

import play.api.libs.json._

/**
  * The payload used to create the invite.
  * @param email The email invited to the organization.
  * @param role The role the email was invited to be. Is either `owner` or `member`.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-26T05:22:02.282422614Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class AuditLogInviteSentData(
  email: Option[String],
  role: Option[String]
)

object AuditLogInviteSentData {
  implicit lazy val auditLogInviteSentDataJsonFormat: Format[AuditLogInviteSentData] = Json.format[AuditLogInviteSentData]
}

