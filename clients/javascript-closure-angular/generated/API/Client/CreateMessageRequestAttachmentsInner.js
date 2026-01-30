goog.provide('API.Client.CreateMessageRequest_attachments_inner');

/**
 * @record
 */
API.Client.CreateMessageRequestAttachmentsInner = function() {}

/**
 * The ID of the file to attach to the message.
 * @type {!string}
 * @export
 */
API.Client.CreateMessageRequestAttachmentsInner.prototype.fileId;

/**
 * The tools to add this file to.
 * @type {!Array<!API.Client.CreateMessageRequest_attachments_inner_tools_inner>}
 * @export
 */
API.Client.CreateMessageRequestAttachmentsInner.prototype.tools;

