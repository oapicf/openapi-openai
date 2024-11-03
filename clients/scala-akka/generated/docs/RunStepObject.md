

# RunStepObject

Represents a step in execution of a run. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The identifier of the run step, which can be referenced in API endpoints. | 
**`object`** | [**`Object`**](#`Object`) | The object type, which is always &#x60;thread.run.step&#x60;. | 
**createdAt** | **Int** | The Unix timestamp (in seconds) for when the run step was created. | 
**assistantId** | **String** | The ID of the [assistant](/docs/api-reference/assistants) associated with the run step. | 
**threadId** | **String** | The ID of the [thread](/docs/api-reference/threads) that was run. | 
**runId** | **String** | The ID of the [run](/docs/api-reference/runs) that this run step is a part of. | 
**`type`** | [**`Type`**](#`Type`) | The type of run step, which can be either &#x60;message_creation&#x60; or &#x60;tool_calls&#x60;. | 
**status** | [**Status**](#Status) | The status of the run step, which can be either &#x60;in_progress&#x60;, &#x60;cancelled&#x60;, &#x60;failed&#x60;, &#x60;completed&#x60;, or &#x60;expired&#x60;. | 
**stepDetails** | [**RunStepObjectStepDetails**](RunStepObjectStepDetails.md) |  | 
**lastError** | [**RunStepObjectLastError**](RunStepObjectLastError.md) |  | 
**expiredAt** | **Int** | The Unix timestamp (in seconds) for when the run step expired. A step is considered expired if the parent run is expired. | 
**cancelledAt** | **Int** | The Unix timestamp (in seconds) for when the run step was cancelled. | 
**failedAt** | **Int** | The Unix timestamp (in seconds) for when the run step failed. | 
**completedAt** | **Int** | The Unix timestamp (in seconds) for when the run step completed. | 
**metadata** | **Any** | Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long.  | 
**usage** | [**RunStepCompletionUsage**](RunStepCompletionUsage.md) |  | 


## Enum: `Object`
Allowed values: [thread.run.step]



## Enum: `Type`
Allowed values: [message_creation, tool_calls]



## Enum: Status
Allowed values: [in_progress, cancelled, failed, completed, expired]




