# SubmitToolOutputsRunRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tool_outputs** | [**Array&lt;SubmitToolOutputsRunRequestToolOutputsInner&gt;**](SubmitToolOutputsRunRequestToolOutputsInner.md) | A list of tools for which the outputs are being submitted. | [default to undefined]
**stream** | **boolean** | If &#x60;true&#x60;, returns a stream of events that happen during the Run as server-sent events, terminating when the Run enters a terminal state with a &#x60;data: [DONE]&#x60; message.  | [optional] [default to undefined]

## Example

```typescript
import { SubmitToolOutputsRunRequest } from './api';

const instance: SubmitToolOutputsRunRequest = {
    tool_outputs,
    stream,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
