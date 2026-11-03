package model

import play.api.libs.json._

/**
  * The details for events with this `type`.
  * @param id The organization ID.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:38:29.809972473Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class AuditLogOrganizationUpdated(
  id: Option[String],
  changesRequested: Option[AuditLogOrganizationUpdatedChangesRequested]
)

object AuditLogOrganizationUpdated {
  implicit lazy val auditLogOrganizationUpdatedJsonFormat: Format[AuditLogOrganizationUpdated] = Json.format[AuditLogOrganizationUpdated]
}

