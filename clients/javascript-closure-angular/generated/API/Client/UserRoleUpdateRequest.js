goog.provide('API.Client.UserRoleUpdateRequest');

/**
 * @record
 */
API.Client.UserRoleUpdateRequest = function() {}

/**
 * `owner` or `reader`
 * @type {!string}
 * @export
 */
API.Client.UserRoleUpdateRequest.prototype.role;

/** @enum {string} */
API.Client.UserRoleUpdateRequest.RoleEnum = { 
  owner: 'owner',
  reader: 'reader',
}
