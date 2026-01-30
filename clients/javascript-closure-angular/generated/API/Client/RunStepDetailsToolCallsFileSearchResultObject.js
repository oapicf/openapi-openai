goog.provide('API.Client.RunStepDetailsToolCallsFileSearchResultObject');

/**
 * A result instance of the file search.
 * @record
 */
API.Client.RunStepDetailsToolCallsFileSearchResultObject = function() {}

/**
 * The ID of the file that result was found in.
 * @type {!string}
 * @export
 */
API.Client.RunStepDetailsToolCallsFileSearchResultObject.prototype.fileId;

/**
 * The name of the file that result was found in.
 * @type {!string}
 * @export
 */
API.Client.RunStepDetailsToolCallsFileSearchResultObject.prototype.fileName;

/**
 * The score of the result. All values must be a floating point number between 0 and 1.
 * @type {!number}
 * @export
 */
API.Client.RunStepDetailsToolCallsFileSearchResultObject.prototype.score;

/**
 * The content of the result that was found. The content is only included if requested via the include query parameter.
 * @type {!Array<!API.Client.RunStepDetailsToolCallsFileSearchResultObject_content_inner>}
 * @export
 */
API.Client.RunStepDetailsToolCallsFileSearchResultObject.prototype.content;

