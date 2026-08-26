# CreateVectorStoreRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**file_ids** | **Vec<String>** | A list of [File](/docs/api-reference/files) IDs that the vector store should use. Useful for tools like `file_search` that can access files. | [optional] [default to None]
**name** | **String** | The name of the vector store. | [optional] [default to None]
**expires_after** | [***models::VectorStoreExpirationAfter**](VectorStoreExpirationAfter.md) |  | [optional] [default to None]
**chunking_strategy** | [***models::CreateVectorStoreRequestChunkingStrategy**](CreateVectorStoreRequest_chunking_strategy.md) |  | [optional] [default to None]
**metadata** | [***serde_json::Value**](.md) | Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.  | [optional] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


