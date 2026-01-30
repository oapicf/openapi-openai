goog.provide('API.Client.User');

/**
 * Represents an individual `user` within an organization.
 * @record
 */
API.Client.User = function() {}

/**
 * The object type, which is always `organization.user`
 * @type {!string}
 * @export
 */
API.Client.User.prototype.object;

/**
 * The identifier, which can be referenced in API endpoints
 * @type {!string}
 * @export
 */
API.Client.User.prototype.id;

/**
 * The name of the user
 * @type {!string}
 * @export
 */
API.Client.User.prototype.name;

/**
 * The email address of the user
 * @type {!string}
 * @export
 */
API.Client.User.prototype.email;

/**
 * `owner` or `reader`
 * @type {!string}
 * @export
 */
API.Client.User.prototype.role;

/**
 * The Unix timestamp (in seconds) of when the user was added.
 * @type {!number}
 * @export
 */
API.Client.User.prototype.addedAt;

/** @enum {string} */
API.Client.User.ObjectEnum = { 
  organization.user: 'organization.user',
}
/** @enum {string} */
API.Client.User.RoleEnum = { 
  owner: 'owner',
  reader: 'reader',
}
