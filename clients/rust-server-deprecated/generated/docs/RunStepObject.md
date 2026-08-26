# RunStepObject

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The identifier of the run step, which can be referenced in API endpoints. | 
**object** | [***models::RunStepObjectObject**](RunStepObject_object.md) |  | 
**created_at** | **i32** | The Unix timestamp (in seconds) for when the run step was created. | 
**assistant_id** | **String** | The ID of the [assistant](/docs/api-reference/assistants) associated with the run step. | 
**thread_id** | **String** | The ID of the [thread](/docs/api-reference/threads) that was run. | 
**run_id** | **String** | The ID of the [run](/docs/api-reference/runs) that this run step is a part of. | 
**r#type** | [***models::RunStepObjectType**](RunStepObject_type.md) |  | 
**status** | [***models::RunStepObjectStatus**](RunStepObject_status.md) |  | 
**step_details** | [***models::RunStepObjectStepDetails**](RunStepObject_step_details.md) |  | 
**last_error** | [***swagger::Nullable<models::RunStepObjectLastError>**](RunStepObject_last_error.md) |  | 
**expired_at** | **i32** | The Unix timestamp (in seconds) for when the run step expired. A step is considered expired if the parent run is expired. | 
**cancelled_at** | **i32** | The Unix timestamp (in seconds) for when the run step was cancelled. | 
**failed_at** | **i32** | The Unix timestamp (in seconds) for when the run step failed. | 
**completed_at** | **i32** | The Unix timestamp (in seconds) for when the run step completed. | 
**metadata** | [***serde_json::Value**](.md) | Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.  | 
**usage** | [***swagger::Nullable<models::RunStepCompletionUsage>**](RunStepCompletionUsage.md) |  | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


