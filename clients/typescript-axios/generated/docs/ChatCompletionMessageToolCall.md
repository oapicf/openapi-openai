# ChatCompletionMessageToolCall


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **string** | The ID of the tool call. | [default to undefined]
**type** | **string** | The type of the tool. Currently, only &#x60;function&#x60; is supported. | [default to undefined]
**_function** | [**ChatCompletionMessageToolCallFunction**](ChatCompletionMessageToolCallFunction.md) |  | [default to undefined]

## Example

```typescript
import { ChatCompletionMessageToolCall } from './api';

const instance: ChatCompletionMessageToolCall = {
    id,
    type,
    _function,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
