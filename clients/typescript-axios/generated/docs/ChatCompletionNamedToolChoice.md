# ChatCompletionNamedToolChoice

Specifies a tool the model should use. Use to force the model to call a specific function.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **string** | The type of the tool. Currently, only &#x60;function&#x60; is supported. | [default to undefined]
**_function** | [**AssistantsNamedToolChoiceFunction**](AssistantsNamedToolChoiceFunction.md) |  | [default to undefined]

## Example

```typescript
import { ChatCompletionNamedToolChoice } from './api';

const instance: ChatCompletionNamedToolChoice = {
    type,
    _function,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
