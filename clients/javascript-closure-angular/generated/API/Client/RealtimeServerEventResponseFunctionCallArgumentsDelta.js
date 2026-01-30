goog.provide('API.Client.RealtimeServerEventResponseFunctionCallArgumentsDelta');

/**
 * Returned when the model-generated function call arguments are updated. 
 * @record
 */
API.Client.RealtimeServerEventResponseFunctionCallArgumentsDelta = function() {}

/**
 * The unique ID of the server event.
 * @type {!string}
 * @export
 */
API.Client.RealtimeServerEventResponseFunctionCallArgumentsDelta.prototype.eventId;

/**
 * The event type, must be `response.function_call_arguments.delta`. 
 * @type {!string}
 * @export
 */
API.Client.RealtimeServerEventResponseFunctionCallArgumentsDelta.prototype.type;

/**
 * The ID of the response.
 * @type {!string}
 * @export
 */
API.Client.RealtimeServerEventResponseFunctionCallArgumentsDelta.prototype.responseId;

/**
 * The ID of the function call item.
 * @type {!string}
 * @export
 */
API.Client.RealtimeServerEventResponseFunctionCallArgumentsDelta.prototype.itemId;

/**
 * The index of the output item in the response.
 * @type {!number}
 * @export
 */
API.Client.RealtimeServerEventResponseFunctionCallArgumentsDelta.prototype.outputIndex;

/**
 * The ID of the function call.
 * @type {!string}
 * @export
 */
API.Client.RealtimeServerEventResponseFunctionCallArgumentsDelta.prototype.callId;

/**
 * The arguments delta as a JSON string.
 * @type {!string}
 * @export
 */
API.Client.RealtimeServerEventResponseFunctionCallArgumentsDelta.prototype.delta;

/** @enum {string} */
API.Client.RealtimeServerEventResponseFunctionCallArgumentsDelta.TypeEnum = { 
  response.function_call_arguments.delta: 'response.function_call_arguments.delta',
}
