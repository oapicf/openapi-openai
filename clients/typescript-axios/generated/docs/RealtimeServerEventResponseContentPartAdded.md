# RealtimeServerEventResponseContentPartAdded

Returned when a new content part is added to an assistant message item during response generation. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event_id** | **string** | The unique ID of the server event. | [default to undefined]
**type** | **string** | The event type, must be &#x60;response.content_part.added&#x60;. | [default to undefined]
**response_id** | **string** | The ID of the response. | [default to undefined]
**item_id** | **string** | The ID of the item to which the content part was added. | [default to undefined]
**output_index** | **number** | The index of the output item in the response. | [default to undefined]
**content_index** | **number** | The index of the content part in the item\&#39;s content array. | [default to undefined]
**part** | [**RealtimeServerEventResponseContentPartAddedPart**](RealtimeServerEventResponseContentPartAddedPart.md) |  | [default to undefined]

## Example

```typescript
import { RealtimeServerEventResponseContentPartAdded } from './api';

const instance: RealtimeServerEventResponseContentPartAdded = {
    event_id,
    type,
    response_id,
    item_id,
    output_index,
    content_index,
    part,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
