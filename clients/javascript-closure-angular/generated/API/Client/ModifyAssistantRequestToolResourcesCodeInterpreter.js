goog.provide('API.Client.ModifyAssistantRequest_tool_resources_code_interpreter');

/**
 * @record
 */
API.Client.ModifyAssistantRequestToolResourcesCodeInterpreter = function() {}

/**
 * Overrides the list of [file](/docs/api-reference/files) IDs made available to the `code_interpreter` tool. There can be a maximum of 20 files associated with the tool. 
 * @type {!Array<!string>}
 * @export
 */
API.Client.ModifyAssistantRequestToolResourcesCodeInterpreter.prototype.fileIds;

