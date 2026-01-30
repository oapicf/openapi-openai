goog.provide('API.Client.CreateMessageRequest_attachments_inner_tools_inner');

/**
 * @record
 */
API.Client.CreateMessageRequestAttachmentsInnerToolsInner = function() {}

/**
 * The type of tool being defined: `code_interpreter`
 * @type {!string}
 * @export
 */
API.Client.CreateMessageRequestAttachmentsInnerToolsInner.prototype.type;

/** @enum {string} */
API.Client.CreateMessageRequestAttachmentsInnerToolsInner.TypeEnum = { 
  code_interpreter: 'code_interpreter',
  file_search: 'file_search',
}
