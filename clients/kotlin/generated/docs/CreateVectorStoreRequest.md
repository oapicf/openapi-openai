
# CreateVectorStoreRequest

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **fileIds** | **kotlin.collections.List&lt;kotlin.String&gt;** | A list of [File](/docs/api-reference/files) IDs that the vector store should use. Useful for tools like &#x60;file_search&#x60; that can access files. |  [optional] |
| **name** | **kotlin.String** | The name of the vector store. |  [optional] |
| **expiresAfter** | [**VectorStoreExpirationAfter**](VectorStoreExpirationAfter.md) |  |  [optional] |
| **chunkingStrategy** | [**CreateVectorStoreRequestChunkingStrategy**](CreateVectorStoreRequestChunkingStrategy.md) |  |  [optional] |
| **metadata** | [**kotlin.Any**](.md) | Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.  |  [optional] |



