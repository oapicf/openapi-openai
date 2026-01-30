goog.provide('API.Client.RunStepDetailsToolCallsFileSearchObject');

/**
 * @record
 */
API.Client.RunStepDetailsToolCallsFileSearchObject = function() {}

/**
 * The ID of the tool call object.
 * @type {!string}
 * @export
 */
API.Client.RunStepDetailsToolCallsFileSearchObject.prototype.id;

/**
 * The type of tool call. This is always going to be `file_search` for this type of tool call.
 * @type {!string}
 * @export
 */
API.Client.RunStepDetailsToolCallsFileSearchObject.prototype.type;

/**
 * @type {!API.Client.RunStepDetailsToolCallsFileSearchObject_file_search}
 * @export
 */
API.Client.RunStepDetailsToolCallsFileSearchObject.prototype.fileSearch;

/** @enum {string} */
API.Client.RunStepDetailsToolCallsFileSearchObject.TypeEnum = { 
  file_search: 'file_search',
}
