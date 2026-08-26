# VectorStoreFileObject

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The identifier, which can be referenced in API endpoints. | 
**object** | [***models::VectorStoreFileObjectObject**](VectorStoreFileObject_object.md) |  | 
**usage_bytes** | **i32** | The total vector store usage in bytes. Note that this may be different from the original file size. | 
**created_at** | **i32** | The Unix timestamp (in seconds) for when the vector store file was created. | 
**vector_store_id** | **String** | The ID of the [vector store](/docs/api-reference/vector-stores/object) that the [File](/docs/api-reference/files) is attached to. | 
**status** | [***models::VectorStoreFileObjectStatus**](VectorStoreFileObject_status.md) |  | 
**last_error** | [***swagger::Nullable<models::VectorStoreFileObjectLastError>**](VectorStoreFileObject_last_error.md) |  | 
**chunking_strategy** | [***models::VectorStoreFileObjectChunkingStrategy**](VectorStoreFileObject_chunking_strategy.md) |  | [optional] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


