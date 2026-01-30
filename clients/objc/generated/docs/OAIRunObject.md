# OAIRunObject

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**_id** | **NSString*** | The identifier, which can be referenced in API endpoints. | 
**object** | **NSString*** | The object type, which is always &#x60;thread.run&#x60;. | 
**createdAt** | **NSNumber*** | The Unix timestamp (in seconds) for when the run was created. | 
**threadId** | **NSString*** | The ID of the [thread](/docs/api-reference/threads) that was executed on as a part of this run. | 
**assistantId** | **NSString*** | The ID of the [assistant](/docs/api-reference/assistants) used for execution of this run. | 
**status** | **NSString*** | The status of the run, which can be either &#x60;queued&#x60;, &#x60;in_progress&#x60;, &#x60;requires_action&#x60;, &#x60;cancelling&#x60;, &#x60;cancelled&#x60;, &#x60;failed&#x60;, &#x60;completed&#x60;, &#x60;incomplete&#x60;, or &#x60;expired&#x60;. | 
**requiredAction** | [**OAIRunObjectRequiredAction***](OAIRunObjectRequiredAction.md) |  | 
**lastError** | [**OAIRunObjectLastError***](OAIRunObjectLastError.md) |  | 
**expiresAt** | **NSNumber*** | The Unix timestamp (in seconds) for when the run will expire. | 
**startedAt** | **NSNumber*** | The Unix timestamp (in seconds) for when the run was started. | 
**cancelledAt** | **NSNumber*** | The Unix timestamp (in seconds) for when the run was cancelled. | 
**failedAt** | **NSNumber*** | The Unix timestamp (in seconds) for when the run failed. | 
**completedAt** | **NSNumber*** | The Unix timestamp (in seconds) for when the run was completed. | 
**incompleteDetails** | [**OAIRunObjectIncompleteDetails***](OAIRunObjectIncompleteDetails.md) |  | 
**model** | **NSString*** | The model that the [assistant](/docs/api-reference/assistants) used for this run. | 
**instructions** | **NSString*** | The instructions that the [assistant](/docs/api-reference/assistants) used for this run. | 
**tools** | [**NSArray&lt;OAIAssistantObjectToolsInner&gt;***](OAIAssistantObjectToolsInner.md) | The list of tools that the [assistant](/docs/api-reference/assistants) used for this run. | 
**metadata** | [**NSObject***](.md) | Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.  | 
**usage** | [**OAIRunCompletionUsage***](OAIRunCompletionUsage.md) |  | 
**temperature** | **NSNumber*** | The sampling temperature used for this run. If not set, defaults to 1. | [optional] 
**topP** | **NSNumber*** | The nucleus sampling value used for this run. If not set, defaults to 1. | [optional] 
**maxPromptTokens** | **NSNumber*** | The maximum number of prompt tokens specified to have been used over the course of the run.  | 
**maxCompletionTokens** | **NSNumber*** | The maximum number of completion tokens specified to have been used over the course of the run.  | 
**truncationStrategy** | [**OAITruncationObject***](OAITruncationObject.md) |  | 
**toolChoice** | [**OAIAssistantsApiToolChoiceOption***](OAIAssistantsApiToolChoiceOption.md) |  | 
**parallelToolCalls** | **NSNumber*** | Whether to enable [parallel function calling](/docs/guides/function-calling#configuring-parallel-function-calling) during tool use. | [default to @(YES)]
**responseFormat** | [**OAIAssistantsApiResponseFormatOption***](OAIAssistantsApiResponseFormatOption.md) |  | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


