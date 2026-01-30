# CreateAssistantRequestToolResourcesFileSearchVectorStoresInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**file_ids** | **Array&lt;string&gt;** | A list of [file](/docs/api-reference/files) IDs to add to the vector store. There can be a maximum of 10000 files in a vector store.  | [optional] [default to undefined]
**chunking_strategy** | [**CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy**](CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy.md) |  | [optional] [default to undefined]
**metadata** | **object** | Set of 16 key-value pairs that can be attached to a vector store. This can be useful for storing additional information about the vector store in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.  | [optional] [default to undefined]

## Example

```typescript
import { CreateAssistantRequestToolResourcesFileSearchVectorStoresInner } from './api';

const instance: CreateAssistantRequestToolResourcesFileSearchVectorStoresInner = {
    file_ids,
    chunking_strategy,
    metadata,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
