goog.provide('API.Client.createTranslation_200_response');

/**
 * @record
 */
API.Client.CreateTranslation200Response = function() {}

/**
 * The translated text.
 * @type {!string}
 * @export
 */
API.Client.CreateTranslation200Response.prototype.text;

/**
 * The language of the output translation (always `english`).
 * @type {!string}
 * @export
 */
API.Client.CreateTranslation200Response.prototype.language;

/**
 * The duration of the input audio.
 * @type {!string}
 * @export
 */
API.Client.CreateTranslation200Response.prototype.duration;

/**
 * Segments of the translated text and their corresponding details.
 * @type {!Array<!API.Client.TranscriptionSegment>}
 * @export
 */
API.Client.CreateTranslation200Response.prototype.segments;

