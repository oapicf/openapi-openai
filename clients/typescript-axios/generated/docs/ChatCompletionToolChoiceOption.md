# ChatCompletionToolChoiceOption

Controls which (if any) function is called by the model. `none` means the model will not call a function and instead generates a message. `auto` means the model can pick between generating a message or calling a function. Specifying a particular function via `{\"type\": \"function\", \"function\": {\"name\": \"my_function\"}}` forces the model to call that function.  `none` is the default when no functions are present. `auto` is the default if functions are present. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **string** | The type of the tool. Currently, only &#x60;function&#x60; is supported. | [default to undefined]
**_function** | [**ChatCompletionNamedToolChoiceFunction**](ChatCompletionNamedToolChoiceFunction.md) |  | [default to undefined]

## Example

```typescript
import { ChatCompletionToolChoiceOption } from './api';

const instance: ChatCompletionToolChoiceOption = {
    type,
    _function,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
