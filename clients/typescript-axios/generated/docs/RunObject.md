# RunObject

Represents an execution run on a [thread](/docs/api-reference/threads).

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **string** | The identifier, which can be referenced in API endpoints. | [default to undefined]
**object** | **string** | The object type, which is always &#x60;thread.run&#x60;. | [default to undefined]
**created_at** | **number** | The Unix timestamp (in seconds) for when the run was created. | [default to undefined]
**thread_id** | **string** | The ID of the [thread](/docs/api-reference/threads) that was executed on as a part of this run. | [default to undefined]
**assistant_id** | **string** | The ID of the [assistant](/docs/api-reference/assistants) used for execution of this run. | [default to undefined]
**status** | **string** | The status of the run, which can be either &#x60;queued&#x60;, &#x60;in_progress&#x60;, &#x60;requires_action&#x60;, &#x60;cancelling&#x60;, &#x60;cancelled&#x60;, &#x60;failed&#x60;, &#x60;completed&#x60;, &#x60;incomplete&#x60;, or &#x60;expired&#x60;. | [default to undefined]
**required_action** | [**RunObjectRequiredAction**](RunObjectRequiredAction.md) |  | [default to undefined]
**last_error** | [**RunObjectLastError**](RunObjectLastError.md) |  | [default to undefined]
**expires_at** | **number** | The Unix timestamp (in seconds) for when the run will expire. | [default to undefined]
**started_at** | **number** | The Unix timestamp (in seconds) for when the run was started. | [default to undefined]
**cancelled_at** | **number** | The Unix timestamp (in seconds) for when the run was cancelled. | [default to undefined]
**failed_at** | **number** | The Unix timestamp (in seconds) for when the run failed. | [default to undefined]
**completed_at** | **number** | The Unix timestamp (in seconds) for when the run was completed. | [default to undefined]
**incomplete_details** | [**RunObjectIncompleteDetails**](RunObjectIncompleteDetails.md) |  | [default to undefined]
**model** | **string** | The model that the [assistant](/docs/api-reference/assistants) used for this run. | [default to undefined]
**instructions** | **string** | The instructions that the [assistant](/docs/api-reference/assistants) used for this run. | [default to undefined]
**tools** | [**Array&lt;AssistantObjectToolsInner&gt;**](AssistantObjectToolsInner.md) | The list of tools that the [assistant](/docs/api-reference/assistants) used for this run. | [default to undefined]
**metadata** | **object** | Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.  | [default to undefined]
**usage** | [**RunCompletionUsage**](RunCompletionUsage.md) |  | [default to undefined]
**temperature** | **number** | The sampling temperature used for this run. If not set, defaults to 1. | [optional] [default to undefined]
**top_p** | **number** | The nucleus sampling value used for this run. If not set, defaults to 1. | [optional] [default to undefined]
**max_prompt_tokens** | **number** | The maximum number of prompt tokens specified to have been used over the course of the run.  | [default to undefined]
**max_completion_tokens** | **number** | The maximum number of completion tokens specified to have been used over the course of the run.  | [default to undefined]
**truncation_strategy** | [**TruncationObject**](TruncationObject.md) |  | [default to undefined]
**tool_choice** | [**AssistantsApiToolChoiceOption**](AssistantsApiToolChoiceOption.md) |  | [default to undefined]
**parallel_tool_calls** | **boolean** | Whether to enable [parallel function calling](/docs/guides/function-calling#configuring-parallel-function-calling) during tool use. | [default to true]
**response_format** | [**AssistantsApiResponseFormatOption**](AssistantsApiResponseFormatOption.md) |  | [default to undefined]

## Example

```typescript
import { RunObject } from './api';

const instance: RunObject = {
    id,
    object,
    created_at,
    thread_id,
    assistant_id,
    status,
    required_action,
    last_error,
    expires_at,
    started_at,
    cancelled_at,
    failed_at,
    completed_at,
    incomplete_details,
    model,
    instructions,
    tools,
    metadata,
    usage,
    temperature,
    top_p,
    max_prompt_tokens,
    max_completion_tokens,
    truncation_strategy,
    tool_choice,
    parallel_tool_calls,
    response_format,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
