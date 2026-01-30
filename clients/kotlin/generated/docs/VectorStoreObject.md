
# VectorStoreObject

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **kotlin.String** | The identifier, which can be referenced in API endpoints. |  |
| **&#x60;object&#x60;** | [**inline**](#&#x60;Object&#x60;) | The object type, which is always &#x60;vector_store&#x60;. |  |
| **createdAt** | **kotlin.Int** | The Unix timestamp (in seconds) for when the vector store was created. |  |
| **name** | **kotlin.String** | The name of the vector store. |  |
| **usageBytes** | **kotlin.Int** | The total number of bytes used by the files in the vector store. |  |
| **fileCounts** | [**VectorStoreObjectFileCounts**](VectorStoreObjectFileCounts.md) |  |  |
| **status** | [**inline**](#Status) | The status of the vector store, which can be either &#x60;expired&#x60;, &#x60;in_progress&#x60;, or &#x60;completed&#x60;. A status of &#x60;completed&#x60; indicates that the vector store is ready for use. |  |
| **lastActiveAt** | **kotlin.Int** | The Unix timestamp (in seconds) for when the vector store was last active. |  |
| **metadata** | [**kotlin.Any**](.md) | Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.  |  |
| **expiresAfter** | [**VectorStoreExpirationAfter**](VectorStoreExpirationAfter.md) |  |  [optional] |
| **expiresAt** | **kotlin.Int** | The Unix timestamp (in seconds) for when the vector store will expire. |  [optional] |


<a id="`Object`"></a>
## Enum: object
| Name | Value |
| ---- | ----- |
| &#x60;object&#x60; | vector_store |


<a id="Status"></a>
## Enum: status
| Name | Value |
| ---- | ----- |
| status | expired, in_progress, completed |



