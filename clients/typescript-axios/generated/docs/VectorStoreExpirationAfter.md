# VectorStoreExpirationAfter

The expiration policy for a vector store.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**anchor** | **string** | Anchor timestamp after which the expiration policy applies. Supported anchors: &#x60;last_active_at&#x60;. | [default to undefined]
**days** | **number** | The number of days after the anchor time that the vector store will expire. | [default to undefined]

## Example

```typescript
import { VectorStoreExpirationAfter } from './api';

const instance: VectorStoreExpirationAfter = {
    anchor,
    days,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
