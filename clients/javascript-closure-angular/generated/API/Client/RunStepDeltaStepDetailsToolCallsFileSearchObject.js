goog.provide('API.Client.RunStepDeltaStepDetailsToolCallsFileSearchObject');

/**
 * @record
 */
API.Client.RunStepDeltaStepDetailsToolCallsFileSearchObject = function() {}

/**
 * The index of the tool call in the tool calls array.
 * @type {!number}
 * @export
 */
API.Client.RunStepDeltaStepDetailsToolCallsFileSearchObject.prototype.index;

/**
 * The ID of the tool call object.
 * @type {!string}
 * @export
 */
API.Client.RunStepDeltaStepDetailsToolCallsFileSearchObject.prototype.id;

/**
 * The type of tool call. This is always going to be `file_search` for this type of tool call.
 * @type {!string}
 * @export
 */
API.Client.RunStepDeltaStepDetailsToolCallsFileSearchObject.prototype.type;

/**
 * For now, this is always going to be an empty object.
 * @type {!API.Client.Object}
 * @export
 */
API.Client.RunStepDeltaStepDetailsToolCallsFileSearchObject.prototype.fileSearch;

/** @enum {string} */
API.Client.RunStepDeltaStepDetailsToolCallsFileSearchObject.TypeEnum = { 
  file_search: 'file_search',
}
