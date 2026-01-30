# RealtimeServerEventRateLimitsUpdated

Emitted at the beginning of a Response to indicate the updated rate limits.  When a Response is created some tokens will be \"reserved\" for the output  tokens, the rate limits shown here reflect that reservation, which is then  adjusted accordingly once the Response is completed. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event_id** | **string** | The unique ID of the server event. | [default to undefined]
**type** | **string** | The event type, must be &#x60;rate_limits.updated&#x60;. | [default to undefined]
**rate_limits** | [**Array&lt;RealtimeServerEventRateLimitsUpdatedRateLimitsInner&gt;**](RealtimeServerEventRateLimitsUpdatedRateLimitsInner.md) | List of rate limit information. | [default to undefined]

## Example

```typescript
import { RealtimeServerEventRateLimitsUpdated } from './api';

const instance: RealtimeServerEventRateLimitsUpdated = {
    event_id,
    type,
    rate_limits,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
