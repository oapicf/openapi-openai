# ListAuditLogsEffectiveAtParameter


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**gt** | **number** | Return only events whose &#x60;effective_at&#x60; (Unix seconds) is greater than this value. | [optional] [default to undefined]
**gte** | **number** | Return only events whose &#x60;effective_at&#x60; (Unix seconds) is greater than or equal to this value. | [optional] [default to undefined]
**lt** | **number** | Return only events whose &#x60;effective_at&#x60; (Unix seconds) is less than this value. | [optional] [default to undefined]
**lte** | **number** | Return only events whose &#x60;effective_at&#x60; (Unix seconds) is less than or equal to this value. | [optional] [default to undefined]

## Example

```typescript
import { ListAuditLogsEffectiveAtParameter } from './api';

const instance: ListAuditLogsEffectiveAtParameter = {
    gt,
    gte,
    lt,
    lte,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
