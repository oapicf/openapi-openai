goog.provide('API.Client.AuditLog_invite_sent');

/**
 * The details for events with this `type`.
 * @record
 */
API.Client.AuditLogInviteSent = function() {}

/**
 * The ID of the invite.
 * @type {!string}
 * @export
 */
API.Client.AuditLogInviteSent.prototype.id;

/**
 * @type {!API.Client.AuditLog_invite_sent_data}
 * @export
 */
API.Client.AuditLogInviteSent.prototype.data;

