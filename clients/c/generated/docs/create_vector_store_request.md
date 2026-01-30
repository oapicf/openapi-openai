# create_vector_store_request_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**file_ids** | **list_t \*** | A list of [File](/docs/api-reference/files) IDs that the vector store should use. Useful for tools like &#x60;file_search&#x60; that can access files. | [optional] 
**name** | **char \*** | The name of the vector store. | [optional] 
**expires_after** | [**vector_store_expiration_after_t**](vector_store_expiration_after.md) \* |  | [optional] 
**chunking_strategy** | [**create_vector_store_request_chunking_strategy_t**](create_vector_store_request_chunking_strategy.md) \* |  | [optional] 
**metadata** | [**object_t**](.md) \* | Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


