# fine_tune_chat_request_input_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**messages** | [**list_t**](fine_tune_chat_request_input_messages_inner.md) \* |  | [optional] 
**tools** | [**list_t**](chat_completion_tool.md) \* | A list of tools the model may generate JSON inputs for. | [optional] 
**parallel_tool_calls** | **int** | Whether to enable [parallel function calling](/docs/guides/function-calling#configuring-parallel-function-calling) during tool use. | [optional] [default to true]
**functions** | [**list_t**](chat_completion_functions.md) \* | A list of functions the model may generate JSON inputs for. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


