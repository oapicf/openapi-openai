goog.provide('API.Client.ListAssistantsResponse');

/**
 * @record
 */
API.Client.ListAssistantsResponse = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.ListAssistantsResponse.prototype.object;

/**
 * @type {!Array<!API.Client.AssistantObject>}
 * @export
 */
API.Client.ListAssistantsResponse.prototype.data;

/**
 * @type {!string}
 * @export
 */
API.Client.ListAssistantsResponse.prototype.firstId;

/**
 * @type {!string}
 * @export
 */
API.Client.ListAssistantsResponse.prototype.lastId;

/**
 * @type {!boolean}
 * @export
 */
API.Client.ListAssistantsResponse.prototype.hasMore;

