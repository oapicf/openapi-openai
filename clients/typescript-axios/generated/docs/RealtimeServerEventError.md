# RealtimeServerEventError

Returned when an error occurs, which could be a client problem or a server  problem. Most errors are recoverable and the session will stay open, we  recommend to implementors to monitor and log error messages by default. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event_id** | **string** | The unique ID of the server event. | [default to undefined]
**type** | **string** | The event type, must be &#x60;error&#x60;. | [default to undefined]
**error** | [**RealtimeServerEventErrorError**](RealtimeServerEventErrorError.md) |  | [default to undefined]

## Example

```typescript
import { RealtimeServerEventError } from './api';

const instance: RealtimeServerEventError = {
    event_id,
    type,
    error,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
