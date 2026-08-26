# CreateVectorStoreRequest


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**`file_ids`** | **`Vector{String}`** | A list of [File](/docs/api-reference/files) IDs that the vector store should use. Useful for tools like &#x60;file_search&#x60; that can access files. | [optional] [default to nothing]
**`name`** | **`String`** | The name of the vector store. | [optional] [default to nothing]
**`expires_after`** | [**`*VectorStoreExpirationAfter`**](VectorStoreExpirationAfter.md) |  | [optional] [default to nothing]
**`chunking_strategy`** | [**`*CreateVectorStoreRequestChunkingStrategy`**](CreateVectorStoreRequestChunkingStrategy.md) |  | [optional] [default to nothing]
**`metadata`** | **`Any`** | Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.  | [optional] [default to nothing]


[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


