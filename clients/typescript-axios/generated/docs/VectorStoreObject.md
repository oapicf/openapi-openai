# VectorStoreObject

A vector store is a collection of processed files can be used by the `file_search` tool.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **string** | The identifier, which can be referenced in API endpoints. | [default to undefined]
**object** | **string** | The object type, which is always &#x60;vector_store&#x60;. | [default to undefined]
**created_at** | **number** | The Unix timestamp (in seconds) for when the vector store was created. | [default to undefined]
**name** | **string** | The name of the vector store. | [default to undefined]
**usage_bytes** | **number** | The total number of bytes used by the files in the vector store. | [default to undefined]
**file_counts** | [**VectorStoreObjectFileCounts**](VectorStoreObjectFileCounts.md) |  | [default to undefined]
**status** | **string** | The status of the vector store, which can be either &#x60;expired&#x60;, &#x60;in_progress&#x60;, or &#x60;completed&#x60;. A status of &#x60;completed&#x60; indicates that the vector store is ready for use. | [default to undefined]
**expires_after** | [**VectorStoreExpirationAfter**](VectorStoreExpirationAfter.md) |  | [optional] [default to undefined]
**expires_at** | **number** | The Unix timestamp (in seconds) for when the vector store will expire. | [optional] [default to undefined]
**last_active_at** | **number** | The Unix timestamp (in seconds) for when the vector store was last active. | [default to undefined]
**metadata** | **object** | Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.  | [default to undefined]

## Example

```typescript
import { VectorStoreObject } from './api';

const instance: VectorStoreObject = {
    id,
    object,
    created_at,
    name,
    usage_bytes,
    file_counts,
    status,
    expires_after,
    expires_at,
    last_active_at,
    metadata,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
