goog.provide('API.Client.ProjectUserDeleteResponse');

/**
 * @record
 */
API.Client.ProjectUserDeleteResponse = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.ProjectUserDeleteResponse.prototype.object;

/**
 * @type {!string}
 * @export
 */
API.Client.ProjectUserDeleteResponse.prototype.id;

/**
 * @type {!boolean}
 * @export
 */
API.Client.ProjectUserDeleteResponse.prototype.deleted;

/** @enum {string} */
API.Client.ProjectUserDeleteResponse.ObjectEnum = { 
  organization.project.user.deleted: 'organization.project.user.deleted',
}
