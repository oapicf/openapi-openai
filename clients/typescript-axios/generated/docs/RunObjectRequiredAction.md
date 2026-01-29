# RunObjectRequiredAction

Details on the action required to continue the run. Will be `null` if no action is required.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **string** | For now, this is always &#x60;submit_tool_outputs&#x60;. | [default to undefined]
**submit_tool_outputs** | [**RunObjectRequiredActionSubmitToolOutputs**](RunObjectRequiredActionSubmitToolOutputs.md) |  | [default to undefined]

## Example

```typescript
import { RunObjectRequiredAction } from './api';

const instance: RunObjectRequiredAction = {
    type,
    submit_tool_outputs,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
