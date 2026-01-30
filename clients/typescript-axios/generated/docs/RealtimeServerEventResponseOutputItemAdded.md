# RealtimeServerEventResponseOutputItemAdded

Returned when a new Item is created during Response generation.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event_id** | **string** | The unique ID of the server event. | [default to undefined]
**type** | **string** | The event type, must be &#x60;response.output_item.added&#x60;. | [default to undefined]
**response_id** | **string** | The ID of the Response to which the item belongs. | [default to undefined]
**output_index** | **number** | The index of the output item in the Response. | [default to undefined]
**item** | [**RealtimeConversationItem**](RealtimeConversationItem.md) |  | [default to undefined]

## Example

```typescript
import { RealtimeServerEventResponseOutputItemAdded } from './api';

const instance: RealtimeServerEventResponseOutputItemAdded = {
    event_id,
    type,
    response_id,
    output_index,
    item,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
