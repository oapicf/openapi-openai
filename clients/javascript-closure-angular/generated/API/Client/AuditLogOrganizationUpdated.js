goog.provide('API.Client.AuditLog_organization_updated');

/**
 * The details for events with this `type`.
 * @record
 */
API.Client.AuditLogOrganizationUpdated = function() {}

/**
 * The organization ID.
 * @type {!string}
 * @export
 */
API.Client.AuditLogOrganizationUpdated.prototype.id;

/**
 * @type {!API.Client.AuditLog_organization_updated_changes_requested}
 * @export
 */
API.Client.AuditLogOrganizationUpdated.prototype.changesRequested;

