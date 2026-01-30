goog.provide('API.Client.CreateThreadRequest');

/**
 * @record
 */
API.Client.CreateThreadRequest = function() {}

/**
 * A list of [messages](/docs/api-reference/messages) to start the thread with.
 * @type {!Array<!API.Client.CreateMessageRequest>}
 * @export
 */
API.Client.CreateThreadRequest.prototype.messages;

/**
 * @type {!API.Client.CreateThreadRequest_tool_resources}
 * @export
 */
API.Client.CreateThreadRequest.prototype.toolResources;

/**
 * Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
 * @type {!API.Client.Object}
 * @export
 */
API.Client.CreateThreadRequest.prototype.metadata;

