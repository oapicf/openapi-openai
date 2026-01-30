goog.provide('API.Client.ProjectRateLimitUpdateRequest');

/**
 * @record
 */
API.Client.ProjectRateLimitUpdateRequest = function() {}

/**
 * The maximum requests per minute.
 * @type {!number}
 * @export
 */
API.Client.ProjectRateLimitUpdateRequest.prototype.maxRequestsPer1Minute;

/**
 * The maximum tokens per minute.
 * @type {!number}
 * @export
 */
API.Client.ProjectRateLimitUpdateRequest.prototype.maxTokensPer1Minute;

/**
 * The maximum images per minute. Only relevant for certain models.
 * @type {!number}
 * @export
 */
API.Client.ProjectRateLimitUpdateRequest.prototype.maxImagesPer1Minute;

/**
 * The maximum audio megabytes per minute. Only relevant for certain models.
 * @type {!number}
 * @export
 */
API.Client.ProjectRateLimitUpdateRequest.prototype.maxAudioMegabytesPer1Minute;

/**
 * The maximum requests per day. Only relevant for certain models.
 * @type {!number}
 * @export
 */
API.Client.ProjectRateLimitUpdateRequest.prototype.maxRequestsPer1Day;

/**
 * The maximum batch input tokens per day. Only relevant for certain models.
 * @type {!number}
 * @export
 */
API.Client.ProjectRateLimitUpdateRequest.prototype.batch1DayMaxInputTokens;

