goog.provide('API.Client.InviteRequest_projects_inner');

/**
 * @record
 */
API.Client.InviteRequestProjectsInner = function() {}

/**
 * Project's public ID
 * @type {!string}
 * @export
 */
API.Client.InviteRequestProjectsInner.prototype.id;

/**
 * Project membership role
 * @type {!string}
 * @export
 */
API.Client.InviteRequestProjectsInner.prototype.role;

/** @enum {string} */
API.Client.InviteRequestProjectsInner.RoleEnum = { 
  member: 'member',
  owner: 'owner',
}
