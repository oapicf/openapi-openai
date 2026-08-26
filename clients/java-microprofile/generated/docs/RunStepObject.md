

# RunStepObject

Represents a step in execution of a run. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The identifier of the run step, which can be referenced in API endpoints. |  |
|**_object** | [**ObjectEnum**](#ObjectEnum) | The object type, which is always &#x60;thread.run.step&#x60;. |  |
|**createdAt** | **Integer** | The Unix timestamp (in seconds) for when the run step was created. |  |
|**assistantId** | **String** | The ID of the [assistant](/docs/api-reference/assistants) associated with the run step. |  |
|**threadId** | **String** | The ID of the [thread](/docs/api-reference/threads) that was run. |  |
|**runId** | **String** | The ID of the [run](/docs/api-reference/runs) that this run step is a part of. |  |
|**type** | [**TypeEnum**](#TypeEnum) | The type of run step, which can be either &#x60;message_creation&#x60; or &#x60;tool_calls&#x60;. |  |
|**status** | [**StatusEnum**](#StatusEnum) | The status of the run step, which can be either &#x60;in_progress&#x60;, &#x60;cancelled&#x60;, &#x60;failed&#x60;, &#x60;completed&#x60;, or &#x60;expired&#x60;. |  |
|**stepDetails** | [**RunStepObjectStepDetails**](RunStepObjectStepDetails.md) |  |  |
|**lastError** | [**RunStepObjectLastError**](RunStepObjectLastError.md) |  |  |
|**expiredAt** | **Integer** | The Unix timestamp (in seconds) for when the run step expired. A step is considered expired if the parent run is expired. |  |
|**cancelledAt** | **Integer** | The Unix timestamp (in seconds) for when the run step was cancelled. |  |
|**failedAt** | **Integer** | The Unix timestamp (in seconds) for when the run step failed. |  |
|**completedAt** | **Integer** | The Unix timestamp (in seconds) for when the run step completed. |  |
|**metadata** | **Object** | Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.  |  |
|**usage** | [**RunStepCompletionUsage**](RunStepCompletionUsage.md) |  |  |



## Enum: ObjectEnum

| Name | Value |
|---- | -----|
| THREAD_RUN_STEP | &quot;thread.run.step&quot; |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| MESSAGE_CREATION | &quot;message_creation&quot; |
| TOOL_CALLS | &quot;tool_calls&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| IN_PROGRESS | &quot;in_progress&quot; |
| CANCELLED | &quot;cancelled&quot; |
| FAILED | &quot;failed&quot; |
| COMPLETED | &quot;completed&quot; |
| EXPIRED | &quot;expired&quot; |



