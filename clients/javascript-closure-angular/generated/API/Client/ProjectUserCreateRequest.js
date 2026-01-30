goog.provide('API.Client.ProjectUserCreateRequest');

/**
 * @record
 */
API.Client.ProjectUserCreateRequest = function() {}

/**
 * The ID of the user.
 * @type {!string}
 * @export
 */
API.Client.ProjectUserCreateRequest.prototype.userId;

/**
 * `owner` or `member`
 * @type {!string}
 * @export
 */
API.Client.ProjectUserCreateRequest.prototype.role;

/** @enum {string} */
API.Client.ProjectUserCreateRequest.RoleEnum = { 
  owner: 'owner',
  member: 'member',
}
