# RunStepDetailsToolCallsObjectToolCallsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **string** | The ID of the tool call object. | [default to undefined]
**type** | **string** | The type of tool call. This is always going to be &#x60;code_interpreter&#x60; for this type of tool call. | [default to undefined]
**code_interpreter** | [**RunStepDetailsToolCallsCodeObjectCodeInterpreter**](RunStepDetailsToolCallsCodeObjectCodeInterpreter.md) |  | [default to undefined]
**retrieval** | **object** | For now, this is always going to be an empty object. | [default to undefined]
**_function** | [**RunStepDetailsToolCallsFunctionObjectFunction**](RunStepDetailsToolCallsFunctionObjectFunction.md) |  | [default to undefined]

## Example

```typescript
import { RunStepDetailsToolCallsObjectToolCallsInner } from './api';

const instance: RunStepDetailsToolCallsObjectToolCallsInner = {
    id,
    type,
    code_interpreter,
    retrieval,
    _function,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
