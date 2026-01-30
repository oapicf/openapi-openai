goog.provide('API.Client.UsageModerationsResult');

/**
 * The aggregated moderations usage details of the specific time bucket.
 * @record
 */
API.Client.UsageModerationsResult = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.UsageModerationsResult.prototype.object;

/**
 * The aggregated number of input tokens used.
 * @type {!number}
 * @export
 */
API.Client.UsageModerationsResult.prototype.inputTokens;

/**
 * The count of requests made to the model.
 * @type {!number}
 * @export
 */
API.Client.UsageModerationsResult.prototype.numModelRequests;

/**
 * When `group_by=project_id`, this field provides the project ID of the grouped usage result.
 * @type {!string}
 * @export
 */
API.Client.UsageModerationsResult.prototype.projectId;

/**
 * When `group_by=user_id`, this field provides the user ID of the grouped usage result.
 * @type {!string}
 * @export
 */
API.Client.UsageModerationsResult.prototype.userId;

/**
 * When `group_by=api_key_id`, this field provides the API key ID of the grouped usage result.
 * @type {!string}
 * @export
 */
API.Client.UsageModerationsResult.prototype.apiKeyId;

/**
 * When `group_by=model`, this field provides the model name of the grouped usage result.
 * @type {!string}
 * @export
 */
API.Client.UsageModerationsResult.prototype.model;

/** @enum {string} */
API.Client.UsageModerationsResult.ObjectEnum = { 
  organization.usage.moderations.result: 'organization.usage.moderations.result',
}
