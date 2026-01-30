goog.provide('API.Client.AuditLog_organization_updated_changes_requested_settings');

/**
 * @record
 */
API.Client.AuditLogOrganizationUpdatedChangesRequestedSettings = function() {}

/**
 * Visibility of the threads page which shows messages created with the Assistants API and Playground. One of `ANY_ROLE`, `OWNERS`, or `NONE`.
 * @type {!string}
 * @export
 */
API.Client.AuditLogOrganizationUpdatedChangesRequestedSettings.prototype.threadsUiVisibility;

/**
 * Visibility of the usage dashboard which shows activity and costs for your organization. One of `ANY_ROLE` or `OWNERS`.
 * @type {!string}
 * @export
 */
API.Client.AuditLogOrganizationUpdatedChangesRequestedSettings.prototype.usageDashboardVisibility;

