goog.provide('API.Client.OpenAIFile');

/**
 * @record
 */
API.Client.OpenAIFile = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.OpenAIFile.prototype.id;

/**
 * @type {!string}
 * @export
 */
API.Client.OpenAIFile.prototype.object;

/**
 * @type {!number}
 * @export
 */
API.Client.OpenAIFile.prototype.bytes;

/**
 * @type {!number}
 * @export
 */
API.Client.OpenAIFile.prototype.createdAt;

/**
 * @type {!string}
 * @export
 */
API.Client.OpenAIFile.prototype.filename;

/**
 * @type {!string}
 * @export
 */
API.Client.OpenAIFile.prototype.purpose;

/**
 * @type {!string}
 * @export
 */
API.Client.OpenAIFile.prototype.status;

/**
 * @type {!API.Client.Object}
 * @export
 */
API.Client.OpenAIFile.prototype.statusDetails;

