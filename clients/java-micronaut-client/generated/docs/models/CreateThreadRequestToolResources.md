

# CreateThreadRequestToolResources

A set of resources that are made available to the assistant's tools in this thread. The resources are specific to the type of tool. For example, the `code_interpreter` tool requires a list of file IDs, while the `file_search` tool requires a list of vector store IDs. 

The class is defined in **[CreateThreadRequestToolResources.java](../../src/main/java/org/openapitools/model/CreateThreadRequestToolResources.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**codeInterpreter** | [`CreateAssistantRequestToolResourcesCodeInterpreter`](CreateAssistantRequestToolResourcesCodeInterpreter.md) |  |  [optional property]
**fileSearch** | [`CreateThreadRequestToolResourcesFileSearch`](CreateThreadRequestToolResourcesFileSearch.md) |  |  [optional property]




