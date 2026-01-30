# RealtimeClientEventSessionUpdate

Send this event to update the session’s default configuration. The client may  send this event at any time to update the session configuration, and any  field may be updated at any time, except for \"voice\". The server will respond  with a `session.updated` event that shows the full effective configuration.  Only fields that are present are updated, thus the correct way to clear a  field like \"instructions\" is to pass an empty string. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event_id** | **string** | Optional client-generated ID used to identify this event. | [optional] [default to undefined]
**type** | **string** | The event type, must be &#x60;session.update&#x60;. | [default to undefined]
**session** | [**RealtimeSessionCreateRequest**](RealtimeSessionCreateRequest.md) |  | [default to undefined]

## Example

```typescript
import { RealtimeClientEventSessionUpdate } from './api';

const instance: RealtimeClientEventSessionUpdate = {
    event_id,
    type,
    session,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
