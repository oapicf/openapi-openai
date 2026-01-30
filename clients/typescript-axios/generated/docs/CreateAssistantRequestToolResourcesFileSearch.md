# CreateAssistantRequestToolResourcesFileSearch


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**vector_store_ids** | **Array&lt;string&gt;** | The [vector store](/docs/api-reference/vector-stores/object) attached to this assistant. There can be a maximum of 1 vector store attached to the assistant.  | [optional] [default to undefined]
**vector_stores** | [**Array&lt;CreateAssistantRequestToolResourcesFileSearchVectorStoresInner&gt;**](CreateAssistantRequestToolResourcesFileSearchVectorStoresInner.md) | A helper to create a [vector store](/docs/api-reference/vector-stores/object) with file_ids and attach it to this assistant. There can be a maximum of 1 vector store attached to the assistant.  | [optional] [default to undefined]

## Example

```typescript
import { CreateAssistantRequestToolResourcesFileSearch } from './api';

const instance: CreateAssistantRequestToolResourcesFileSearch = {
    vector_store_ids,
    vector_stores,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
