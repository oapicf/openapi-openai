# RealtimeServerEventResponseFunctionCallArgumentsDone

Returned when the model-generated function call arguments are done streaming. Also emitted when a Response is interrupted, incomplete, or cancelled. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event_id** | **string** | The unique ID of the server event. | [default to undefined]
**type** | **string** | The event type, must be &#x60;response.function_call_arguments.done&#x60;.  | [default to undefined]
**response_id** | **string** | The ID of the response. | [default to undefined]
**item_id** | **string** | The ID of the function call item. | [default to undefined]
**output_index** | **number** | The index of the output item in the response. | [default to undefined]
**call_id** | **string** | The ID of the function call. | [default to undefined]
**arguments** | **string** | The final arguments as a JSON string. | [default to undefined]

## Example

```typescript
import { RealtimeServerEventResponseFunctionCallArgumentsDone } from './api';

const instance: RealtimeServerEventResponseFunctionCallArgumentsDone = {
    event_id,
    type,
    response_id,
    item_id,
    output_index,
    call_id,
    arguments,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
