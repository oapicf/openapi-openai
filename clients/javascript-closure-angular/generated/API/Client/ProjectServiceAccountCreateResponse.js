goog.provide('API.Client.ProjectServiceAccountCreateResponse');

/**
 * @record
 */
API.Client.ProjectServiceAccountCreateResponse = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.ProjectServiceAccountCreateResponse.prototype.object;

/**
 * @type {!string}
 * @export
 */
API.Client.ProjectServiceAccountCreateResponse.prototype.id;

/**
 * @type {!string}
 * @export
 */
API.Client.ProjectServiceAccountCreateResponse.prototype.name;

/**
 * Service accounts can only have one role of type `member`
 * @type {!string}
 * @export
 */
API.Client.ProjectServiceAccountCreateResponse.prototype.role;

/**
 * @type {!number}
 * @export
 */
API.Client.ProjectServiceAccountCreateResponse.prototype.createdAt;

/**
 * @type {!API.Client.ProjectServiceAccountApiKey}
 * @export
 */
API.Client.ProjectServiceAccountCreateResponse.prototype.apiKey;

/** @enum {string} */
API.Client.ProjectServiceAccountCreateResponse.ObjectEnum = { 
  organization.project.service_account: 'organization.project.service_account',
}
/** @enum {string} */
API.Client.ProjectServiceAccountCreateResponse.RoleEnum = { 
  member: 'member',
}
