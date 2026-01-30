goog.provide('API.Client.ProjectRateLimit');

/**
 * Represents a project rate limit config.
 * @record
 */
API.Client.ProjectRateLimit = function() {}

/**
 * The object type, which is always `project.rate_limit`
 * @type {!string}
 * @export
 */
API.Client.ProjectRateLimit.prototype.object;

/**
 * The identifier, which can be referenced in API endpoints.
 * @type {!string}
 * @export
 */
API.Client.ProjectRateLimit.prototype.id;

/**
 * The model this rate limit applies to.
 * @type {!string}
 * @export
 */
API.Client.ProjectRateLimit.prototype.model;

/**
 * The maximum requests per minute.
 * @type {!number}
 * @export
 */
API.Client.ProjectRateLimit.prototype.maxRequestsPer1Minute;

/**
 * The maximum tokens per minute.
 * @type {!number}
 * @export
 */
API.Client.ProjectRateLimit.prototype.maxTokensPer1Minute;

/**
 * The maximum images per minute. Only present for relevant models.
 * @type {!number}
 * @export
 */
API.Client.ProjectRateLimit.prototype.maxImagesPer1Minute;

/**
 * The maximum audio megabytes per minute. Only present for relevant models.
 * @type {!number}
 * @export
 */
API.Client.ProjectRateLimit.prototype.maxAudioMegabytesPer1Minute;

/**
 * The maximum requests per day. Only present for relevant models.
 * @type {!number}
 * @export
 */
API.Client.ProjectRateLimit.prototype.maxRequestsPer1Day;

/**
 * The maximum batch input tokens per day. Only present for relevant models.
 * @type {!number}
 * @export
 */
API.Client.ProjectRateLimit.prototype.batch1DayMaxInputTokens;

/** @enum {string} */
API.Client.ProjectRateLimit.ObjectEnum = { 
  project.rate_limit: 'project.rate_limit',
}
