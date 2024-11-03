goog.provide('API.Client.TranscriptionWord');

/**
 * @record
 */
API.Client.TranscriptionWord = function() {}

/**
 * The text content of the word.
 * @type {!string}
 * @export
 */
API.Client.TranscriptionWord.prototype.word;

/**
 * Start time of the word in seconds.
 * @type {!number}
 * @export
 */
API.Client.TranscriptionWord.prototype.start;

/**
 * End time of the word in seconds.
 * @type {!number}
 * @export
 */
API.Client.TranscriptionWord.prototype.end;

