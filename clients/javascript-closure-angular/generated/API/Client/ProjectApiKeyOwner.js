goog.provide('API.Client.ProjectApiKey_owner');

/**
 * @record
 */
API.Client.ProjectApiKeyOwner = function() {}

/**
 * `user` or `service_account`
 * @type {!string}
 * @export
 */
API.Client.ProjectApiKeyOwner.prototype.type;

/**
 * @type {!API.Client.ProjectUser}
 * @export
 */
API.Client.ProjectApiKeyOwner.prototype.user;

/**
 * @type {!API.Client.ProjectServiceAccount}
 * @export
 */
API.Client.ProjectApiKeyOwner.prototype.serviceAccount;

/** @enum {string} */
API.Client.ProjectApiKeyOwner.TypeEnum = { 
  user: 'user',
  service_account: 'service_account',
}
