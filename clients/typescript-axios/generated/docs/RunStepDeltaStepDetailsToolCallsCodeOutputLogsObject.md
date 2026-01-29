# RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject

Text output from the Code Interpreter tool call as part of a run step.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**index** | **number** | The index of the output in the outputs array. | [default to undefined]
**type** | **string** | Always &#x60;logs&#x60;. | [default to undefined]
**logs** | **string** | The text output from the Code Interpreter tool call. | [optional] [default to undefined]

## Example

```typescript
import { RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject } from './api';

const instance: RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject = {
    index,
    type,
    logs,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
