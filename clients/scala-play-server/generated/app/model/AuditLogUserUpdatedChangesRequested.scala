package model

import play.api.libs.json._

/**
  * The payload used to update the user.
  * @param role The role of the user. Is either `owner` or `member`.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-26T05:22:02.282422614Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class AuditLogUserUpdatedChangesRequested(
  role: Option[String]
)

object AuditLogUserUpdatedChangesRequested {
  implicit lazy val auditLogUserUpdatedChangesRequestedJsonFormat: Format[AuditLogUserUpdatedChangesRequested] = Json.format[AuditLogUserUpdatedChangesRequested]
}

