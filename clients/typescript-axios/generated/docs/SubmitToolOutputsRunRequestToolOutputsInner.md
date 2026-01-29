# SubmitToolOutputsRunRequestToolOutputsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tool_call_id** | **string** | The ID of the tool call in the &#x60;required_action&#x60; object within the run object the output is being submitted for. | [optional] [default to undefined]
**output** | **string** | The output of the tool call to be submitted to continue the run. | [optional] [default to undefined]

## Example

```typescript
import { SubmitToolOutputsRunRequestToolOutputsInner } from './api';

const instance: SubmitToolOutputsRunRequestToolOutputsInner = {
    tool_call_id,
    output,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
