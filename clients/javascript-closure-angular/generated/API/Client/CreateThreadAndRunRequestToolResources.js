goog.provide('API.Client.CreateThreadAndRunRequest_tool_resources');

/**
 * A set of resources that are used by the assistant's tools. The resources are specific to the type of tool. For example, the `code_interpreter` tool requires a list of file IDs, while the `file_search` tool requires a list of vector store IDs. 
 * @record
 */
API.Client.CreateThreadAndRunRequestToolResources = function() {}

/**
 * @type {!API.Client.CreateAssistantRequest_tool_resources_code_interpreter}
 * @export
 */
API.Client.CreateThreadAndRunRequestToolResources.prototype.codeInterpreter;

/**
 * @type {!API.Client.AssistantObject_tool_resources_file_search}
 * @export
 */
API.Client.CreateThreadAndRunRequestToolResources.prototype.fileSearch;

