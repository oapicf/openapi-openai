goog.provide('API.Client.list_audit_logs_effective_at_parameter');

/**
 * @record
 */
API.Client.ListAuditLogsEffectiveAtParameter = function() {}

/**
 * Return only events whose `effective_at` (Unix seconds) is greater than this value.
 * @type {!number}
 * @export
 */
API.Client.ListAuditLogsEffectiveAtParameter.prototype.gt;

/**
 * Return only events whose `effective_at` (Unix seconds) is greater than or equal to this value.
 * @type {!number}
 * @export
 */
API.Client.ListAuditLogsEffectiveAtParameter.prototype.gte;

/**
 * Return only events whose `effective_at` (Unix seconds) is less than this value.
 * @type {!number}
 * @export
 */
API.Client.ListAuditLogsEffectiveAtParameter.prototype.lt;

/**
 * Return only events whose `effective_at` (Unix seconds) is less than or equal to this value.
 * @type {!number}
 * @export
 */
API.Client.ListAuditLogsEffectiveAtParameter.prototype.lte;

