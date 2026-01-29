goog.provide('API.Client.CreateTranslationResponseVerboseJson');

/**
 * @record
 */
API.Client.CreateTranslationResponseVerboseJson = function() {}

/**
 * The language of the output translation (always `english`).
 * @type {!string}
 * @export
 */
API.Client.CreateTranslationResponseVerboseJson.prototype.language;

/**
 * The duration of the input audio.
 * @type {!string}
 * @export
 */
API.Client.CreateTranslationResponseVerboseJson.prototype.duration;

/**
 * The translated text.
 * @type {!string}
 * @export
 */
API.Client.CreateTranslationResponseVerboseJson.prototype.text;

/**
 * Segments of the translated text and their corresponding details.
 * @type {!Array<!API.Client.TranscriptionSegment>}
 * @export
 */
API.Client.CreateTranslationResponseVerboseJson.prototype.segments;

