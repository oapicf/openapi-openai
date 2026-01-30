package model

import play.api.libs.json._

/**
  * The details for events with this `type`.
  * @param id The organization ID.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class AuditLogOrganizationUpdated(
  id: Option[String],
  changesRequested: Option[AuditLogOrganizationUpdatedChangesRequested]
)

object AuditLogOrganizationUpdated {
  implicit lazy val auditLogOrganizationUpdatedJsonFormat: Format[AuditLogOrganizationUpdated] = Json.format[AuditLogOrganizationUpdated]
}

