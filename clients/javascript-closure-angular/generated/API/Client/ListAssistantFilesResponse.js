goog.provide('API.Client.ListAssistantFilesResponse');

/**
 * @record
 */
API.Client.ListAssistantFilesResponse = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.ListAssistantFilesResponse.prototype.object;

/**
 * @type {!Array<!API.Client.AssistantFileObject>}
 * @export
 */
API.Client.ListAssistantFilesResponse.prototype.data;

/**
 * @type {!string}
 * @export
 */
API.Client.ListAssistantFilesResponse.prototype.firstId;

/**
 * @type {!string}
 * @export
 */
API.Client.ListAssistantFilesResponse.prototype.lastId;

/**
 * @type {!boolean}
 * @export
 */
API.Client.ListAssistantFilesResponse.prototype.hasMore;

