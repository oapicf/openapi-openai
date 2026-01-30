goog.provide('API.Client.UsageCompletionsResult');

/**
 * The aggregated completions usage details of the specific time bucket.
 * @record
 */
API.Client.UsageCompletionsResult = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.UsageCompletionsResult.prototype.object;

/**
 * The aggregated number of text input tokens used, including cached tokens. For customers subscribe to scale tier, this includes scale tier tokens.
 * @type {!number}
 * @export
 */
API.Client.UsageCompletionsResult.prototype.inputTokens;

/**
 * The aggregated number of text input tokens that has been cached from previous requests. For customers subscribe to scale tier, this includes scale tier tokens.
 * @type {!number}
 * @export
 */
API.Client.UsageCompletionsResult.prototype.inputCachedTokens;

/**
 * The aggregated number of text output tokens used. For customers subscribe to scale tier, this includes scale tier tokens.
 * @type {!number}
 * @export
 */
API.Client.UsageCompletionsResult.prototype.outputTokens;

/**
 * The aggregated number of audio input tokens used, including cached tokens.
 * @type {!number}
 * @export
 */
API.Client.UsageCompletionsResult.prototype.inputAudioTokens;

/**
 * The aggregated number of audio output tokens used.
 * @type {!number}
 * @export
 */
API.Client.UsageCompletionsResult.prototype.outputAudioTokens;

/**
 * The count of requests made to the model.
 * @type {!number}
 * @export
 */
API.Client.UsageCompletionsResult.prototype.numModelRequests;

/**
 * When `group_by=project_id`, this field provides the project ID of the grouped usage result.
 * @type {!string}
 * @export
 */
API.Client.UsageCompletionsResult.prototype.projectId;

/**
 * When `group_by=user_id`, this field provides the user ID of the grouped usage result.
 * @type {!string}
 * @export
 */
API.Client.UsageCompletionsResult.prototype.userId;

/**
 * When `group_by=api_key_id`, this field provides the API key ID of the grouped usage result.
 * @type {!string}
 * @export
 */
API.Client.UsageCompletionsResult.prototype.apiKeyId;

/**
 * When `group_by=model`, this field provides the model name of the grouped usage result.
 * @type {!string}
 * @export
 */
API.Client.UsageCompletionsResult.prototype.model;

/**
 * When `group_by=batch`, this field tells whether the grouped usage result is batch or not.
 * @type {!boolean}
 * @export
 */
API.Client.UsageCompletionsResult.prototype.batch;

/** @enum {string} */
API.Client.UsageCompletionsResult.ObjectEnum = { 
  organization.usage.completions.result: 'organization.usage.completions.result',
}
