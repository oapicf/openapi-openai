goog.provide('API.Client.UsageAudioSpeechesResult');

/**
 * The aggregated audio speeches usage details of the specific time bucket.
 * @record
 */
API.Client.UsageAudioSpeechesResult = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.UsageAudioSpeechesResult.prototype.object;

/**
 * The number of characters processed.
 * @type {!number}
 * @export
 */
API.Client.UsageAudioSpeechesResult.prototype.characters;

/**
 * The count of requests made to the model.
 * @type {!number}
 * @export
 */
API.Client.UsageAudioSpeechesResult.prototype.numModelRequests;

/**
 * When `group_by=project_id`, this field provides the project ID of the grouped usage result.
 * @type {!string}
 * @export
 */
API.Client.UsageAudioSpeechesResult.prototype.projectId;

/**
 * When `group_by=user_id`, this field provides the user ID of the grouped usage result.
 * @type {!string}
 * @export
 */
API.Client.UsageAudioSpeechesResult.prototype.userId;

/**
 * When `group_by=api_key_id`, this field provides the API key ID of the grouped usage result.
 * @type {!string}
 * @export
 */
API.Client.UsageAudioSpeechesResult.prototype.apiKeyId;

/**
 * When `group_by=model`, this field provides the model name of the grouped usage result.
 * @type {!string}
 * @export
 */
API.Client.UsageAudioSpeechesResult.prototype.model;

/** @enum {string} */
API.Client.UsageAudioSpeechesResult.ObjectEnum = { 
  organization.usage.audio_speeches.result: 'organization.usage.audio_speeches.result',
}
