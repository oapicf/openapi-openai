# CreateAssistantRequestToolResourcesFileSearchVectorStoresInner


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**`file_ids`** | **`Vector{String}`** | A list of [file](/docs/api-reference/files) IDs to add to the vector store. There can be a maximum of 10000 files in a vector store.  | [optional] [default to nothing]
**`chunking_strategy`** | [**`*CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy`**](CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy.md) |  | [optional] [default to nothing]
**`metadata`** | **`Any`** | Set of 16 key-value pairs that can be attached to a vector store. This can be useful for storing additional information about the vector store in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.  | [optional] [default to nothing]


[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


