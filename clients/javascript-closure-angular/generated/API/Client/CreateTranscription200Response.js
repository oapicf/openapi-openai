goog.provide('API.Client.createTranscription_200_response');

/**
 * @record
 */
API.Client.CreateTranscription200Response = function() {}

/**
 * The transcribed text.
 * @type {!string}
 * @export
 */
API.Client.CreateTranscription200Response.prototype.text;

/**
 * The language of the input audio.
 * @type {!string}
 * @export
 */
API.Client.CreateTranscription200Response.prototype.language;

/**
 * The duration of the input audio.
 * @type {!string}
 * @export
 */
API.Client.CreateTranscription200Response.prototype.duration;

/**
 * Extracted words and their corresponding timestamps.
 * @type {!Array<!API.Client.TranscriptionWord>}
 * @export
 */
API.Client.CreateTranscription200Response.prototype.words;

/**
 * Segments of the transcribed text and their corresponding details.
 * @type {!Array<!API.Client.TranscriptionSegment>}
 * @export
 */
API.Client.CreateTranscription200Response.prototype.segments;

