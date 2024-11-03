# Org.OpenAPITools.Model.RunStepObject
Represents a step in execution of a run. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **string** | The identifier of the run step, which can be referenced in API endpoints. | 
**Object** | **string** | The object type, which is always &#x60;thread.run.step&#x60;. | 
**CreatedAt** | **int** | The Unix timestamp (in seconds) for when the run step was created. | 
**AssistantId** | **string** | The ID of the [assistant](/docs/api-reference/assistants) associated with the run step. | 
**ThreadId** | **string** | The ID of the [thread](/docs/api-reference/threads) that was run. | 
**RunId** | **string** | The ID of the [run](/docs/api-reference/runs) that this run step is a part of. | 
**Type** | **string** | The type of run step, which can be either &#x60;message_creation&#x60; or &#x60;tool_calls&#x60;. | 
**Status** | **string** | The status of the run step, which can be either &#x60;in_progress&#x60;, &#x60;cancelled&#x60;, &#x60;failed&#x60;, &#x60;completed&#x60;, or &#x60;expired&#x60;. | 
**StepDetails** | [**RunStepObjectStepDetails**](RunStepObjectStepDetails.md) |  | 
**LastError** | [**RunStepObjectLastError**](RunStepObjectLastError.md) |  | 
**ExpiredAt** | **int?** | The Unix timestamp (in seconds) for when the run step expired. A step is considered expired if the parent run is expired. | 
**CancelledAt** | **int?** | The Unix timestamp (in seconds) for when the run step was cancelled. | 
**FailedAt** | **int?** | The Unix timestamp (in seconds) for when the run step failed. | 
**CompletedAt** | **int?** | The Unix timestamp (in seconds) for when the run step completed. | 
**Metadata** | **Object** | Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long.  | 
**Usage** | [**RunStepCompletionUsage**](RunStepCompletionUsage.md) |  | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

