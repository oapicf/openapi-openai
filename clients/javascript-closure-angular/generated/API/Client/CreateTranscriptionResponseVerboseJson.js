goog.provide('API.Client.CreateTranscriptionResponseVerboseJson');

/**
 * Represents a verbose json transcription response returned by model, based on the provided input.
 * @record
 */
API.Client.CreateTranscriptionResponseVerboseJson = function() {}

/**
 * The language of the input audio.
 * @type {!string}
 * @export
 */
API.Client.CreateTranscriptionResponseVerboseJson.prototype.language;

/**
 * The duration of the input audio.
 * @type {!string}
 * @export
 */
API.Client.CreateTranscriptionResponseVerboseJson.prototype.duration;

/**
 * The transcribed text.
 * @type {!string}
 * @export
 */
API.Client.CreateTranscriptionResponseVerboseJson.prototype.text;

/**
 * Extracted words and their corresponding timestamps.
 * @type {!Array<!API.Client.TranscriptionWord>}
 * @export
 */
API.Client.CreateTranscriptionResponseVerboseJson.prototype.words;

/**
 * Segments of the transcribed text and their corresponding details.
 * @type {!Array<!API.Client.TranscriptionSegment>}
 * @export
 */
API.Client.CreateTranscriptionResponseVerboseJson.prototype.segments;

