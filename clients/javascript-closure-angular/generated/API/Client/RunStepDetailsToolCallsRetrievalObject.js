goog.provide('API.Client.RunStepDetailsToolCallsRetrievalObject');

/**
 * @record
 */
API.Client.RunStepDetailsToolCallsRetrievalObject = function() {}

/**
 * The ID of the tool call object.
 * @type {!string}
 * @export
 */
API.Client.RunStepDetailsToolCallsRetrievalObject.prototype.id;

/**
 * The type of tool call. This is always going to be `retrieval` for this type of tool call.
 * @type {!string}
 * @export
 */
API.Client.RunStepDetailsToolCallsRetrievalObject.prototype.type;

/**
 * For now, this is always going to be an empty object.
 * @type {!API.Client.Object}
 * @export
 */
API.Client.RunStepDetailsToolCallsRetrievalObject.prototype.retrieval;

/** @enum {string} */
API.Client.RunStepDetailsToolCallsRetrievalObject.TypeEnum = { 
  retrieval: 'retrieval',
}
