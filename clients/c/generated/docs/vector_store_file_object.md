# vector_store_file_object_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **char \*** | The identifier, which can be referenced in API endpoints. | 
**object** | **openai_api_vector_store_file_object_OBJECT_e** | The object type, which is always &#x60;vector_store.file&#x60;. | 
**usage_bytes** | **int** | The total vector store usage in bytes. Note that this may be different from the original file size. | 
**created_at** | **int** | The Unix timestamp (in seconds) for when the vector store file was created. | 
**vector_store_id** | **char \*** | The ID of the [vector store](/docs/api-reference/vector-stores/object) that the [File](/docs/api-reference/files) is attached to. | 
**status** | **openai_api_vector_store_file_object_STATUS_e** | The status of the vector store file, which can be either &#x60;in_progress&#x60;, &#x60;completed&#x60;, &#x60;cancelled&#x60;, or &#x60;failed&#x60;. The status &#x60;completed&#x60; indicates that the vector store file is ready for use. | 
**last_error** | [**vector_store_file_object_last_error_t**](vector_store_file_object_last_error.md) \* |  | 
**chunking_strategy** | [**vector_store_file_object_chunking_strategy_t**](vector_store_file_object_chunking_strategy.md) \* |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


