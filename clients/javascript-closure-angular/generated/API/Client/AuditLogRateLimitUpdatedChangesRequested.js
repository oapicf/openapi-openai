goog.provide('API.Client.AuditLog_rate_limit_updated_changes_requested');

/**
 * The payload used to update the rate limits.
 * @record
 */
API.Client.AuditLogRateLimitUpdatedChangesRequested = function() {}

/**
 * The maximum requests per minute.
 * @type {!number}
 * @export
 */
API.Client.AuditLogRateLimitUpdatedChangesRequested.prototype.maxRequestsPer1Minute;

/**
 * The maximum tokens per minute.
 * @type {!number}
 * @export
 */
API.Client.AuditLogRateLimitUpdatedChangesRequested.prototype.maxTokensPer1Minute;

/**
 * The maximum images per minute. Only relevant for certain models.
 * @type {!number}
 * @export
 */
API.Client.AuditLogRateLimitUpdatedChangesRequested.prototype.maxImagesPer1Minute;

/**
 * The maximum audio megabytes per minute. Only relevant for certain models.
 * @type {!number}
 * @export
 */
API.Client.AuditLogRateLimitUpdatedChangesRequested.prototype.maxAudioMegabytesPer1Minute;

/**
 * The maximum requests per day. Only relevant for certain models.
 * @type {!number}
 * @export
 */
API.Client.AuditLogRateLimitUpdatedChangesRequested.prototype.maxRequestsPer1Day;

/**
 * The maximum batch input tokens per day. Only relevant for certain models.
 * @type {!number}
 * @export
 */
API.Client.AuditLogRateLimitUpdatedChangesRequested.prototype.batch1DayMaxInputTokens;

