goog.provide('API.Client.ProjectUserUpdateRequest');

/**
 * @record
 */
API.Client.ProjectUserUpdateRequest = function() {}

/**
 * `owner` or `member`
 * @type {!string}
 * @export
 */
API.Client.ProjectUserUpdateRequest.prototype.role;

/** @enum {string} */
API.Client.ProjectUserUpdateRequest.RoleEnum = { 
  owner: 'owner',
  member: 'member',
}
