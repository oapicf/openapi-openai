# RunStepDeltaStepDetailsToolCallsCodeObject

Details of the Code Interpreter tool call the run step was involved in.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**index** | **number** | The index of the tool call in the tool calls array. | [default to undefined]
**id** | **string** | The ID of the tool call. | [optional] [default to undefined]
**type** | **string** | The type of tool call. This is always going to be &#x60;code_interpreter&#x60; for this type of tool call. | [default to undefined]
**code_interpreter** | [**RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter**](RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter.md) |  | [optional] [default to undefined]

## Example

```typescript
import { RunStepDeltaStepDetailsToolCallsCodeObject } from './api';

const instance: RunStepDeltaStepDetailsToolCallsCodeObject = {
    index,
    id,
    type,
    code_interpreter,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
