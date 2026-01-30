goog.provide('API.Client.AuditLog_organization_updated_changes_requested');

/**
 * The payload used to update the organization settings.
 * @record
 */
API.Client.AuditLogOrganizationUpdatedChangesRequested = function() {}

/**
 * The organization title.
 * @type {!string}
 * @export
 */
API.Client.AuditLogOrganizationUpdatedChangesRequested.prototype.title;

/**
 * The organization description.
 * @type {!string}
 * @export
 */
API.Client.AuditLogOrganizationUpdatedChangesRequested.prototype.description;

/**
 * The organization name.
 * @type {!string}
 * @export
 */
API.Client.AuditLogOrganizationUpdatedChangesRequested.prototype.name;

/**
 * @type {!API.Client.AuditLog_organization_updated_changes_requested_settings}
 * @export
 */
API.Client.AuditLogOrganizationUpdatedChangesRequested.prototype.settings;

