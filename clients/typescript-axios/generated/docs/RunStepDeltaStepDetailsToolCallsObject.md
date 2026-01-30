# RunStepDeltaStepDetailsToolCallsObject

Details of the tool call.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **string** | Always &#x60;tool_calls&#x60;. | [default to undefined]
**tool_calls** | [**Array&lt;RunStepDeltaStepDetailsToolCallsObjectToolCallsInner&gt;**](RunStepDeltaStepDetailsToolCallsObjectToolCallsInner.md) | An array of tool calls the run step was involved in. These can be associated with one of three types of tools: &#x60;code_interpreter&#x60;, &#x60;file_search&#x60;, or &#x60;function&#x60;.  | [optional] [default to undefined]

## Example

```typescript
import { RunStepDeltaStepDetailsToolCallsObject } from './api';

const instance: RunStepDeltaStepDetailsToolCallsObject = {
    type,
    tool_calls,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
