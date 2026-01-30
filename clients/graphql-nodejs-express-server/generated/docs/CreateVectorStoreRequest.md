# CreateVectorStoreRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fileIds** | **String!** | A list of [File](/docs/api-reference/files) IDs that the vector store should use. Useful for tools like &#x60;file_search&#x60; that can access files. | [optional] [default to null]
**name** | **String!** | The name of the vector store. | [optional] [default to null]
**expiresAfter** | [***VectorStoreExpirationAfter**](VectorStoreExpirationAfter.md) |  | [optional] [default to null]
**chunkingStrategy** | [***CreateVectorStoreRequestChunkingStrategy**](CreateVectorStoreRequest_chunking_strategy.md) |  | [optional] [default to null]
**metadata** | [***TodoObjectMapping**](.md) | Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.  | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


