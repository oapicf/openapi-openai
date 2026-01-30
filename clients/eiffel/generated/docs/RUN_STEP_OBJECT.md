# RUN_STEP_OBJECT

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**STRING_32**](STRING_32.md) | The identifier of the run step, which can be referenced in API endpoints. | [default to null]
**object** | [**STRING_32**](STRING_32.md) | The object type, which is always &#x60;thread.run.step&#x60;. | [default to null]
**created_at** | **INTEGER_32** | The Unix timestamp (in seconds) for when the run step was created. | [default to null]
**assistant_id** | [**STRING_32**](STRING_32.md) | The ID of the [assistant](/docs/api-reference/assistants) associated with the run step. | [default to null]
**thread_id** | [**STRING_32**](STRING_32.md) | The ID of the [thread](/docs/api-reference/threads) that was run. | [default to null]
**run_id** | [**STRING_32**](STRING_32.md) | The ID of the [run](/docs/api-reference/runs) that this run step is a part of. | [default to null]
**type** | [**STRING_32**](STRING_32.md) | The type of run step, which can be either &#x60;message_creation&#x60; or &#x60;tool_calls&#x60;. | [default to null]
**status** | [**STRING_32**](STRING_32.md) | The status of the run step, which can be either &#x60;in_progress&#x60;, &#x60;cancelled&#x60;, &#x60;failed&#x60;, &#x60;completed&#x60;, or &#x60;expired&#x60;. | [default to null]
**step_details** | [**RUN_STEP_OBJECT_STEP_DETAILS**](RunStepObject_step_details.md) |  | [default to null]
**last_error** | [**RUN_STEP_OBJECT_LAST_ERROR**](RunStepObject_last_error.md) |  | [default to null]
**expired_at** | **INTEGER_32** | The Unix timestamp (in seconds) for when the run step expired. A step is considered expired if the parent run is expired. | [default to null]
**cancelled_at** | **INTEGER_32** | The Unix timestamp (in seconds) for when the run step was cancelled. | [default to null]
**failed_at** | **INTEGER_32** | The Unix timestamp (in seconds) for when the run step failed. | [default to null]
**completed_at** | **INTEGER_32** | The Unix timestamp (in seconds) for when the run step completed. | [default to null]
**metadata** | [**ANY**](.md) | Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.  | [default to null]
**usage** | [**RUN_STEP_COMPLETION_USAGE**](RunStepCompletionUsage.md) |  | [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


