# OAIRunStepObject

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**_id** | **NSString*** | The identifier of the run step, which can be referenced in API endpoints. | 
**object** | **NSString*** | The object type, which is always &#x60;thread.run.step&#x60;. | 
**createdAt** | **NSNumber*** | The Unix timestamp (in seconds) for when the run step was created. | 
**assistantId** | **NSString*** | The ID of the [assistant](/docs/api-reference/assistants) associated with the run step. | 
**threadId** | **NSString*** | The ID of the [thread](/docs/api-reference/threads) that was run. | 
**runId** | **NSString*** | The ID of the [run](/docs/api-reference/runs) that this run step is a part of. | 
**type** | **NSString*** | The type of run step, which can be either &#x60;message_creation&#x60; or &#x60;tool_calls&#x60;. | 
**status** | **NSString*** | The status of the run step, which can be either &#x60;in_progress&#x60;, &#x60;cancelled&#x60;, &#x60;failed&#x60;, &#x60;completed&#x60;, or &#x60;expired&#x60;. | 
**stepDetails** | [**OAIRunStepObjectStepDetails***](OAIRunStepObjectStepDetails.md) |  | 
**lastError** | [**OAIRunStepObjectLastError***](OAIRunStepObjectLastError.md) |  | 
**expiredAt** | **NSNumber*** | The Unix timestamp (in seconds) for when the run step expired. A step is considered expired if the parent run is expired. | 
**cancelledAt** | **NSNumber*** | The Unix timestamp (in seconds) for when the run step was cancelled. | 
**failedAt** | **NSNumber*** | The Unix timestamp (in seconds) for when the run step failed. | 
**completedAt** | **NSNumber*** | The Unix timestamp (in seconds) for when the run step completed. | 
**metadata** | [**NSObject***](.md) | Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long.  | 
**usage** | [**OAIRunStepCompletionUsage***](OAIRunStepCompletionUsage.md) |  | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


