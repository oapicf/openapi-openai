# run_step_object_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **char \*** | The identifier of the run step, which can be referenced in API endpoints. | 
**object** | **openai_api_run_step_object_OBJECT_e** | The object type, which is always &#x60;thread.run.step&#x60;. | 
**created_at** | **int** | The Unix timestamp (in seconds) for when the run step was created. | 
**assistant_id** | **char \*** | The ID of the [assistant](/docs/api-reference/assistants) associated with the run step. | 
**thread_id** | **char \*** | The ID of the [thread](/docs/api-reference/threads) that was run. | 
**run_id** | **char \*** | The ID of the [run](/docs/api-reference/runs) that this run step is a part of. | 
**type** | **openai_api_run_step_object_TYPE_e** | The type of run step, which can be either &#x60;message_creation&#x60; or &#x60;tool_calls&#x60;. | 
**status** | **openai_api_run_step_object_STATUS_e** | The status of the run step, which can be either &#x60;in_progress&#x60;, &#x60;cancelled&#x60;, &#x60;failed&#x60;, &#x60;completed&#x60;, or &#x60;expired&#x60;. | 
**step_details** | [**run_step_object_step_details_t**](run_step_object_step_details.md) \* |  | 
**last_error** | [**run_step_object_last_error_t**](run_step_object_last_error.md) \* |  | 
**expired_at** | **int** | The Unix timestamp (in seconds) for when the run step expired. A step is considered expired if the parent run is expired. | 
**cancelled_at** | **int** | The Unix timestamp (in seconds) for when the run step was cancelled. | 
**failed_at** | **int** | The Unix timestamp (in seconds) for when the run step failed. | 
**completed_at** | **int** | The Unix timestamp (in seconds) for when the run step completed. | 
**metadata** | [**object_t**](.md) \* | Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long.  | 
**usage** | [**run_step_completion_usage_t**](run_step_completion_usage.md) \* |  | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


