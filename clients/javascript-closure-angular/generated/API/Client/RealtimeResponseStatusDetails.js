goog.provide('API.Client.RealtimeResponse_status_details');

/**
 * Additional details about the status.
 * @record
 */
API.Client.RealtimeResponseStatusDetails = function() {}

/**
 * The type of error that caused the response to fail, corresponding  with the `status` field (`completed`, `cancelled`, `incomplete`,  `failed`). 
 * @type {!string}
 * @export
 */
API.Client.RealtimeResponseStatusDetails.prototype.type;

/**
 * The reason the Response did not complete. For a `cancelled` Response,  one of `turn_detected` (the server VAD detected a new start of speech)  or `client_cancelled` (the client sent a cancel event). For an  `incomplete` Response, one of `max_output_tokens` or `content_filter`  (the server-side safety filter activated and cut off the response). 
 * @type {!string}
 * @export
 */
API.Client.RealtimeResponseStatusDetails.prototype.reason;

/**
 * @type {!API.Client.RealtimeResponse_status_details_error}
 * @export
 */
API.Client.RealtimeResponseStatusDetails.prototype.error;

/** @enum {string} */
API.Client.RealtimeResponseStatusDetails.TypeEnum = { 
  completed: 'completed',
  cancelled: 'cancelled',
  failed: 'failed',
  incomplete: 'incomplete',
}
/** @enum {string} */
API.Client.RealtimeResponseStatusDetails.ReasonEnum = { 
  turn_detected: 'turn_detected',
  client_cancelled: 'client_cancelled',
  max_output_tokens: 'max_output_tokens',
  content_filter: 'content_filter',
}
