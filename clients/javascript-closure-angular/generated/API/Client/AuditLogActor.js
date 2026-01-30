goog.provide('API.Client.AuditLogActor');

/**
 * The actor who performed the audit logged action.
 * @record
 */
API.Client.AuditLogActor = function() {}

/**
 * The type of actor. Is either `session` or `api_key`.
 * @type {!string}
 * @export
 */
API.Client.AuditLogActor.prototype.type;

/**
 * @type {!API.Client.AuditLogActorSession}
 * @export
 */
API.Client.AuditLogActor.prototype.session;

/**
 * @type {!API.Client.AuditLogActorApiKey}
 * @export
 */
API.Client.AuditLogActor.prototype.apiKey;

/** @enum {string} */
API.Client.AuditLogActor.TypeEnum = { 
  session: 'session',
  api_key: 'api_key',
}
