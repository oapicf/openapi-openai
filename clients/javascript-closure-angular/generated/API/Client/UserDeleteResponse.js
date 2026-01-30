goog.provide('API.Client.UserDeleteResponse');

/**
 * @record
 */
API.Client.UserDeleteResponse = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.UserDeleteResponse.prototype.object;

/**
 * @type {!string}
 * @export
 */
API.Client.UserDeleteResponse.prototype.id;

/**
 * @type {!boolean}
 * @export
 */
API.Client.UserDeleteResponse.prototype.deleted;

/** @enum {string} */
API.Client.UserDeleteResponse.ObjectEnum = { 
  organization.user.deleted: 'organization.user.deleted',
}
