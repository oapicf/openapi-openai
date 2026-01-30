# vector_store_file_batch_object_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **char \*** | The identifier, which can be referenced in API endpoints. | 
**object** | **openai_api_vector_store_file_batch_object_OBJECT_e** | The object type, which is always &#x60;vector_store.file_batch&#x60;. | 
**created_at** | **int** | The Unix timestamp (in seconds) for when the vector store files batch was created. | 
**vector_store_id** | **char \*** | The ID of the [vector store](/docs/api-reference/vector-stores/object) that the [File](/docs/api-reference/files) is attached to. | 
**status** | **openai_api_vector_store_file_batch_object_STATUS_e** | The status of the vector store files batch, which can be either &#x60;in_progress&#x60;, &#x60;completed&#x60;, &#x60;cancelled&#x60; or &#x60;failed&#x60;. | 
**file_counts** | [**vector_store_file_batch_object_file_counts_t**](vector_store_file_batch_object_file_counts.md) \* |  | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


