goog.provide('API.Client.Invite');

/**
 * Represents an individual `invite` to the organization.
 * @record
 */
API.Client.Invite = function() {}

/**
 * The object type, which is always `organization.invite`
 * @type {!string}
 * @export
 */
API.Client.Invite.prototype.object;

/**
 * The identifier, which can be referenced in API endpoints
 * @type {!string}
 * @export
 */
API.Client.Invite.prototype.id;

/**
 * The email address of the individual to whom the invite was sent
 * @type {!string}
 * @export
 */
API.Client.Invite.prototype.email;

/**
 * `owner` or `reader`
 * @type {!string}
 * @export
 */
API.Client.Invite.prototype.role;

/**
 * `accepted`,`expired`, or `pending`
 * @type {!string}
 * @export
 */
API.Client.Invite.prototype.status;

/**
 * The Unix timestamp (in seconds) of when the invite was sent.
 * @type {!number}
 * @export
 */
API.Client.Invite.prototype.invitedAt;

/**
 * The Unix timestamp (in seconds) of when the invite expires.
 * @type {!number}
 * @export
 */
API.Client.Invite.prototype.expiresAt;

/**
 * The Unix timestamp (in seconds) of when the invite was accepted.
 * @type {!number}
 * @export
 */
API.Client.Invite.prototype.acceptedAt;

/**
 * The projects that were granted membership upon acceptance of the invite.
 * @type {!Array<!API.Client.Invite_projects_inner>}
 * @export
 */
API.Client.Invite.prototype.projects;

/** @enum {string} */
API.Client.Invite.ObjectEnum = { 
  organization.invite: 'organization.invite',
}
/** @enum {string} */
API.Client.Invite.RoleEnum = { 
  owner: 'owner',
  reader: 'reader',
}
/** @enum {string} */
API.Client.Invite.StatusEnum = { 
  accepted: 'accepted',
  expired: 'expired',
  pending: 'pending',
}
