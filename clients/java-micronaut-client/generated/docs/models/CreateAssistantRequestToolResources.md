

# CreateAssistantRequestToolResources

A set of resources that are used by the assistant's tools. The resources are specific to the type of tool. For example, the `code_interpreter` tool requires a list of file IDs, while the `file_search` tool requires a list of vector store IDs. 

The class is defined in **[CreateAssistantRequestToolResources.java](../../src/main/java/org/openapitools/model/CreateAssistantRequestToolResources.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**codeInterpreter** | [`CreateAssistantRequestToolResourcesCodeInterpreter`](CreateAssistantRequestToolResourcesCodeInterpreter.md) |  |  [optional property]
**fileSearch** | [`CreateAssistantRequestToolResourcesFileSearch`](CreateAssistantRequestToolResourcesFileSearch.md) |  |  [optional property]




