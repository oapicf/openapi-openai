# RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter

The Code Interpreter tool call definition.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**input** | **string** | The input to the Code Interpreter tool call. | [optional] [default to undefined]
**outputs** | [**Array&lt;RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner&gt;**](RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner.md) | The outputs from the Code Interpreter tool call. Code Interpreter can output one or more items, including text (&#x60;logs&#x60;) or images (&#x60;image&#x60;). Each of these are represented by a different object type. | [optional] [default to undefined]

## Example

```typescript
import { RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter } from './api';

const instance: RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter = {
    input,
    outputs,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
