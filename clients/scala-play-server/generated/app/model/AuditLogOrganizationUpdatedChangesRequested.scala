package model

import play.api.libs.json._

/**
  * The payload used to update the organization settings.
  * @param title The organization title.
  * @param description The organization description.
  * @param name The organization name.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:38:29.809972473Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class AuditLogOrganizationUpdatedChangesRequested(
  title: Option[String],
  description: Option[String],
  name: Option[String],
  settings: Option[AuditLogOrganizationUpdatedChangesRequestedSettings]
)

object AuditLogOrganizationUpdatedChangesRequested {
  implicit lazy val auditLogOrganizationUpdatedChangesRequestedJsonFormat: Format[AuditLogOrganizationUpdatedChangesRequested] = Json.format[AuditLogOrganizationUpdatedChangesRequested]
}

