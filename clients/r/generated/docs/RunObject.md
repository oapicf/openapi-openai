# openapi::RunObject

Represents an execution run on a [thread](/docs/api-reference/threads).

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **character** | The identifier, which can be referenced in API endpoints. | 
**object** | **character** | The object type, which is always &#x60;thread.run&#x60;. | [Enum: [thread.run]] 
**created_at** | **integer** | The Unix timestamp (in seconds) for when the run was created. | 
**thread_id** | **character** | The ID of the [thread](/docs/api-reference/threads) that was executed on as a part of this run. | 
**assistant_id** | **character** | The ID of the [assistant](/docs/api-reference/assistants) used for execution of this run. | 
**status** | **character** | The status of the run, which can be either &#x60;queued&#x60;, &#x60;in_progress&#x60;, &#x60;requires_action&#x60;, &#x60;cancelling&#x60;, &#x60;cancelled&#x60;, &#x60;failed&#x60;, &#x60;completed&#x60;, &#x60;incomplete&#x60;, or &#x60;expired&#x60;. | [Enum: [queued, in_progress, requires_action, cancelling, cancelled, failed, completed, incomplete, expired]] 
**required_action** | [**RunObjectRequiredAction**](RunObject_required_action.md) |  | 
**last_error** | [**RunObjectLastError**](RunObject_last_error.md) |  | 
**expires_at** | **integer** | The Unix timestamp (in seconds) for when the run will expire. | 
**started_at** | **integer** | The Unix timestamp (in seconds) for when the run was started. | 
**cancelled_at** | **integer** | The Unix timestamp (in seconds) for when the run was cancelled. | 
**failed_at** | **integer** | The Unix timestamp (in seconds) for when the run failed. | 
**completed_at** | **integer** | The Unix timestamp (in seconds) for when the run was completed. | 
**incomplete_details** | [**RunObjectIncompleteDetails**](RunObject_incomplete_details.md) |  | 
**model** | **character** | The model that the [assistant](/docs/api-reference/assistants) used for this run. | 
**instructions** | **character** | The instructions that the [assistant](/docs/api-reference/assistants) used for this run. | 
**tools** | [**array[AssistantObjectToolsInner]**](AssistantObject_tools_inner.md) | The list of tools that the [assistant](/docs/api-reference/assistants) used for this run. | [default to []] [Max. items: 20] 
**metadata** | **object** | Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.  | 
**usage** | [**RunCompletionUsage**](RunCompletionUsage.md) |  | 
**temperature** | **numeric** | The sampling temperature used for this run. If not set, defaults to 1. | [optional] 
**top_p** | **numeric** | The nucleus sampling value used for this run. If not set, defaults to 1. | [optional] 
**max_prompt_tokens** | **integer** | The maximum number of prompt tokens specified to have been used over the course of the run.  | [Min: 256] 
**max_completion_tokens** | **integer** | The maximum number of completion tokens specified to have been used over the course of the run.  | [Min: 256] 
**truncation_strategy** | [**TruncationObject**](TruncationObject.md) |  | 
**tool_choice** | [**AssistantsApiToolChoiceOption**](AssistantsApiToolChoiceOption.md) |  | 
**parallel_tool_calls** | **character** | Whether to enable [parallel function calling](/docs/guides/function-calling#configuring-parallel-function-calling) during tool use. | [default to TRUE] 
**response_format** | [**AssistantsApiResponseFormatOption**](AssistantsApiResponseFormatOption.md) |  | 


