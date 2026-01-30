# RealtimeServerEventResponseCreated

Returned when a new Response is created. The first event of response creation, where the response is in an initial state of `in_progress`. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event_id** | **string** | The unique ID of the server event. | [default to undefined]
**type** | **string** | The event type, must be &#x60;response.created&#x60;. | [default to undefined]
**response** | [**RealtimeResponse**](RealtimeResponse.md) |  | [default to undefined]

## Example

```typescript
import { RealtimeServerEventResponseCreated } from './api';

const instance: RealtimeServerEventResponseCreated = {
    event_id,
    type,
    response,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
