# RunStepObject

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **string** | The identifier of the run step, which can be referenced in API endpoints. | 
**object** | **string** | The object type, which is always &#x60;thread.run.step&#x60;. | 
**createdAt** | **int** | The Unix timestamp (in seconds) for when the run step was created. | 
**assistantId** | **string** | The ID of the [assistant](/docs/api-reference/assistants) associated with the run step. | 
**threadId** | **string** | The ID of the [thread](/docs/api-reference/threads) that was run. | 
**runId** | **string** | The ID of the [run](/docs/api-reference/runs) that this run step is a part of. | 
**type** | **string** | The type of run step, which can be either &#x60;message_creation&#x60; or &#x60;tool_calls&#x60;. | 
**status** | **string** | The status of the run step, which can be either &#x60;in_progress&#x60;, &#x60;cancelled&#x60;, &#x60;failed&#x60;, &#x60;completed&#x60;, or &#x60;expired&#x60;. | 
**stepDetails** | [**OpenAPI\Server\Model\RunStepObjectStepDetails**](RunStepObjectStepDetails.md) |  | 
**lastError** | [**OpenAPI\Server\Model\RunStepObjectLastError**](RunStepObjectLastError.md) |  | 
**expiredAt** | **int** | The Unix timestamp (in seconds) for when the run step expired. A step is considered expired if the parent run is expired. | 
**cancelledAt** | **int** | The Unix timestamp (in seconds) for when the run step was cancelled. | 
**failedAt** | **int** | The Unix timestamp (in seconds) for when the run step failed. | 
**completedAt** | **int** | The Unix timestamp (in seconds) for when the run step completed. | 
**metadata** | **array** | Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. | 
**usage** | [**OpenAPI\Server\Model\RunStepCompletionUsage**](RunStepCompletionUsage.md) |  | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


