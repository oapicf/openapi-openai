goog.provide('API.Client.AuditLogActorApiKey');

/**
 * The API Key used to perform the audit logged action.
 * @record
 */
API.Client.AuditLogActorApiKey = function() {}

/**
 * The tracking id of the API key.
 * @type {!string}
 * @export
 */
API.Client.AuditLogActorApiKey.prototype.id;

/**
 * The type of API key. Can be either `user` or `service_account`.
 * @type {!string}
 * @export
 */
API.Client.AuditLogActorApiKey.prototype.type;

/**
 * @type {!API.Client.AuditLogActorUser}
 * @export
 */
API.Client.AuditLogActorApiKey.prototype.user;

/**
 * @type {!API.Client.AuditLogActorServiceAccount}
 * @export
 */
API.Client.AuditLogActorApiKey.prototype.serviceAccount;

/** @enum {string} */
API.Client.AuditLogActorApiKey.TypeEnum = { 
  user: 'user',
  service_account: 'service_account',
}
