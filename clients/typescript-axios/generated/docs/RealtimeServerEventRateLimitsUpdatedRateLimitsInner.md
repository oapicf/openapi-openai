# RealtimeServerEventRateLimitsUpdatedRateLimitsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **string** | The name of the rate limit (&#x60;requests&#x60;, &#x60;tokens&#x60;).  | [optional] [default to undefined]
**limit** | **number** | The maximum allowed value for the rate limit. | [optional] [default to undefined]
**remaining** | **number** | The remaining value before the limit is reached. | [optional] [default to undefined]
**reset_seconds** | **number** | Seconds until the rate limit resets. | [optional] [default to undefined]

## Example

```typescript
import { RealtimeServerEventRateLimitsUpdatedRateLimitsInner } from './api';

const instance: RealtimeServerEventRateLimitsUpdatedRateLimitsInner = {
    name,
    limit,
    remaining,
    reset_seconds,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
