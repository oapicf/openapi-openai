# run_object_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **char \*** | The identifier, which can be referenced in API endpoints. | 
**object** | **openai_api_run_object_OBJECT_e** | The object type, which is always &#x60;thread.run&#x60;. | 
**created_at** | **int** | The Unix timestamp (in seconds) for when the run was created. | 
**thread_id** | **char \*** | The ID of the [thread](/docs/api-reference/threads) that was executed on as a part of this run. | 
**assistant_id** | **char \*** | The ID of the [assistant](/docs/api-reference/assistants) used for execution of this run. | 
**status** | **openai_api_run_object_STATUS_e** | The status of the run, which can be either &#x60;queued&#x60;, &#x60;in_progress&#x60;, &#x60;requires_action&#x60;, &#x60;cancelling&#x60;, &#x60;cancelled&#x60;, &#x60;failed&#x60;, &#x60;completed&#x60;, &#x60;incomplete&#x60;, or &#x60;expired&#x60;. | 
**required_action** | [**run_object_required_action_t**](run_object_required_action.md) \* |  | 
**last_error** | [**run_object_last_error_t**](run_object_last_error.md) \* |  | 
**expires_at** | **int** | The Unix timestamp (in seconds) for when the run will expire. | 
**started_at** | **int** | The Unix timestamp (in seconds) for when the run was started. | 
**cancelled_at** | **int** | The Unix timestamp (in seconds) for when the run was cancelled. | 
**failed_at** | **int** | The Unix timestamp (in seconds) for when the run failed. | 
**completed_at** | **int** | The Unix timestamp (in seconds) for when the run was completed. | 
**incomplete_details** | [**run_object_incomplete_details_t**](run_object_incomplete_details.md) \* |  | 
**model** | **char \*** | The model that the [assistant](/docs/api-reference/assistants) used for this run. | 
**instructions** | **char \*** | The instructions that the [assistant](/docs/api-reference/assistants) used for this run. | 
**tools** | [**list_t**](assistant_object_tools_inner.md) \* | The list of tools that the [assistant](/docs/api-reference/assistants) used for this run. | 
**metadata** | [**object_t**](.md) \* | Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.  | 
**usage** | [**run_completion_usage_t**](run_completion_usage.md) \* |  | 
**temperature** | **double** | The sampling temperature used for this run. If not set, defaults to 1. | [optional] 
**top_p** | **double** | The nucleus sampling value used for this run. If not set, defaults to 1. | [optional] 
**max_prompt_tokens** | **int** | The maximum number of prompt tokens specified to have been used over the course of the run.  | 
**max_completion_tokens** | **int** | The maximum number of completion tokens specified to have been used over the course of the run.  | 
**truncation_strategy** | [**truncation_object_t**](truncation_object.md) \* |  | 
**tool_choice** | [**assistants_api_tool_choice_option_t**](assistants_api_tool_choice_option.md) \* |  | 
**parallel_tool_calls** | **int** | Whether to enable [parallel function calling](/docs/guides/function-calling#configuring-parallel-function-calling) during tool use. | [default to true]
**response_format** | [**assistants_api_response_format_option_t**](assistants_api_response_format_option.md) \* |  | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


