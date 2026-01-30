goog.provide('API.Client.BatchRequestOutput_response');

/**
 * @record
 */
API.Client.BatchRequestOutputResponse = function() {}

/**
 * The HTTP status code of the response
 * @type {!number}
 * @export
 */
API.Client.BatchRequestOutputResponse.prototype.statusCode;

/**
 * An unique identifier for the OpenAI API request. Please include this request ID when contacting support.
 * @type {!string}
 * @export
 */
API.Client.BatchRequestOutputResponse.prototype.requestId;

/**
 * The JSON body of the response
 * @type {!API.Client.Object}
 * @export
 */
API.Client.BatchRequestOutputResponse.prototype.body;

