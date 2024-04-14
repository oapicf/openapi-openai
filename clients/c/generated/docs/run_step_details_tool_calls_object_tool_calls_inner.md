# run_step_details_tool_calls_object_tool_calls_inner_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **char \*** | The ID of the tool call object. | 
**type** | **openai_api_run_step_details_tool_calls_object_tool_calls_inner_TYPE_e** | The type of tool call. This is always going to be &#x60;code_interpreter&#x60; for this type of tool call. | 
**code_interpreter** | [**run_step_details_tool_calls_code_object_code_interpreter_t**](run_step_details_tool_calls_code_object_code_interpreter.md) \* |  | 
**retrieval** | [**object_t**](.md) \* | For now, this is always going to be an empty object. | 
**function** | [**run_step_details_tool_calls_function_object_function_t**](run_step_details_tool_calls_function_object_function.md) \* |  | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


