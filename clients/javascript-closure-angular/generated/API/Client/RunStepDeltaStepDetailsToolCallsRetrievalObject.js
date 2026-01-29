goog.provide('API.Client.RunStepDeltaStepDetailsToolCallsRetrievalObject');

/**
 * @record
 */
API.Client.RunStepDeltaStepDetailsToolCallsRetrievalObject = function() {}

/**
 * The index of the tool call in the tool calls array.
 * @type {!number}
 * @export
 */
API.Client.RunStepDeltaStepDetailsToolCallsRetrievalObject.prototype.index;

/**
 * The ID of the tool call object.
 * @type {!string}
 * @export
 */
API.Client.RunStepDeltaStepDetailsToolCallsRetrievalObject.prototype.id;

/**
 * The type of tool call. This is always going to be `retrieval` for this type of tool call.
 * @type {!string}
 * @export
 */
API.Client.RunStepDeltaStepDetailsToolCallsRetrievalObject.prototype.type;

/**
 * For now, this is always going to be an empty object.
 * @type {!API.Client.Object}
 * @export
 */
API.Client.RunStepDeltaStepDetailsToolCallsRetrievalObject.prototype.retrieval;

/** @enum {string} */
API.Client.RunStepDeltaStepDetailsToolCallsRetrievalObject.TypeEnum = { 
  retrieval: 'retrieval',
}
