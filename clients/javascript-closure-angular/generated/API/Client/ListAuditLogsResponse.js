goog.provide('API.Client.ListAuditLogsResponse');

/**
 * @record
 */
API.Client.ListAuditLogsResponse = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.ListAuditLogsResponse.prototype.object;

/**
 * @type {!Array<!API.Client.AuditLog>}
 * @export
 */
API.Client.ListAuditLogsResponse.prototype.data;

/**
 * @type {!string}
 * @export
 */
API.Client.ListAuditLogsResponse.prototype.firstId;

/**
 * @type {!string}
 * @export
 */
API.Client.ListAuditLogsResponse.prototype.lastId;

/**
 * @type {!boolean}
 * @export
 */
API.Client.ListAuditLogsResponse.prototype.hasMore;

/** @enum {string} */
API.Client.ListAuditLogsResponse.ObjectEnum = { 
  list: 'list',
}
