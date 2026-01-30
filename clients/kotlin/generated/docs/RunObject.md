
# RunObject

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **kotlin.String** | The identifier, which can be referenced in API endpoints. |  |
| **&#x60;object&#x60;** | [**inline**](#&#x60;Object&#x60;) | The object type, which is always &#x60;thread.run&#x60;. |  |
| **createdAt** | **kotlin.Int** | The Unix timestamp (in seconds) for when the run was created. |  |
| **threadId** | **kotlin.String** | The ID of the [thread](/docs/api-reference/threads) that was executed on as a part of this run. |  |
| **assistantId** | **kotlin.String** | The ID of the [assistant](/docs/api-reference/assistants) used for execution of this run. |  |
| **status** | [**inline**](#Status) | The status of the run, which can be either &#x60;queued&#x60;, &#x60;in_progress&#x60;, &#x60;requires_action&#x60;, &#x60;cancelling&#x60;, &#x60;cancelled&#x60;, &#x60;failed&#x60;, &#x60;completed&#x60;, &#x60;incomplete&#x60;, or &#x60;expired&#x60;. |  |
| **requiredAction** | [**RunObjectRequiredAction**](RunObjectRequiredAction.md) |  |  |
| **lastError** | [**RunObjectLastError**](RunObjectLastError.md) |  |  |
| **expiresAt** | **kotlin.Int** | The Unix timestamp (in seconds) for when the run will expire. |  |
| **startedAt** | **kotlin.Int** | The Unix timestamp (in seconds) for when the run was started. |  |
| **cancelledAt** | **kotlin.Int** | The Unix timestamp (in seconds) for when the run was cancelled. |  |
| **failedAt** | **kotlin.Int** | The Unix timestamp (in seconds) for when the run failed. |  |
| **completedAt** | **kotlin.Int** | The Unix timestamp (in seconds) for when the run was completed. |  |
| **incompleteDetails** | [**RunObjectIncompleteDetails**](RunObjectIncompleteDetails.md) |  |  |
| **model** | **kotlin.String** | The model that the [assistant](/docs/api-reference/assistants) used for this run. |  |
| **instructions** | **kotlin.String** | The instructions that the [assistant](/docs/api-reference/assistants) used for this run. |  |
| **tools** | [**kotlin.collections.List&lt;AssistantObjectToolsInner&gt;**](AssistantObjectToolsInner.md) | The list of tools that the [assistant](/docs/api-reference/assistants) used for this run. |  |
| **metadata** | [**kotlin.Any**](.md) | Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.  |  |
| **usage** | [**RunCompletionUsage**](RunCompletionUsage.md) |  |  |
| **maxPromptTokens** | **kotlin.Int** | The maximum number of prompt tokens specified to have been used over the course of the run.  |  |
| **maxCompletionTokens** | **kotlin.Int** | The maximum number of completion tokens specified to have been used over the course of the run.  |  |
| **truncationStrategy** | [**TruncationObject**](TruncationObject.md) |  |  |
| **toolChoice** | [**AssistantsApiToolChoiceOption**](AssistantsApiToolChoiceOption.md) |  |  |
| **parallelToolCalls** | **kotlin.Boolean** | Whether to enable [parallel function calling](/docs/guides/function-calling#configuring-parallel-function-calling) during tool use. |  |
| **responseFormat** | [**AssistantsApiResponseFormatOption**](AssistantsApiResponseFormatOption.md) |  |  |
| **temperature** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | The sampling temperature used for this run. If not set, defaults to 1. |  [optional] |
| **topP** | [**java.math.BigDecimal**](java.math.BigDecimal.md) | The nucleus sampling value used for this run. If not set, defaults to 1. |  [optional] |


<a id="`Object`"></a>
## Enum: object
| Name | Value |
| ---- | ----- |
| &#x60;object&#x60; | thread.run |


<a id="Status"></a>
## Enum: status
| Name | Value |
| ---- | ----- |
| status | queued, in_progress, requires_action, cancelling, cancelled, failed, completed, incomplete, expired |



