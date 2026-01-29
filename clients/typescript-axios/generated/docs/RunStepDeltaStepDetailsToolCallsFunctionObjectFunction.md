# RunStepDeltaStepDetailsToolCallsFunctionObjectFunction

The definition of the function that was called.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **string** | The name of the function. | [optional] [default to undefined]
**arguments** | **string** | The arguments passed to the function. | [optional] [default to undefined]
**output** | **string** | The output of the function. This will be &#x60;null&#x60; if the outputs have not been [submitted](/docs/api-reference/runs/submitToolOutputs) yet. | [optional] [default to undefined]

## Example

```typescript
import { RunStepDeltaStepDetailsToolCallsFunctionObjectFunction } from './api';

const instance: RunStepDeltaStepDetailsToolCallsFunctionObjectFunction = {
    name,
    arguments,
    output,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
