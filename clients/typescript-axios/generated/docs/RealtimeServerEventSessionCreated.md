# RealtimeServerEventSessionCreated

Returned when a Session is created. Emitted automatically when a new  connection is established as the first server event. This event will contain  the default Session configuration. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event_id** | **string** | The unique ID of the server event. | [default to undefined]
**type** | **string** | The event type, must be &#x60;session.created&#x60;. | [default to undefined]
**session** | [**RealtimeSession**](RealtimeSession.md) |  | [default to undefined]

## Example

```typescript
import { RealtimeServerEventSessionCreated } from './api';

const instance: RealtimeServerEventSessionCreated = {
    event_id,
    type,
    session,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
