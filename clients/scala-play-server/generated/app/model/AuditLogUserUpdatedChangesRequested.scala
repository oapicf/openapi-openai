package model

import play.api.libs.json._

/**
  * The payload used to update the user.
  * @param role The role of the user. Is either `owner` or `member`.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class AuditLogUserUpdatedChangesRequested(
  role: Option[String]
)

object AuditLogUserUpdatedChangesRequested {
  implicit lazy val auditLogUserUpdatedChangesRequestedJsonFormat: Format[AuditLogUserUpdatedChangesRequested] = Json.format[AuditLogUserUpdatedChangesRequested]
}

