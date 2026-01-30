# RealtimeServerEventSessionUpdated

Returned when a session is updated with a `session.update` event, unless  there is an error. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event_id** | **string** | The unique ID of the server event. | [default to undefined]
**type** | **string** | The event type, must be &#x60;session.updated&#x60;. | [default to undefined]
**session** | [**RealtimeSession**](RealtimeSession.md) |  | [default to undefined]

## Example

```typescript
import { RealtimeServerEventSessionUpdated } from './api';

const instance: RealtimeServerEventSessionUpdated = {
    event_id,
    type,
    session,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
