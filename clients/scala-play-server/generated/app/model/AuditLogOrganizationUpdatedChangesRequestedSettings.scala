package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AuditLog_organization_updated_changes_requested_settings.
  * @param threadsUiVisibility Visibility of the threads page which shows messages created with the Assistants API and Playground. One of `ANY_ROLE`, `OWNERS`, or `NONE`.
  * @param usageDashboardVisibility Visibility of the usage dashboard which shows activity and costs for your organization. One of `ANY_ROLE` or `OWNERS`.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-26T05:22:02.282422614Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class AuditLogOrganizationUpdatedChangesRequestedSettings(
  threadsUiVisibility: Option[String],
  usageDashboardVisibility: Option[String]
)

object AuditLogOrganizationUpdatedChangesRequestedSettings {
  implicit lazy val auditLogOrganizationUpdatedChangesRequestedSettingsJsonFormat: Format[AuditLogOrganizationUpdatedChangesRequestedSettings] = Json.format[AuditLogOrganizationUpdatedChangesRequestedSettings]
}

