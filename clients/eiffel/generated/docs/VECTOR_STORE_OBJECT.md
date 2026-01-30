# VECTOR_STORE_OBJECT

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**STRING_32**](STRING_32.md) | The identifier, which can be referenced in API endpoints. | [default to null]
**object** | [**STRING_32**](STRING_32.md) | The object type, which is always &#x60;vector_store&#x60;. | [default to null]
**created_at** | **INTEGER_32** | The Unix timestamp (in seconds) for when the vector store was created. | [default to null]
**name** | [**STRING_32**](STRING_32.md) | The name of the vector store. | [default to null]
**usage_bytes** | **INTEGER_32** | The total number of bytes used by the files in the vector store. | [default to null]
**file_counts** | [**VECTOR_STORE_OBJECT_FILE_COUNTS**](VectorStoreObject_file_counts.md) |  | [default to null]
**status** | [**STRING_32**](STRING_32.md) | The status of the vector store, which can be either &#x60;expired&#x60;, &#x60;in_progress&#x60;, or &#x60;completed&#x60;. A status of &#x60;completed&#x60; indicates that the vector store is ready for use. | [default to null]
**expires_after** | [**VECTOR_STORE_EXPIRATION_AFTER**](VectorStoreExpirationAfter.md) |  | [optional] [default to null]
**expires_at** | **INTEGER_32** | The Unix timestamp (in seconds) for when the vector store will expire. | [optional] [default to null]
**last_active_at** | **INTEGER_32** | The Unix timestamp (in seconds) for when the vector store was last active. | [default to null]
**metadata** | [**ANY**](.md) | Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.  | [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


