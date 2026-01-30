goog.provide('API.Client.ProjectApiKey');

/**
 * Represents an individual API key in a project.
 * @record
 */
API.Client.ProjectApiKey = function() {}

/**
 * The object type, which is always `organization.project.api_key`
 * @type {!string}
 * @export
 */
API.Client.ProjectApiKey.prototype.object;

/**
 * The redacted value of the API key
 * @type {!string}
 * @export
 */
API.Client.ProjectApiKey.prototype.redactedValue;

/**
 * The name of the API key
 * @type {!string}
 * @export
 */
API.Client.ProjectApiKey.prototype.name;

/**
 * The Unix timestamp (in seconds) of when the API key was created
 * @type {!number}
 * @export
 */
API.Client.ProjectApiKey.prototype.createdAt;

/**
 * The identifier, which can be referenced in API endpoints
 * @type {!string}
 * @export
 */
API.Client.ProjectApiKey.prototype.id;

/**
 * @type {!API.Client.ProjectApiKey_owner}
 * @export
 */
API.Client.ProjectApiKey.prototype.owner;

/** @enum {string} */
API.Client.ProjectApiKey.ObjectEnum = { 
  organization.project.api_key: 'organization.project.api_key',
}
