goog.provide('API.Client.AuditLog_invite_sent_data');

/**
 * The payload used to create the invite.
 * @record
 */
API.Client.AuditLogInviteSentData = function() {}

/**
 * The email invited to the organization.
 * @type {!string}
 * @export
 */
API.Client.AuditLogInviteSentData.prototype.email;

/**
 * The role the email was invited to be. Is either `owner` or `member`.
 * @type {!string}
 * @export
 */
API.Client.AuditLogInviteSentData.prototype.role;

