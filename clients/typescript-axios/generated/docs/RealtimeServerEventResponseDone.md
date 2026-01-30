# RealtimeServerEventResponseDone

Returned when a Response is done streaming. Always emitted, no matter the  final state. The Response object included in the `response.done` event will  include all output Items in the Response but will omit the raw audio data. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event_id** | **string** | The unique ID of the server event. | [default to undefined]
**type** | **string** | The event type, must be &#x60;response.done&#x60;. | [default to undefined]
**response** | [**RealtimeResponse**](RealtimeResponse.md) |  | [default to undefined]

## Example

```typescript
import { RealtimeServerEventResponseDone } from './api';

const instance: RealtimeServerEventResponseDone = {
    event_id,
    type,
    response,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
