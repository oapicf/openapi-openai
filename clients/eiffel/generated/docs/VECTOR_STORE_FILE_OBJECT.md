# VECTOR_STORE_FILE_OBJECT

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**STRING_32**](STRING_32.md) | The identifier, which can be referenced in API endpoints. | [default to null]
**object** | [**STRING_32**](STRING_32.md) | The object type, which is always &#x60;vector_store.file&#x60;. | [default to null]
**usage_bytes** | **INTEGER_32** | The total vector store usage in bytes. Note that this may be different from the original file size. | [default to null]
**created_at** | **INTEGER_32** | The Unix timestamp (in seconds) for when the vector store file was created. | [default to null]
**vector_store_id** | [**STRING_32**](STRING_32.md) | The ID of the [vector store](/docs/api-reference/vector-stores/object) that the [File](/docs/api-reference/files) is attached to. | [default to null]
**status** | [**STRING_32**](STRING_32.md) | The status of the vector store file, which can be either &#x60;in_progress&#x60;, &#x60;completed&#x60;, &#x60;cancelled&#x60;, or &#x60;failed&#x60;. The status &#x60;completed&#x60; indicates that the vector store file is ready for use. | [default to null]
**last_error** | [**VECTOR_STORE_FILE_OBJECT_LAST_ERROR**](VectorStoreFileObject_last_error.md) |  | [default to null]
**chunking_strategy** | [**VECTOR_STORE_FILE_OBJECT_CHUNKING_STRATEGY**](VectorStoreFileObject_chunking_strategy.md) |  | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


