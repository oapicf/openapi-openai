# create_thread_and_run_request_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**assistant_id** | **char \*** | The ID of the [assistant](/docs/api-reference/assistants) to use to execute this run. | 
**thread** | [**create_thread_request_t**](create_thread_request.md) \* |  | [optional] 
**model** | [**create_run_request_model_t**](create_run_request_model.md) \* |  | [optional] 
**instructions** | **char \*** | Override the default system message of the assistant. This is useful for modifying the behavior on a per-run basis. | [optional] 
**tools** | [**list_t**](create_thread_and_run_request_tools_inner.md) \* | Override the tools the assistant can use for this run. This is useful for modifying the behavior on a per-run basis. | [optional] 
**metadata** | [**object_t**](.md) \* | Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long.  | [optional] 
**temperature** | **double** | What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic.  | [optional] [default to 1]
**stream** | **int** | If &#x60;true&#x60;, returns a stream of events that happen during the Run as server-sent events, terminating when the Run enters a terminal state with a &#x60;data: [DONE]&#x60; message.  | [optional] 
**max_prompt_tokens** | **int** | The maximum number of prompt tokens that may be used over the course of the run. The run will make a best effort to use only the number of prompt tokens specified, across multiple turns of the run. If the run exceeds the number of prompt tokens specified, the run will end with status &#x60;complete&#x60;. See &#x60;incomplete_details&#x60; for more info.  | [optional] 
**max_completion_tokens** | **int** | The maximum number of completion tokens that may be used over the course of the run. The run will make a best effort to use only the number of completion tokens specified, across multiple turns of the run. If the run exceeds the number of completion tokens specified, the run will end with status &#x60;incomplete&#x60;. See &#x60;incomplete_details&#x60; for more info.  | [optional] 
**truncation_strategy** | [**truncation_object_t**](truncation_object.md) \* |  | [optional] 
**tool_choice** | [**assistants_api_tool_choice_option_t**](assistants_api_tool_choice_option.md) \* |  | [optional] 
**response_format** | [**assistants_api_response_format_option_t**](assistants_api_response_format_option.md) \* |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


