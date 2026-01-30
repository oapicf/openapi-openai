package model

import play.api.libs.json._

/**
  * The payload used to create the invite.
  * @param email The email invited to the organization.
  * @param role The role the email was invited to be. Is either `owner` or `member`.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class AuditLogInviteSentData(
  email: Option[String],
  role: Option[String]
)

object AuditLogInviteSentData {
  implicit lazy val auditLogInviteSentDataJsonFormat: Format[AuditLogInviteSentData] = Json.format[AuditLogInviteSentData]
}

