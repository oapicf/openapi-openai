# openapi::RunStepObject

Represents a step in execution of a run. 

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **character** | The identifier of the run step, which can be referenced in API endpoints. | 
**object** | **character** | The object type, which is always &#x60;thread.run.step&#x60;. | [Enum: [thread.run.step]] 
**created_at** | **integer** | The Unix timestamp (in seconds) for when the run step was created. | 
**assistant_id** | **character** | The ID of the [assistant](/docs/api-reference/assistants) associated with the run step. | 
**thread_id** | **character** | The ID of the [thread](/docs/api-reference/threads) that was run. | 
**run_id** | **character** | The ID of the [run](/docs/api-reference/runs) that this run step is a part of. | 
**type** | **character** | The type of run step, which can be either &#x60;message_creation&#x60; or &#x60;tool_calls&#x60;. | [Enum: [message_creation, tool_calls]] 
**status** | **character** | The status of the run step, which can be either &#x60;in_progress&#x60;, &#x60;cancelled&#x60;, &#x60;failed&#x60;, &#x60;completed&#x60;, or &#x60;expired&#x60;. | [Enum: [in_progress, cancelled, failed, completed, expired]] 
**step_details** | [**RunStepObjectStepDetails**](RunStepObject_step_details.md) |  | 
**last_error** | [**RunStepObjectLastError**](RunStepObject_last_error.md) |  | 
**expired_at** | **integer** | The Unix timestamp (in seconds) for when the run step expired. A step is considered expired if the parent run is expired. | 
**cancelled_at** | **integer** | The Unix timestamp (in seconds) for when the run step was cancelled. | 
**failed_at** | **integer** | The Unix timestamp (in seconds) for when the run step failed. | 
**completed_at** | **integer** | The Unix timestamp (in seconds) for when the run step completed. | 
**metadata** | **object** | Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.  | 
**usage** | [**RunStepCompletionUsage**](RunStepCompletionUsage.md) |  | 


