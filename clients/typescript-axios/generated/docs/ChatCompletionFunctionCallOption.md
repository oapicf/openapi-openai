# ChatCompletionFunctionCallOption

Specifying a particular function via `{\"name\": \"my_function\"}` forces the model to call that function. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **string** | The name of the function to call. | [default to undefined]

## Example

```typescript
import { ChatCompletionFunctionCallOption } from './api';

const instance: ChatCompletionFunctionCallOption = {
    name,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
