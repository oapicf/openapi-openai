goog.provide('API.Client.ModifyThreadRequest_tool_resources');

/**
 * A set of resources that are made available to the assistant's tools in this thread. The resources are specific to the type of tool. For example, the `code_interpreter` tool requires a list of file IDs, while the `file_search` tool requires a list of vector store IDs. 
 * @record
 */
API.Client.ModifyThreadRequestToolResources = function() {}

/**
 * @type {!API.Client.CreateAssistantRequest_tool_resources_code_interpreter}
 * @export
 */
API.Client.ModifyThreadRequestToolResources.prototype.codeInterpreter;

/**
 * @type {!API.Client.ModifyThreadRequest_tool_resources_file_search}
 * @export
 */
API.Client.ModifyThreadRequestToolResources.prototype.fileSearch;

