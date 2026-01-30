goog.provide('API.Client.UsageTimeBucket_result_inner');

/**
 * @record
 */
API.Client.UsageTimeBucketResultInner = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.UsageTimeBucketResultInner.prototype.object;

/**
 * The aggregated number of input tokens used.
 * @type {!number}
 * @export
 */
API.Client.UsageTimeBucketResultInner.prototype.inputTokens;

/**
 * The aggregated number of text input tokens that has been cached from previous requests. For customers subscribe to scale tier, this includes scale tier tokens.
 * @type {!number}
 * @export
 */
API.Client.UsageTimeBucketResultInner.prototype.inputCachedTokens;

/**
 * The aggregated number of text output tokens used. For customers subscribe to scale tier, this includes scale tier tokens.
 * @type {!number}
 * @export
 */
API.Client.UsageTimeBucketResultInner.prototype.outputTokens;

/**
 * The aggregated number of audio input tokens used, including cached tokens.
 * @type {!number}
 * @export
 */
API.Client.UsageTimeBucketResultInner.prototype.inputAudioTokens;

/**
 * The aggregated number of audio output tokens used.
 * @type {!number}
 * @export
 */
API.Client.UsageTimeBucketResultInner.prototype.outputAudioTokens;

/**
 * The count of requests made to the model.
 * @type {!number}
 * @export
 */
API.Client.UsageTimeBucketResultInner.prototype.numModelRequests;

/**
 * When `group_by=project_id`, this field provides the project ID of the grouped costs result.
 * @type {!string}
 * @export
 */
API.Client.UsageTimeBucketResultInner.prototype.projectId;

/**
 * When `group_by=user_id`, this field provides the user ID of the grouped usage result.
 * @type {!string}
 * @export
 */
API.Client.UsageTimeBucketResultInner.prototype.userId;

/**
 * When `group_by=api_key_id`, this field provides the API key ID of the grouped usage result.
 * @type {!string}
 * @export
 */
API.Client.UsageTimeBucketResultInner.prototype.apiKeyId;

/**
 * When `group_by=model`, this field provides the model name of the grouped usage result.
 * @type {!string}
 * @export
 */
API.Client.UsageTimeBucketResultInner.prototype.model;

/**
 * When `group_by=batch`, this field tells whether the grouped usage result is batch or not.
 * @type {!boolean}
 * @export
 */
API.Client.UsageTimeBucketResultInner.prototype.batch;

/**
 * The number of images processed.
 * @type {!number}
 * @export
 */
API.Client.UsageTimeBucketResultInner.prototype.images;

/**
 * When `group_by=source`, this field provides the source of the grouped usage result, possible values are `image.generation`, `image.edit`, `image.variation`.
 * @type {!string}
 * @export
 */
API.Client.UsageTimeBucketResultInner.prototype.source;

/**
 * When `group_by=size`, this field provides the image size of the grouped usage result.
 * @type {!string}
 * @export
 */
API.Client.UsageTimeBucketResultInner.prototype.size;

/**
 * The number of characters processed.
 * @type {!number}
 * @export
 */
API.Client.UsageTimeBucketResultInner.prototype.characters;

/**
 * The number of seconds processed.
 * @type {!number}
 * @export
 */
API.Client.UsageTimeBucketResultInner.prototype.seconds;

/**
 * The vector stores usage in bytes.
 * @type {!number}
 * @export
 */
API.Client.UsageTimeBucketResultInner.prototype.usageBytes;

/**
 * The number of code interpreter sessions.
 * @type {!number}
 * @export
 */
API.Client.UsageTimeBucketResultInner.prototype.sessions;

/**
 * @type {!API.Client.CostsResult_amount}
 * @export
 */
API.Client.UsageTimeBucketResultInner.prototype.amount;

/**
 * When `group_by=line_item`, this field provides the line item of the grouped costs result.
 * @type {!string}
 * @export
 */
API.Client.UsageTimeBucketResultInner.prototype.lineItem;

/** @enum {string} */
API.Client.UsageTimeBucketResultInner.ObjectEnum = { 
  organization.costs.result: 'organization.costs.result',
}
