goog.provide('API.Client.UsageImagesResult');

/**
 * The aggregated images usage details of the specific time bucket.
 * @record
 */
API.Client.UsageImagesResult = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.UsageImagesResult.prototype.object;

/**
 * The number of images processed.
 * @type {!number}
 * @export
 */
API.Client.UsageImagesResult.prototype.images;

/**
 * The count of requests made to the model.
 * @type {!number}
 * @export
 */
API.Client.UsageImagesResult.prototype.numModelRequests;

/**
 * When `group_by=source`, this field provides the source of the grouped usage result, possible values are `image.generation`, `image.edit`, `image.variation`.
 * @type {!string}
 * @export
 */
API.Client.UsageImagesResult.prototype.source;

/**
 * When `group_by=size`, this field provides the image size of the grouped usage result.
 * @type {!string}
 * @export
 */
API.Client.UsageImagesResult.prototype.size;

/**
 * When `group_by=project_id`, this field provides the project ID of the grouped usage result.
 * @type {!string}
 * @export
 */
API.Client.UsageImagesResult.prototype.projectId;

/**
 * When `group_by=user_id`, this field provides the user ID of the grouped usage result.
 * @type {!string}
 * @export
 */
API.Client.UsageImagesResult.prototype.userId;

/**
 * When `group_by=api_key_id`, this field provides the API key ID of the grouped usage result.
 * @type {!string}
 * @export
 */
API.Client.UsageImagesResult.prototype.apiKeyId;

/**
 * When `group_by=model`, this field provides the model name of the grouped usage result.
 * @type {!string}
 * @export
 */
API.Client.UsageImagesResult.prototype.model;

/** @enum {string} */
API.Client.UsageImagesResult.ObjectEnum = { 
  organization.usage.images.result: 'organization.usage.images.result',
}
