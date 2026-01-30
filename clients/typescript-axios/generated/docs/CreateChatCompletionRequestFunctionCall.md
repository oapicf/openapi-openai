# CreateChatCompletionRequestFunctionCall

Deprecated in favor of `tool_choice`.  Controls which (if any) function is called by the model.  `none` means the model will not call a function and instead generates a message.  `auto` means the model can pick between generating a message or calling a function.  Specifying a particular function via `{\"name\": \"my_function\"}` forces the model to call that function.  `none` is the default when no functions are present. `auto` is the default if functions are present. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **string** | The name of the function to call. | [default to undefined]

## Example

```typescript
import { CreateChatCompletionRequestFunctionCall } from './api';

const instance: CreateChatCompletionRequestFunctionCall = {
    name,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
