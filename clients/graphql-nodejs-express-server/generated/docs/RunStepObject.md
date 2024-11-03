# RunStepObject

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id_** | **String!** | The identifier of the run step, which can be referenced in API endpoints. | [default to null]
**object** | **String!** | The object type, which is always &#x60;thread.run.step&#x60;. | [default to null]
**createdAt** | **Int!** | The Unix timestamp (in seconds) for when the run step was created. | [default to null]
**assistantId** | **String!** | The ID of the [assistant](/docs/api-reference/assistants) associated with the run step. | [default to null]
**threadId** | **String!** | The ID of the [thread](/docs/api-reference/threads) that was run. | [default to null]
**runId** | **String!** | The ID of the [run](/docs/api-reference/runs) that this run step is a part of. | [default to null]
**Type_** | **String!** | The type of run step, which can be either &#x60;message_creation&#x60; or &#x60;tool_calls&#x60;. | [default to null]
**status** | **String!** | The status of the run step, which can be either &#x60;in_progress&#x60;, &#x60;cancelled&#x60;, &#x60;failed&#x60;, &#x60;completed&#x60;, or &#x60;expired&#x60;. | [default to null]
**stepDetails** | [***RunStepObjectStepDetails**](RunStepObject_step_details.md) |  | [default to null]
**lastError** | [***RunStepObjectLastError**](RunStepObject_last_error.md) |  | [default to null]
**expiredAt** | **Int** | The Unix timestamp (in seconds) for when the run step expired. A step is considered expired if the parent run is expired. | [default to null]
**cancelledAt** | **Int** | The Unix timestamp (in seconds) for when the run step was cancelled. | [default to null]
**failedAt** | **Int** | The Unix timestamp (in seconds) for when the run step failed. | [default to null]
**completedAt** | **Int** | The Unix timestamp (in seconds) for when the run step completed. | [default to null]
**metadata** | [***TodoObjectMapping**](.md) | Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long.  | [default to null]
**usage** | [***RunStepCompletionUsage**](RunStepCompletionUsage.md) |  | [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


