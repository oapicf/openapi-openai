# AssistantsApiNamedToolChoice

Specifies a tool the model should use. Use to force the model to call a specific tool.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **string** | The type of the tool. If type is &#x60;function&#x60;, the function name must be set | [default to undefined]
**_function** | [**ChatCompletionNamedToolChoiceFunction**](ChatCompletionNamedToolChoiceFunction.md) |  | [optional] [default to undefined]

## Example

```typescript
import { AssistantsApiNamedToolChoice } from './api';

const instance: AssistantsApiNamedToolChoice = {
    type,
    _function,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
