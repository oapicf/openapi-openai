goog.provide('API.Client.Invite_projects_inner');

/**
 * @record
 */
API.Client.InviteProjectsInner = function() {}

/**
 * Project's public ID
 * @type {!string}
 * @export
 */
API.Client.InviteProjectsInner.prototype.id;

/**
 * Project membership role
 * @type {!string}
 * @export
 */
API.Client.InviteProjectsInner.prototype.role;

/** @enum {string} */
API.Client.InviteProjectsInner.RoleEnum = { 
  member: 'member',
  owner: 'owner',
}
