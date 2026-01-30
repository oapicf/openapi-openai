package model

import play.api.libs.json._

/**
  * The payload used to update the organization settings.
  * @param title The organization title.
  * @param description The organization description.
  * @param name The organization name.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class AuditLogOrganizationUpdatedChangesRequested(
  title: Option[String],
  description: Option[String],
  name: Option[String],
  settings: Option[AuditLogOrganizationUpdatedChangesRequestedSettings]
)

object AuditLogOrganizationUpdatedChangesRequested {
  implicit lazy val auditLogOrganizationUpdatedChangesRequestedJsonFormat: Format[AuditLogOrganizationUpdatedChangesRequested] = Json.format[AuditLogOrganizationUpdatedChangesRequested]
}

