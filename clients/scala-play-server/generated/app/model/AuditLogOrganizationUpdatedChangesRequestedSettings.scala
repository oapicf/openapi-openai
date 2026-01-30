package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AuditLog_organization_updated_changes_requested_settings.
  * @param threadsUiVisibility Visibility of the threads page which shows messages created with the Assistants API and Playground. One of `ANY_ROLE`, `OWNERS`, or `NONE`.
  * @param usageDashboardVisibility Visibility of the usage dashboard which shows activity and costs for your organization. One of `ANY_ROLE` or `OWNERS`.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class AuditLogOrganizationUpdatedChangesRequestedSettings(
  threadsUiVisibility: Option[String],
  usageDashboardVisibility: Option[String]
)

object AuditLogOrganizationUpdatedChangesRequestedSettings {
  implicit lazy val auditLogOrganizationUpdatedChangesRequestedSettingsJsonFormat: Format[AuditLogOrganizationUpdatedChangesRequestedSettings] = Json.format[AuditLogOrganizationUpdatedChangesRequestedSettings]
}

