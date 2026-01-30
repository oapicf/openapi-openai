goog.provide('API.Client.InviteRequest');

/**
 * @record
 */
API.Client.InviteRequest = function() {}

/**
 * Send an email to this address
 * @type {!string}
 * @export
 */
API.Client.InviteRequest.prototype.email;

/**
 * `owner` or `reader`
 * @type {!string}
 * @export
 */
API.Client.InviteRequest.prototype.role;

/**
 * An array of projects to which membership is granted at the same time the org invite is accepted. If omitted, the user will be invited to the default project for compatibility with legacy behavior.
 * @type {!Array<!API.Client.InviteRequest_projects_inner>}
 * @export
 */
API.Client.InviteRequest.prototype.projects;

/** @enum {string} */
API.Client.InviteRequest.RoleEnum = { 
  reader: 'reader',
  owner: 'owner',
}
