# CreateVectorStoreRequestChunkingStrategy

The chunking strategy used to chunk the file(s). If not set, will use the `auto` strategy. Only applicable if `file_ids` is non-empty.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **string** | Always &#x60;auto&#x60;. | [default to undefined]
**_static** | [**StaticChunkingStrategy**](StaticChunkingStrategy.md) |  | [default to undefined]

## Example

```typescript
import { CreateVectorStoreRequestChunkingStrategy } from './api';

const instance: CreateVectorStoreRequestChunkingStrategy = {
    type,
    _static,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
