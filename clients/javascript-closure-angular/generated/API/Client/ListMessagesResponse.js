goog.provide('API.Client.ListMessagesResponse');

/**
 * @record
 */
API.Client.ListMessagesResponse = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.ListMessagesResponse.prototype.object;

/**
 * @type {!Array<!API.Client.MessageObject>}
 * @export
 */
API.Client.ListMessagesResponse.prototype.data;

/**
 * @type {!string}
 * @export
 */
API.Client.ListMessagesResponse.prototype.firstId;

/**
 * @type {!string}
 * @export
 */
API.Client.ListMessagesResponse.prototype.lastId;

/**
 * @type {!boolean}
 * @export
 */
API.Client.ListMessagesResponse.prototype.hasMore;

