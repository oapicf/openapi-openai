# VectorStoreFileObject

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The identifier, which can be referenced in API endpoints. | 
**object** | **Object** | The object type, which is always `vector_store.file`. (enum: vector_store.file) | 
**usage_bytes** | **i32** | The total vector store usage in bytes. Note that this may be different from the original file size. | 
**created_at** | **i32** | The Unix timestamp (in seconds) for when the vector store file was created. | 
**vector_store_id** | **String** | The ID of the [vector store](/docs/api-reference/vector-stores/object) that the [File](/docs/api-reference/files) is attached to. | 
**status** | **Status** | The status of the vector store file, which can be either `in_progress`, `completed`, `cancelled`, or `failed`. The status `completed` indicates that the vector store file is ready for use. (enum: in_progress, completed, cancelled, failed) | 
**last_error** | Option<[**models::VectorStoreFileObjectLastError**](VectorStoreFileObjectLastError.md)> |  | 
**chunking_strategy** | Option<[**models::VectorStoreFileObjectChunkingStrategy**](VectorStoreFileObjectChunkingStrategy.md)> |  | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


