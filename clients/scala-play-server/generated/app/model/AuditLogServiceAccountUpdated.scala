package model

import play.api.libs.json._

/**
  * The details for events with this `type`.
  * @param id The service account ID.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:38:29.809972473Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class AuditLogServiceAccountUpdated(
  id: Option[String],
  changesRequested: Option[AuditLogServiceAccountUpdatedChangesRequested]
)

object AuditLogServiceAccountUpdated {
  implicit lazy val auditLogServiceAccountUpdatedJsonFormat: Format[AuditLogServiceAccountUpdated] = Json.format[AuditLogServiceAccountUpdated]
}

