# RunStepObject

Represents a step in execution of a run. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **string** | The identifier of the run step, which can be referenced in API endpoints. | [default to undefined]
**object** | **string** | The object type, which is always &#x60;thread.run.step&#x60;. | [default to undefined]
**created_at** | **number** | The Unix timestamp (in seconds) for when the run step was created. | [default to undefined]
**assistant_id** | **string** | The ID of the [assistant](/docs/api-reference/assistants) associated with the run step. | [default to undefined]
**thread_id** | **string** | The ID of the [thread](/docs/api-reference/threads) that was run. | [default to undefined]
**run_id** | **string** | The ID of the [run](/docs/api-reference/runs) that this run step is a part of. | [default to undefined]
**type** | **string** | The type of run step, which can be either &#x60;message_creation&#x60; or &#x60;tool_calls&#x60;. | [default to undefined]
**status** | **string** | The status of the run step, which can be either &#x60;in_progress&#x60;, &#x60;cancelled&#x60;, &#x60;failed&#x60;, &#x60;completed&#x60;, or &#x60;expired&#x60;. | [default to undefined]
**step_details** | [**RunStepObjectStepDetails**](RunStepObjectStepDetails.md) |  | [default to undefined]
**last_error** | [**RunStepObjectLastError**](RunStepObjectLastError.md) |  | [default to undefined]
**expired_at** | **number** | The Unix timestamp (in seconds) for when the run step expired. A step is considered expired if the parent run is expired. | [default to undefined]
**cancelled_at** | **number** | The Unix timestamp (in seconds) for when the run step was cancelled. | [default to undefined]
**failed_at** | **number** | The Unix timestamp (in seconds) for when the run step failed. | [default to undefined]
**completed_at** | **number** | The Unix timestamp (in seconds) for when the run step completed. | [default to undefined]
**metadata** | **object** | Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long.  | [default to undefined]
**usage** | [**RunStepCompletionUsage**](RunStepCompletionUsage.md) |  | [default to undefined]

## Example

```typescript
import { RunStepObject } from './api';

const instance: RunStepObject = {
    id,
    object,
    created_at,
    assistant_id,
    thread_id,
    run_id,
    type,
    status,
    step_details,
    last_error,
    expired_at,
    cancelled_at,
    failed_at,
    completed_at,
    metadata,
    usage,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
