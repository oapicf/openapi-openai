# RealtimeServerEventResponseOutputItemDone

Returned when an Item is done streaming. Also emitted when a Response is  interrupted, incomplete, or cancelled. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event_id** | **string** | The unique ID of the server event. | [default to undefined]
**type** | **string** | The event type, must be &#x60;response.output_item.done&#x60;. | [default to undefined]
**response_id** | **string** | The ID of the Response to which the item belongs. | [default to undefined]
**output_index** | **number** | The index of the output item in the Response. | [default to undefined]
**item** | [**RealtimeConversationItem**](RealtimeConversationItem.md) |  | [default to undefined]

## Example

```typescript
import { RealtimeServerEventResponseOutputItemDone } from './api';

const instance: RealtimeServerEventResponseOutputItemDone = {
    event_id,
    type,
    response_id,
    output_index,
    item,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
