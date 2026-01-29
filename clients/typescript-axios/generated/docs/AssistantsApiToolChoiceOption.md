# AssistantsApiToolChoiceOption

Controls which (if any) tool is called by the model. `none` means the model will not call any tools and instead generates a message. `auto` is the default value and means the model can pick between generating a message or calling a tool. Specifying a particular tool like `{\"type\": \"TOOL_TYPE\"}` or `{\"type\": \"function\", \"function\": {\"name\": \"my_function\"}}` forces the model to call that tool. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **string** | The type of the tool. If type is &#x60;function&#x60;, the function name must be set | [default to undefined]
**_function** | [**ChatCompletionNamedToolChoiceFunction**](ChatCompletionNamedToolChoiceFunction.md) |  | [optional] [default to undefined]

## Example

```typescript
import { AssistantsApiToolChoiceOption } from './api';

const instance: AssistantsApiToolChoiceOption = {
    type,
    _function,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
