# RunStepObject


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**`id`** | **`String`** | The identifier of the run step, which can be referenced in API endpoints. | [default to nothing]
**`object`** | **`String`** | The object type, which is always &#x60;thread.run.step&#x60;. | [default to nothing]
**`created_at`** | **`Int64`** | The Unix timestamp (in seconds) for when the run step was created. | [default to nothing]
**`assistant_id`** | **`String`** | The ID of the [assistant](/docs/api-reference/assistants) associated with the run step. | [default to nothing]
**`thread_id`** | **`String`** | The ID of the [thread](/docs/api-reference/threads) that was run. | [default to nothing]
**`run_id`** | **`String`** | The ID of the [run](/docs/api-reference/runs) that this run step is a part of. | [default to nothing]
**`type`** | **`String`** | The type of run step, which can be either &#x60;message_creation&#x60; or &#x60;tool_calls&#x60;. | [default to nothing]
**`status`** | **`String`** | The status of the run step, which can be either &#x60;in_progress&#x60;, &#x60;cancelled&#x60;, &#x60;failed&#x60;, &#x60;completed&#x60;, or &#x60;expired&#x60;. | [default to nothing]
**`step_details`** | [**`*RunStepObjectStepDetails`**](RunStepObjectStepDetails.md) |  | [default to nothing]
**`last_error`** | [**`*RunStepObjectLastError`**](RunStepObjectLastError.md) |  | [default to nothing]
**`expired_at`** | **`Int64`** | The Unix timestamp (in seconds) for when the run step expired. A step is considered expired if the parent run is expired. | [default to nothing]
**`cancelled_at`** | **`Int64`** | The Unix timestamp (in seconds) for when the run step was cancelled. | [default to nothing]
**`failed_at`** | **`Int64`** | The Unix timestamp (in seconds) for when the run step failed. | [default to nothing]
**`completed_at`** | **`Int64`** | The Unix timestamp (in seconds) for when the run step completed. | [default to nothing]
**`metadata`** | **`Any`** | Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.  | [default to nothing]
**`usage`** | [**`*RunStepCompletionUsage`**](RunStepCompletionUsage.md) |  | [default to nothing]


[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


