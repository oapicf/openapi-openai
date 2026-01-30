# run_step_delta_step_details_tool_calls_object_tool_calls_inner_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**index** | **int** | The index of the tool call in the tool calls array. | 
**id** | **char \*** | The ID of the tool call object. | [optional] 
**type** | **openai_api_run_step_delta_step_details_tool_calls_object_tool_calls_inner_TYPE_e** | The type of tool call. This is always going to be &#x60;code_interpreter&#x60; for this type of tool call. | 
**code_interpreter** | [**run_step_delta_step_details_tool_calls_code_object_code_interpreter_t**](run_step_delta_step_details_tool_calls_code_object_code_interpreter.md) \* |  | [optional] 
**file_search** | [**object_t**](.md) \* | For now, this is always going to be an empty object. | 
**function** | [**run_step_delta_step_details_tool_calls_function_object_function_t**](run_step_delta_step_details_tool_calls_function_object_function.md) \* |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


