goog.provide('API.Client.RealtimeResponse_status_details_error');

/**
 * A description of the error that caused the response to fail,  populated when the `status` is `failed`. 
 * @record
 */
API.Client.RealtimeResponseStatusDetailsError = function() {}

/**
 * The type of error.
 * @type {!string}
 * @export
 */
API.Client.RealtimeResponseStatusDetailsError.prototype.type;

/**
 * Error code, if any.
 * @type {!string}
 * @export
 */
API.Client.RealtimeResponseStatusDetailsError.prototype.code;

