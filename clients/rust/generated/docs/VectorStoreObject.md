# VectorStoreObject

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The identifier, which can be referenced in API endpoints. | 
**object** | **String** | The object type, which is always `vector_store`. | 
**created_at** | **i32** | The Unix timestamp (in seconds) for when the vector store was created. | 
**name** | **String** | The name of the vector store. | 
**usage_bytes** | **i32** | The total number of bytes used by the files in the vector store. | 
**file_counts** | [**models::VectorStoreObjectFileCounts**](VectorStoreObject_file_counts.md) |  | 
**status** | **String** | The status of the vector store, which can be either `expired`, `in_progress`, or `completed`. A status of `completed` indicates that the vector store is ready for use. | 
**expires_after** | Option<[**models::VectorStoreExpirationAfter**](VectorStoreExpirationAfter.md)> |  | [optional]
**expires_at** | Option<**i32**> | The Unix timestamp (in seconds) for when the vector store will expire. | [optional]
**last_active_at** | Option<**i32**> | The Unix timestamp (in seconds) for when the vector store was last active. | 
**metadata** | Option<[**serde_json::Value**](.md)> | Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.  | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


