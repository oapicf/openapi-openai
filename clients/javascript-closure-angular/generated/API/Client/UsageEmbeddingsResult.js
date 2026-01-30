goog.provide('API.Client.UsageEmbeddingsResult');

/**
 * The aggregated embeddings usage details of the specific time bucket.
 * @record
 */
API.Client.UsageEmbeddingsResult = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.UsageEmbeddingsResult.prototype.object;

/**
 * The aggregated number of input tokens used.
 * @type {!number}
 * @export
 */
API.Client.UsageEmbeddingsResult.prototype.inputTokens;

/**
 * The count of requests made to the model.
 * @type {!number}
 * @export
 */
API.Client.UsageEmbeddingsResult.prototype.numModelRequests;

/**
 * When `group_by=project_id`, this field provides the project ID of the grouped usage result.
 * @type {!string}
 * @export
 */
API.Client.UsageEmbeddingsResult.prototype.projectId;

/**
 * When `group_by=user_id`, this field provides the user ID of the grouped usage result.
 * @type {!string}
 * @export
 */
API.Client.UsageEmbeddingsResult.prototype.userId;

/**
 * When `group_by=api_key_id`, this field provides the API key ID of the grouped usage result.
 * @type {!string}
 * @export
 */
API.Client.UsageEmbeddingsResult.prototype.apiKeyId;

/**
 * When `group_by=model`, this field provides the model name of the grouped usage result.
 * @type {!string}
 * @export
 */
API.Client.UsageEmbeddingsResult.prototype.model;

/** @enum {string} */
API.Client.UsageEmbeddingsResult.ObjectEnum = { 
  organization.usage.embeddings.result: 'organization.usage.embeddings.result',
}
