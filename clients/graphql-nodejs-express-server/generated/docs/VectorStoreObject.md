# VectorStoreObject

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id_** | **String!** | The identifier, which can be referenced in API endpoints. | [default to null]
**object** | **String!** | The object type, which is always &#x60;vector_store&#x60;. | [default to null]
**createdAt** | **Int!** | The Unix timestamp (in seconds) for when the vector store was created. | [default to null]
**name** | **String!** | The name of the vector store. | [default to null]
**usageBytes** | **Int!** | The total number of bytes used by the files in the vector store. | [default to null]
**fileCounts** | [***VectorStoreObjectFileCounts**](VectorStoreObject_file_counts.md) |  | [default to null]
**status** | **String!** | The status of the vector store, which can be either &#x60;expired&#x60;, &#x60;in_progress&#x60;, or &#x60;completed&#x60;. A status of &#x60;completed&#x60; indicates that the vector store is ready for use. | [default to null]
**expiresAfter** | [***VectorStoreExpirationAfter**](VectorStoreExpirationAfter.md) |  | [optional] [default to null]
**expiresAt** | **Int** | The Unix timestamp (in seconds) for when the vector store will expire. | [optional] [default to null]
**lastActiveAt** | **Int** | The Unix timestamp (in seconds) for when the vector store was last active. | [default to null]
**metadata** | [***TodoObjectMapping**](.md) | Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.  | [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


