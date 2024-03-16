goog.provide('API.Client.ListFilesResponse');

/**
 * @record
 */
API.Client.ListFilesResponse = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.ListFilesResponse.prototype.object;

/**
 * @type {!Array<!API.Client.OpenAIFile>}
 * @export
 */
API.Client.ListFilesResponse.prototype.data;

