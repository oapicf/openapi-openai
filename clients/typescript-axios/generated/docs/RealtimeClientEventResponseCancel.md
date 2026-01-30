# RealtimeClientEventResponseCancel

Send this event to cancel an in-progress response. The server will respond  with a `response.cancelled` event or an error if there is no response to  cancel. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event_id** | **string** | Optional client-generated ID used to identify this event. | [optional] [default to undefined]
**type** | **string** | The event type, must be &#x60;response.cancel&#x60;. | [default to undefined]
**response_id** | **string** | A specific response ID to cancel - if not provided, will cancel an  in-progress response in the default conversation.  | [optional] [default to undefined]

## Example

```typescript
import { RealtimeClientEventResponseCancel } from './api';

const instance: RealtimeClientEventResponseCancel = {
    event_id,
    type,
    response_id,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
