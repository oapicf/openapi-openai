# ChatCompletionMessageToolCallChunk


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**index** | **number** |  | [default to undefined]
**id** | **string** | The ID of the tool call. | [optional] [default to undefined]
**type** | **string** | The type of the tool. Currently, only &#x60;function&#x60; is supported. | [optional] [default to undefined]
**_function** | [**ChatCompletionMessageToolCallChunkFunction**](ChatCompletionMessageToolCallChunkFunction.md) |  | [optional] [default to undefined]

## Example

```typescript
import { ChatCompletionMessageToolCallChunk } from './api';

const instance: ChatCompletionMessageToolCallChunk = {
    index,
    id,
    type,
    _function,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
