package model

import play.api.libs.json._

/**
  * The payload used to update the project.
  * @param title The title of the project as seen on the dashboard.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class AuditLogProjectUpdatedChangesRequested(
  title: Option[String]
)

object AuditLogProjectUpdatedChangesRequested {
  implicit lazy val auditLogProjectUpdatedChangesRequestedJsonFormat: Format[AuditLogProjectUpdatedChangesRequested] = Json.format[AuditLogProjectUpdatedChangesRequested]
}

