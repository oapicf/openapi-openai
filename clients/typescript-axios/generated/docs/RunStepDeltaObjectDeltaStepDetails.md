# RunStepDeltaObjectDeltaStepDetails

The details of the run step.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **string** | Always &#x60;message_creation&#x60;. | [default to undefined]
**message_creation** | [**RunStepDeltaStepDetailsMessageCreationObjectMessageCreation**](RunStepDeltaStepDetailsMessageCreationObjectMessageCreation.md) |  | [optional] [default to undefined]
**tool_calls** | [**Array&lt;RunStepDeltaStepDetailsToolCallsObjectToolCallsInner&gt;**](RunStepDeltaStepDetailsToolCallsObjectToolCallsInner.md) | An array of tool calls the run step was involved in. These can be associated with one of three types of tools: &#x60;code_interpreter&#x60;, &#x60;retrieval&#x60;, or &#x60;function&#x60;.  | [optional] [default to undefined]

## Example

```typescript
import { RunStepDeltaObjectDeltaStepDetails } from './api';

const instance: RunStepDeltaObjectDeltaStepDetails = {
    type,
    message_creation,
    tool_calls,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
