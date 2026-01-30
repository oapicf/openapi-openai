goog.provide('API.Client.ProjectServiceAccountApiKey');

/**
 * @record
 */
API.Client.ProjectServiceAccountApiKey = function() {}

/**
 * The object type, which is always `organization.project.service_account.api_key`
 * @type {!string}
 * @export
 */
API.Client.ProjectServiceAccountApiKey.prototype.object;

/**
 * @type {!string}
 * @export
 */
API.Client.ProjectServiceAccountApiKey.prototype.value;

/**
 * @type {!string}
 * @export
 */
API.Client.ProjectServiceAccountApiKey.prototype.name;

/**
 * @type {!number}
 * @export
 */
API.Client.ProjectServiceAccountApiKey.prototype.createdAt;

/**
 * @type {!string}
 * @export
 */
API.Client.ProjectServiceAccountApiKey.prototype.id;

/** @enum {string} */
API.Client.ProjectServiceAccountApiKey.ObjectEnum = { 
  organization.project.service_account.api_key: 'organization.project.service_account.api_key',
}
