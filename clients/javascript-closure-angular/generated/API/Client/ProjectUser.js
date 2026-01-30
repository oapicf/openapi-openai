goog.provide('API.Client.ProjectUser');

/**
 * Represents an individual user in a project.
 * @record
 */
API.Client.ProjectUser = function() {}

/**
 * The object type, which is always `organization.project.user`
 * @type {!string}
 * @export
 */
API.Client.ProjectUser.prototype.object;

/**
 * The identifier, which can be referenced in API endpoints
 * @type {!string}
 * @export
 */
API.Client.ProjectUser.prototype.id;

/**
 * The name of the user
 * @type {!string}
 * @export
 */
API.Client.ProjectUser.prototype.name;

/**
 * The email address of the user
 * @type {!string}
 * @export
 */
API.Client.ProjectUser.prototype.email;

/**
 * `owner` or `member`
 * @type {!string}
 * @export
 */
API.Client.ProjectUser.prototype.role;

/**
 * The Unix timestamp (in seconds) of when the project was added.
 * @type {!number}
 * @export
 */
API.Client.ProjectUser.prototype.addedAt;

/** @enum {string} */
API.Client.ProjectUser.ObjectEnum = { 
  organization.project.user: 'organization.project.user',
}
/** @enum {string} */
API.Client.ProjectUser.RoleEnum = { 
  owner: 'owner',
  member: 'member',
}
