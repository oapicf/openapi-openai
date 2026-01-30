# openapi::ModifyAssistantRequestToolResources

A set of resources that are used by the assistant's tools. The resources are specific to the type of tool. For example, the `code_interpreter` tool requires a list of file IDs, while the `file_search` tool requires a list of vector store IDs. 

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code_interpreter** | [**ModifyAssistantRequestToolResourcesCodeInterpreter**](ModifyAssistantRequest_tool_resources_code_interpreter.md) |  | [optional] 
**file_search** | [**ModifyAssistantRequestToolResourcesFileSearch**](ModifyAssistantRequest_tool_resources_file_search.md) |  | [optional] 


