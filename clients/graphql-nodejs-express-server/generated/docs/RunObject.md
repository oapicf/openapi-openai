# RunObject

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id_** | **String!** | The identifier, which can be referenced in API endpoints. | [default to null]
**object** | **String!** | The object type, which is always &#x60;thread.run&#x60;. | [default to null]
**createdAt** | **Int!** | The Unix timestamp (in seconds) for when the run was created. | [default to null]
**threadId** | **String!** | The ID of the [thread](/docs/api-reference/threads) that was executed on as a part of this run. | [default to null]
**assistantId** | **String!** | The ID of the [assistant](/docs/api-reference/assistants) used for execution of this run. | [default to null]
**status** | **String!** | The status of the run, which can be either &#x60;queued&#x60;, &#x60;in_progress&#x60;, &#x60;requires_action&#x60;, &#x60;cancelling&#x60;, &#x60;cancelled&#x60;, &#x60;failed&#x60;, &#x60;completed&#x60;, &#x60;incomplete&#x60;, or &#x60;expired&#x60;. | [default to null]
**requiredAction** | [***RunObjectRequiredAction**](RunObject_required_action.md) |  | [default to null]
**lastError** | [***RunObjectLastError**](RunObject_last_error.md) |  | [default to null]
**expiresAt** | **Int** | The Unix timestamp (in seconds) for when the run will expire. | [default to null]
**startedAt** | **Int** | The Unix timestamp (in seconds) for when the run was started. | [default to null]
**cancelledAt** | **Int** | The Unix timestamp (in seconds) for when the run was cancelled. | [default to null]
**failedAt** | **Int** | The Unix timestamp (in seconds) for when the run failed. | [default to null]
**completedAt** | **Int** | The Unix timestamp (in seconds) for when the run was completed. | [default to null]
**incompleteDetails** | [***RunObjectIncompleteDetails**](RunObject_incomplete_details.md) |  | [default to null]
**model** | **String!** | The model that the [assistant](/docs/api-reference/assistants) used for this run. | [default to null]
**instructions** | **String!** | The instructions that the [assistant](/docs/api-reference/assistants) used for this run. | [default to null]
**tools** | [**AssistantObjectToolsInner**](AssistantObject_tools_inner.md) | The list of tools that the [assistant](/docs/api-reference/assistants) used for this run. | [default to []]
**metadata** | [***TodoObjectMapping**](.md) | Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.  | [default to null]
**usage** | [***RunCompletionUsage**](RunCompletionUsage.md) |  | [default to null]
**temperature** | **Float** | The sampling temperature used for this run. If not set, defaults to 1. | [optional] [default to null]
**topP** | **Float** | The nucleus sampling value used for this run. If not set, defaults to 1. | [optional] [default to null]
**maxPromptTokens** | **Int** | The maximum number of prompt tokens specified to have been used over the course of the run.  | [default to null]
**maxCompletionTokens** | **Int** | The maximum number of completion tokens specified to have been used over the course of the run.  | [default to null]
**truncationStrategy** | [***TruncationObject**](TruncationObject.md) |  | [default to null]
**toolChoice** | [***AssistantsApiToolChoiceOption**](AssistantsApiToolChoiceOption.md) |  | [default to null]
**parallelToolCalls** | **Boolean!** | Whether to enable [parallel function calling](/docs/guides/function-calling#configuring-parallel-function-calling) during tool use. | [default to true]
**responseFormat** | [***AssistantsApiResponseFormatOption**](AssistantsApiResponseFormatOption.md) |  | [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


