# VectorStoreFileBatchObject

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The identifier, which can be referenced in API endpoints. | 
**object** | **Object** | The object type, which is always `vector_store.file_batch`. (enum: vector_store.files_batch) | 
**created_at** | **i32** | The Unix timestamp (in seconds) for when the vector store files batch was created. | 
**vector_store_id** | **String** | The ID of the [vector store](/docs/api-reference/vector-stores/object) that the [File](/docs/api-reference/files) is attached to. | 
**status** | **Status** | The status of the vector store files batch, which can be either `in_progress`, `completed`, `cancelled` or `failed`. (enum: in_progress, completed, cancelled, failed) | 
**file_counts** | [**models::VectorStoreFileBatchObjectFileCounts**](VectorStoreFileBatchObjectFileCounts.md) |  | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


