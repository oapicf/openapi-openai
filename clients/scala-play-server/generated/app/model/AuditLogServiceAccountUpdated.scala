package model

import play.api.libs.json._

/**
  * The details for events with this `type`.
  * @param id The service account ID.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class AuditLogServiceAccountUpdated(
  id: Option[String],
  changesRequested: Option[AuditLogServiceAccountUpdatedChangesRequested]
)

object AuditLogServiceAccountUpdated {
  implicit lazy val auditLogServiceAccountUpdatedJsonFormat: Format[AuditLogServiceAccountUpdated] = Json.format[AuditLogServiceAccountUpdated]
}

