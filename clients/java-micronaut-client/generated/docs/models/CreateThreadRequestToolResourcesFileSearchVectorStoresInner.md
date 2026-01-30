

# CreateThreadRequestToolResourcesFileSearchVectorStoresInner

The class is defined in **[CreateThreadRequestToolResourcesFileSearchVectorStoresInner.java](../../src/main/java/org/openapitools/model/CreateThreadRequestToolResourcesFileSearchVectorStoresInner.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fileIds** | `List&lt;String&gt;` | A list of [file](/docs/api-reference/files) IDs to add to the vector store. There can be a maximum of 10000 files in a vector store.  |  [optional property]
**chunkingStrategy** | [`CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy`](CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy.md) |  |  [optional property]
**metadata** | `Object` | Set of 16 key-value pairs that can be attached to a vector store. This can be useful for storing additional information about the vector store in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.  |  [optional property]





