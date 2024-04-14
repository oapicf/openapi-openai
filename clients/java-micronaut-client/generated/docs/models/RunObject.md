

# RunObject

Represents an execution run on a [thread](/docs/api-reference/threads).

The class is defined in **[RunObject.java](../../src/main/java/org/openapitools/model/RunObject.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | `String` | The identifier, which can be referenced in API endpoints. | 
**_object** | [**ObjectEnum**](#ObjectEnum) | The object type, which is always &#x60;thread.run&#x60;. | 
**createdAt** | `Integer` | The Unix timestamp (in seconds) for when the run was created. | 
**threadId** | `String` | The ID of the [thread](/docs/api-reference/threads) that was executed on as a part of this run. | 
**assistantId** | `String` | The ID of the [assistant](/docs/api-reference/assistants) used for execution of this run. | 
**status** | [**StatusEnum**](#StatusEnum) | The status of the run, which can be either &#x60;queued&#x60;, &#x60;in_progress&#x60;, &#x60;requires_action&#x60;, &#x60;cancelling&#x60;, &#x60;cancelled&#x60;, &#x60;failed&#x60;, &#x60;completed&#x60;, or &#x60;expired&#x60;. | 
**requiredAction** | [`RunObjectRequiredAction`](RunObjectRequiredAction.md) |  | 
**lastError** | [`RunObjectLastError`](RunObjectLastError.md) |  | 
**expiresAt** | `Integer` | The Unix timestamp (in seconds) for when the run will expire. | 
**startedAt** | `Integer` | The Unix timestamp (in seconds) for when the run was started. | 
**cancelledAt** | `Integer` | The Unix timestamp (in seconds) for when the run was cancelled. | 
**failedAt** | `Integer` | The Unix timestamp (in seconds) for when the run failed. | 
**completedAt** | `Integer` | The Unix timestamp (in seconds) for when the run was completed. | 
**incompleteDetails** | [`RunObjectIncompleteDetails`](RunObjectIncompleteDetails.md) |  | 
**model** | `String` | The model that the [assistant](/docs/api-reference/assistants) used for this run. | 
**instructions** | `String` | The instructions that the [assistant](/docs/api-reference/assistants) used for this run. | 
**tools** | [`List&lt;AssistantObjectToolsInner&gt;`](AssistantObjectToolsInner.md) | The list of tools that the [assistant](/docs/api-reference/assistants) used for this run. | 
**fileIds** | `List&lt;String&gt;` | The list of [File](/docs/api-reference/files) IDs the [assistant](/docs/api-reference/assistants) used for this run. | 
**metadata** | `Object` | Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long.  | 
**usage** | [`RunCompletionUsage`](RunCompletionUsage.md) |  | 
**temperature** | `BigDecimal` | The sampling temperature used for this run. If not set, defaults to 1. |  [optional property]
**maxPromptTokens** | `Integer` | The maximum number of prompt tokens specified to have been used over the course of the run.  | 
**maxCompletionTokens** | `Integer` | The maximum number of completion tokens specified to have been used over the course of the run.  | 
**truncationStrategy** | [`TruncationObject`](TruncationObject.md) |  | 
**toolChoice** | [`AssistantsApiToolChoiceOption`](AssistantsApiToolChoiceOption.md) |  | 
**responseFormat** | [`AssistantsApiResponseFormatOption`](AssistantsApiResponseFormatOption.md) |  | 


## ObjectEnum

Name | Value
---- | -----
THREAD_RUN | `"thread.run"`




## StatusEnum

Name | Value
---- | -----
QUEUED | `"queued"`
IN_PROGRESS | `"in_progress"`
REQUIRES_ACTION | `"requires_action"`
CANCELLING | `"cancelling"`
CANCELLED | `"cancelled"`
FAILED | `"failed"`
COMPLETED | `"completed"`
EXPIRED | `"expired"`






















