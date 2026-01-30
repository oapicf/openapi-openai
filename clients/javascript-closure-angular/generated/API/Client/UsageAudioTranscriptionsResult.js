goog.provide('API.Client.UsageAudioTranscriptionsResult');

/**
 * The aggregated audio transcriptions usage details of the specific time bucket.
 * @record
 */
API.Client.UsageAudioTranscriptionsResult = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.UsageAudioTranscriptionsResult.prototype.object;

/**
 * The number of seconds processed.
 * @type {!number}
 * @export
 */
API.Client.UsageAudioTranscriptionsResult.prototype.seconds;

/**
 * The count of requests made to the model.
 * @type {!number}
 * @export
 */
API.Client.UsageAudioTranscriptionsResult.prototype.numModelRequests;

/**
 * When `group_by=project_id`, this field provides the project ID of the grouped usage result.
 * @type {!string}
 * @export
 */
API.Client.UsageAudioTranscriptionsResult.prototype.projectId;

/**
 * When `group_by=user_id`, this field provides the user ID of the grouped usage result.
 * @type {!string}
 * @export
 */
API.Client.UsageAudioTranscriptionsResult.prototype.userId;

/**
 * When `group_by=api_key_id`, this field provides the API key ID of the grouped usage result.
 * @type {!string}
 * @export
 */
API.Client.UsageAudioTranscriptionsResult.prototype.apiKeyId;

/**
 * When `group_by=model`, this field provides the model name of the grouped usage result.
 * @type {!string}
 * @export
 */
API.Client.UsageAudioTranscriptionsResult.prototype.model;

/** @enum {string} */
API.Client.UsageAudioTranscriptionsResult.ObjectEnum = { 
  organization.usage.audio_transcriptions.result: 'organization.usage.audio_transcriptions.result',
}
