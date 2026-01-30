goog.provide('API.Client.ProjectApiKeyDeleteResponse');

/**
 * @record
 */
API.Client.ProjectApiKeyDeleteResponse = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.ProjectApiKeyDeleteResponse.prototype.object;

/**
 * @type {!string}
 * @export
 */
API.Client.ProjectApiKeyDeleteResponse.prototype.id;

/**
 * @type {!boolean}
 * @export
 */
API.Client.ProjectApiKeyDeleteResponse.prototype.deleted;

/** @enum {string} */
API.Client.ProjectApiKeyDeleteResponse.ObjectEnum = { 
  organization.project.api_key.deleted: 'organization.project.api_key.deleted',
}
