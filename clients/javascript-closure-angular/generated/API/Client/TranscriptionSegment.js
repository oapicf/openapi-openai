goog.provide('API.Client.TranscriptionSegment');

/**
 * @record
 */
API.Client.TranscriptionSegment = function() {}

/**
 * Unique identifier of the segment.
 * @type {!number}
 * @export
 */
API.Client.TranscriptionSegment.prototype.id;

/**
 * Seek offset of the segment.
 * @type {!number}
 * @export
 */
API.Client.TranscriptionSegment.prototype.seek;

/**
 * Start time of the segment in seconds.
 * @type {!number}
 * @export
 */
API.Client.TranscriptionSegment.prototype.start;

/**
 * End time of the segment in seconds.
 * @type {!number}
 * @export
 */
API.Client.TranscriptionSegment.prototype.end;

/**
 * Text content of the segment.
 * @type {!string}
 * @export
 */
API.Client.TranscriptionSegment.prototype.text;

/**
 * Array of token IDs for the text content.
 * @type {!Array<!number>}
 * @export
 */
API.Client.TranscriptionSegment.prototype.tokens;

/**
 * Temperature parameter used for generating the segment.
 * @type {!number}
 * @export
 */
API.Client.TranscriptionSegment.prototype.temperature;

/**
 * Average logprob of the segment. If the value is lower than -1, consider the logprobs failed.
 * @type {!number}
 * @export
 */
API.Client.TranscriptionSegment.prototype.avgLogprob;

/**
 * Compression ratio of the segment. If the value is greater than 2.4, consider the compression failed.
 * @type {!number}
 * @export
 */
API.Client.TranscriptionSegment.prototype.compressionRatio;

/**
 * Probability of no speech in the segment. If the value is higher than 1.0 and the `avg_logprob` is below -1, consider this segment silent.
 * @type {!number}
 * @export
 */
API.Client.TranscriptionSegment.prototype.noSpeechProb;

