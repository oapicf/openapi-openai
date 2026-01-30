goog.provide('API.Client.Project');

/**
 * Represents an individual project.
 * @record
 */
API.Client.Project = function() {}

/**
 * The identifier, which can be referenced in API endpoints
 * @type {!string}
 * @export
 */
API.Client.Project.prototype.id;

/**
 * The object type, which is always `organization.project`
 * @type {!string}
 * @export
 */
API.Client.Project.prototype.object;

/**
 * The name of the project. This appears in reporting.
 * @type {!string}
 * @export
 */
API.Client.Project.prototype.name;

/**
 * The Unix timestamp (in seconds) of when the project was created.
 * @type {!number}
 * @export
 */
API.Client.Project.prototype.createdAt;

/**
 * The Unix timestamp (in seconds) of when the project was archived or `null`.
 * @type {!number}
 * @export
 */
API.Client.Project.prototype.archivedAt;

/**
 * `active` or `archived`
 * @type {!string}
 * @export
 */
API.Client.Project.prototype.status;

/** @enum {string} */
API.Client.Project.ObjectEnum = { 
  organization.project: 'organization.project',
}
/** @enum {string} */
API.Client.Project.StatusEnum = { 
  active: 'active',
  archived: 'archived',
}
