# RUN_OBJECT

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**STRING_32**](STRING_32.md) | The identifier, which can be referenced in API endpoints. | [default to null]
**object** | [**STRING_32**](STRING_32.md) | The object type, which is always &#x60;thread.run&#x60;. | [default to null]
**created_at** | **INTEGER_32** | The Unix timestamp (in seconds) for when the run was created. | [default to null]
**thread_id** | [**STRING_32**](STRING_32.md) | The ID of the [thread](/docs/api-reference/threads) that was executed on as a part of this run. | [default to null]
**assistant_id** | [**STRING_32**](STRING_32.md) | The ID of the [assistant](/docs/api-reference/assistants) used for execution of this run. | [default to null]
**status** | [**STRING_32**](STRING_32.md) | The status of the run, which can be either &#x60;queued&#x60;, &#x60;in_progress&#x60;, &#x60;requires_action&#x60;, &#x60;cancelling&#x60;, &#x60;cancelled&#x60;, &#x60;failed&#x60;, &#x60;completed&#x60;, or &#x60;expired&#x60;. | [default to null]
**required_action** | [**RUN_OBJECT_REQUIRED_ACTION**](RunObject_required_action.md) |  | [default to null]
**last_error** | [**RUN_OBJECT_LAST_ERROR**](RunObject_last_error.md) |  | [default to null]
**expires_at** | **INTEGER_32** | The Unix timestamp (in seconds) for when the run will expire. | [default to null]
**started_at** | **INTEGER_32** | The Unix timestamp (in seconds) for when the run was started. | [default to null]
**cancelled_at** | **INTEGER_32** | The Unix timestamp (in seconds) for when the run was cancelled. | [default to null]
**failed_at** | **INTEGER_32** | The Unix timestamp (in seconds) for when the run failed. | [default to null]
**completed_at** | **INTEGER_32** | The Unix timestamp (in seconds) for when the run was completed. | [default to null]
**incomplete_details** | [**RUN_OBJECT_INCOMPLETE_DETAILS**](RunObject_incomplete_details.md) |  | [default to null]
**model** | [**STRING_32**](STRING_32.md) | The model that the [assistant](/docs/api-reference/assistants) used for this run. | [default to null]
**instructions** | [**STRING_32**](STRING_32.md) | The instructions that the [assistant](/docs/api-reference/assistants) used for this run. | [default to null]
**tools** | [**LIST [ASSISTANT_OBJECT_TOOLS_INNER]**](AssistantObject_tools_inner.md) | The list of tools that the [assistant](/docs/api-reference/assistants) used for this run. | [default to []]
**file_ids** | [**LIST [STRING_32]**](STRING_32.md) | The list of [File](/docs/api-reference/files) IDs the [assistant](/docs/api-reference/assistants) used for this run. | [default to []]
**metadata** | [**ANY**](.md) | Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long.  | [default to null]
**usage** | [**RUN_COMPLETION_USAGE**](RunCompletionUsage.md) |  | [default to null]
**temperature** | **REAL_32** | The sampling temperature used for this run. If not set, defaults to 1. | [optional] [default to null]
**max_prompt_tokens** | **INTEGER_32** | The maximum number of prompt tokens specified to have been used over the course of the run.  | [default to null]
**max_completion_tokens** | **INTEGER_32** | The maximum number of completion tokens specified to have been used over the course of the run.  | [default to null]
**truncation_strategy** | [**TRUNCATION_OBJECT**](TruncationObject.md) |  | [default to null]
**tool_choice** | [**ASSISTANTS_API_TOOL_CHOICE_OPTION**](AssistantsApiToolChoiceOption.md) |  | [default to null]
**response_format** | [**ASSISTANTS_API_RESPONSE_FORMAT_OPTION**](AssistantsApiResponseFormatOption.md) |  | [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


