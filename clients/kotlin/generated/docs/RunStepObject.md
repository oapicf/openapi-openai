
# RunStepObject

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **kotlin.String** | The identifier of the run step, which can be referenced in API endpoints. |  |
| **&#x60;object&#x60;** | [**inline**](#&#x60;Object&#x60;) | The object type, which is always &#x60;thread.run.step&#x60;. |  |
| **createdAt** | **kotlin.Int** | The Unix timestamp (in seconds) for when the run step was created. |  |
| **assistantId** | **kotlin.String** | The ID of the [assistant](/docs/api-reference/assistants) associated with the run step. |  |
| **threadId** | **kotlin.String** | The ID of the [thread](/docs/api-reference/threads) that was run. |  |
| **runId** | **kotlin.String** | The ID of the [run](/docs/api-reference/runs) that this run step is a part of. |  |
| **type** | [**inline**](#Type) | The type of run step, which can be either &#x60;message_creation&#x60; or &#x60;tool_calls&#x60;. |  |
| **status** | [**inline**](#Status) | The status of the run step, which can be either &#x60;in_progress&#x60;, &#x60;cancelled&#x60;, &#x60;failed&#x60;, &#x60;completed&#x60;, or &#x60;expired&#x60;. |  |
| **stepDetails** | [**RunStepObjectStepDetails**](RunStepObjectStepDetails.md) |  |  |
| **lastError** | [**RunStepObjectLastError**](RunStepObjectLastError.md) |  |  |
| **expiredAt** | **kotlin.Int** | The Unix timestamp (in seconds) for when the run step expired. A step is considered expired if the parent run is expired. |  |
| **cancelledAt** | **kotlin.Int** | The Unix timestamp (in seconds) for when the run step was cancelled. |  |
| **failedAt** | **kotlin.Int** | The Unix timestamp (in seconds) for when the run step failed. |  |
| **completedAt** | **kotlin.Int** | The Unix timestamp (in seconds) for when the run step completed. |  |
| **metadata** | [**kotlin.Any**](.md) | Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.  |  |
| **usage** | [**RunStepCompletionUsage**](RunStepCompletionUsage.md) |  |  |


<a id="`Object`"></a>
## Enum: object
| Name | Value |
| ---- | ----- |
| &#x60;object&#x60; | thread.run.step |


<a id="Type"></a>
## Enum: type
| Name | Value |
| ---- | ----- |
| type | message_creation, tool_calls |


<a id="Status"></a>
## Enum: status
| Name | Value |
| ---- | ----- |
| status | in_progress, cancelled, failed, completed, expired |



