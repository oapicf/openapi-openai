# WWW::OpenAPIClient::Object::VectorStoreFileBatchObject

## Load the model package
```perl
use WWW::OpenAPIClient::Object::VectorStoreFileBatchObject;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **string** | The identifier, which can be referenced in API endpoints. | 
**object** | **string** | The object type, which is always &#x60;vector_store.file_batch&#x60;. | 
**created_at** | **int** | The Unix timestamp (in seconds) for when the vector store files batch was created. | 
**vector_store_id** | **string** | The ID of the [vector store](/docs/api-reference/vector-stores/object) that the [File](/docs/api-reference/files) is attached to. | 
**status** | **string** | The status of the vector store files batch, which can be either &#x60;in_progress&#x60;, &#x60;completed&#x60;, &#x60;cancelled&#x60; or &#x60;failed&#x60;. | 
**file_counts** | [**VectorStoreFileBatchObjectFileCounts**](VectorStoreFileBatchObjectFileCounts.md) |  | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


