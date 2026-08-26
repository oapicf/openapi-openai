package model

import play.api.libs.json._

/**
  * The payload used to updated the service account.
  * @param role The role of the service account. Is either `owner` or `member`.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-26T05:22:02.282422614Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class AuditLogServiceAccountUpdatedChangesRequested(
  role: Option[String]
)

object AuditLogServiceAccountUpdatedChangesRequested {
  implicit lazy val auditLogServiceAccountUpdatedChangesRequestedJsonFormat: Format[AuditLogServiceAccountUpdatedChangesRequested] = Json.format[AuditLogServiceAccountUpdatedChangesRequested]
}

