goog.provide('API.Client.ProjectServiceAccount');

/**
 * Represents an individual service account in a project.
 * @record
 */
API.Client.ProjectServiceAccount = function() {}

/**
 * The object type, which is always `organization.project.service_account`
 * @type {!string}
 * @export
 */
API.Client.ProjectServiceAccount.prototype.object;

/**
 * The identifier, which can be referenced in API endpoints
 * @type {!string}
 * @export
 */
API.Client.ProjectServiceAccount.prototype.id;

/**
 * The name of the service account
 * @type {!string}
 * @export
 */
API.Client.ProjectServiceAccount.prototype.name;

/**
 * `owner` or `member`
 * @type {!string}
 * @export
 */
API.Client.ProjectServiceAccount.prototype.role;

/**
 * The Unix timestamp (in seconds) of when the service account was created
 * @type {!number}
 * @export
 */
API.Client.ProjectServiceAccount.prototype.createdAt;

/** @enum {string} */
API.Client.ProjectServiceAccount.ObjectEnum = { 
  organization.project.service_account: 'organization.project.service_account',
}
/** @enum {string} */
API.Client.ProjectServiceAccount.RoleEnum = { 
  owner: 'owner',
  member: 'member',
}
