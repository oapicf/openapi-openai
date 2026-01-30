goog.provide('API.Client.ProjectServiceAccountDeleteResponse');

/**
 * @record
 */
API.Client.ProjectServiceAccountDeleteResponse = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.ProjectServiceAccountDeleteResponse.prototype.object;

/**
 * @type {!string}
 * @export
 */
API.Client.ProjectServiceAccountDeleteResponse.prototype.id;

/**
 * @type {!boolean}
 * @export
 */
API.Client.ProjectServiceAccountDeleteResponse.prototype.deleted;

/** @enum {string} */
API.Client.ProjectServiceAccountDeleteResponse.ObjectEnum = { 
  organization.project.service_account.deleted: 'organization.project.service_account.deleted',
}
