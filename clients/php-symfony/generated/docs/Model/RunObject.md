# RunObject

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **string** | The identifier, which can be referenced in API endpoints. | 
**object** | **string** | The object type, which is always &#x60;thread.run&#x60;. | 
**createdAt** | **int** | The Unix timestamp (in seconds) for when the run was created. | 
**threadId** | **string** | The ID of the [thread](/docs/api-reference/threads) that was executed on as a part of this run. | 
**assistantId** | **string** | The ID of the [assistant](/docs/api-reference/assistants) used for execution of this run. | 
**status** | **string** | The status of the run, which can be either &#x60;queued&#x60;, &#x60;in_progress&#x60;, &#x60;requires_action&#x60;, &#x60;cancelling&#x60;, &#x60;cancelled&#x60;, &#x60;failed&#x60;, &#x60;completed&#x60;, or &#x60;expired&#x60;. | 
**requiredAction** | [**OpenAPI\Server\Model\RunObjectRequiredAction**](RunObjectRequiredAction.md) |  | 
**lastError** | [**OpenAPI\Server\Model\RunObjectLastError**](RunObjectLastError.md) |  | 
**expiresAt** | **int** | The Unix timestamp (in seconds) for when the run will expire. | 
**startedAt** | **int** | The Unix timestamp (in seconds) for when the run was started. | 
**cancelledAt** | **int** | The Unix timestamp (in seconds) for when the run was cancelled. | 
**failedAt** | **int** | The Unix timestamp (in seconds) for when the run failed. | 
**completedAt** | **int** | The Unix timestamp (in seconds) for when the run was completed. | 
**incompleteDetails** | [**OpenAPI\Server\Model\RunObjectIncompleteDetails**](RunObjectIncompleteDetails.md) |  | 
**model** | **string** | The model that the [assistant](/docs/api-reference/assistants) used for this run. | 
**instructions** | **string** | The instructions that the [assistant](/docs/api-reference/assistants) used for this run. | 
**tools** | [**OpenAPI\Server\Model\AssistantObjectToolsInner**](AssistantObjectToolsInner.md) | The list of tools that the [assistant](/docs/api-reference/assistants) used for this run. | 
**fileIds** | **string** | The list of [File](/docs/api-reference/files) IDs the [assistant](/docs/api-reference/assistants) used for this run. | 
**metadata** | **array** | Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. | 
**usage** | [**OpenAPI\Server\Model\RunCompletionUsage**](RunCompletionUsage.md) |  | 
**temperature** | **float** | The sampling temperature used for this run. If not set, defaults to 1. | [optional] 
**maxPromptTokens** | **int** | The maximum number of prompt tokens specified to have been used over the course of the run. | 
**maxCompletionTokens** | **int** | The maximum number of completion tokens specified to have been used over the course of the run. | 
**truncationStrategy** | [**OpenAPI\Server\Model\TruncationObject**](TruncationObject.md) |  | 
**toolChoice** | [**OpenAPI\Server\Model\AssistantsApiToolChoiceOption**](AssistantsApiToolChoiceOption.md) |  | 
**responseFormat** | [**OpenAPI\Server\Model\AssistantsApiResponseFormatOption**](AssistantsApiResponseFormatOption.md) |  | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


