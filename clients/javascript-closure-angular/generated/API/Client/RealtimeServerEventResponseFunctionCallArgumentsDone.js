goog.provide('API.Client.RealtimeServerEventResponseFunctionCallArgumentsDone');

/**
 * Returned when the model-generated function call arguments are done streaming. Also emitted when a Response is interrupted, incomplete, or cancelled. 
 * @record
 */
API.Client.RealtimeServerEventResponseFunctionCallArgumentsDone = function() {}

/**
 * The unique ID of the server event.
 * @type {!string}
 * @export
 */
API.Client.RealtimeServerEventResponseFunctionCallArgumentsDone.prototype.eventId;

/**
 * The event type, must be `response.function_call_arguments.done`. 
 * @type {!string}
 * @export
 */
API.Client.RealtimeServerEventResponseFunctionCallArgumentsDone.prototype.type;

/**
 * The ID of the response.
 * @type {!string}
 * @export
 */
API.Client.RealtimeServerEventResponseFunctionCallArgumentsDone.prototype.responseId;

/**
 * The ID of the function call item.
 * @type {!string}
 * @export
 */
API.Client.RealtimeServerEventResponseFunctionCallArgumentsDone.prototype.itemId;

/**
 * The index of the output item in the response.
 * @type {!number}
 * @export
 */
API.Client.RealtimeServerEventResponseFunctionCallArgumentsDone.prototype.outputIndex;

/**
 * The ID of the function call.
 * @type {!string}
 * @export
 */
API.Client.RealtimeServerEventResponseFunctionCallArgumentsDone.prototype.callId;

/**
 * The final arguments as a JSON string.
 * @type {!string}
 * @export
 */
API.Client.RealtimeServerEventResponseFunctionCallArgumentsDone.prototype.arguments;

/** @enum {string} */
API.Client.RealtimeServerEventResponseFunctionCallArgumentsDone.TypeEnum = { 
  response.function_call_arguments.done: 'response.function_call_arguments.done',
}
