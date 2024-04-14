goog.provide('API.Client.ListFilesResponse');

/**
 * @record
 */
API.Client.ListFilesResponse = function() {}

/**
 * @type {!Array<!API.Client.OpenAIFile>}
 * @export
 */
API.Client.ListFilesResponse.prototype.data;

/**
 * @type {!string}
 * @export
 */
API.Client.ListFilesResponse.prototype.object;

/** @enum {string} */
API.Client.ListFilesResponse.ObjectEnum = { 
  list: 'list',
}
