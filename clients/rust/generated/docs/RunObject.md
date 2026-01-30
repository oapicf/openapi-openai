# RunObject

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The identifier, which can be referenced in API endpoints. | 
**object** | **String** | The object type, which is always `thread.run`. | 
**created_at** | **i32** | The Unix timestamp (in seconds) for when the run was created. | 
**thread_id** | **String** | The ID of the [thread](/docs/api-reference/threads) that was executed on as a part of this run. | 
**assistant_id** | **String** | The ID of the [assistant](/docs/api-reference/assistants) used for execution of this run. | 
**status** | **String** | The status of the run, which can be either `queued`, `in_progress`, `requires_action`, `cancelling`, `cancelled`, `failed`, `completed`, `incomplete`, or `expired`. | 
**required_action** | Option<[**models::RunObjectRequiredAction**](RunObject_required_action.md)> |  | 
**last_error** | Option<[**models::RunObjectLastError**](RunObject_last_error.md)> |  | 
**expires_at** | Option<**i32**> | The Unix timestamp (in seconds) for when the run will expire. | 
**started_at** | Option<**i32**> | The Unix timestamp (in seconds) for when the run was started. | 
**cancelled_at** | Option<**i32**> | The Unix timestamp (in seconds) for when the run was cancelled. | 
**failed_at** | Option<**i32**> | The Unix timestamp (in seconds) for when the run failed. | 
**completed_at** | Option<**i32**> | The Unix timestamp (in seconds) for when the run was completed. | 
**incomplete_details** | Option<[**models::RunObjectIncompleteDetails**](RunObject_incomplete_details.md)> |  | 
**model** | **String** | The model that the [assistant](/docs/api-reference/assistants) used for this run. | 
**instructions** | **String** | The instructions that the [assistant](/docs/api-reference/assistants) used for this run. | 
**tools** | [**Vec<models::AssistantObjectToolsInner>**](AssistantObject_tools_inner.md) | The list of tools that the [assistant](/docs/api-reference/assistants) used for this run. | [default to []]
**metadata** | Option<[**serde_json::Value**](.md)> | Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.  | 
**usage** | Option<[**models::RunCompletionUsage**](RunCompletionUsage.md)> |  | 
**temperature** | Option<**f64**> | The sampling temperature used for this run. If not set, defaults to 1. | [optional]
**top_p** | Option<**f64**> | The nucleus sampling value used for this run. If not set, defaults to 1. | [optional]
**max_prompt_tokens** | Option<**i32**> | The maximum number of prompt tokens specified to have been used over the course of the run.  | 
**max_completion_tokens** | Option<**i32**> | The maximum number of completion tokens specified to have been used over the course of the run.  | 
**truncation_strategy** | [**models::TruncationObject**](TruncationObject.md) |  | 
**tool_choice** | [**models::AssistantsApiToolChoiceOption**](AssistantsApiToolChoiceOption.md) |  | 
**parallel_tool_calls** | **bool** | Whether to enable [parallel function calling](/docs/guides/function-calling#configuring-parallel-function-calling) during tool use. | [default to true]
**response_format** | [**models::AssistantsApiResponseFormatOption**](AssistantsApiResponseFormatOption.md) |  | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


