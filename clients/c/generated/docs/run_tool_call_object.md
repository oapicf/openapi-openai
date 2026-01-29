# run_tool_call_object_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **char \*** | The ID of the tool call. This ID must be referenced when you submit the tool outputs in using the [Submit tool outputs to run](/docs/api-reference/runs/submitToolOutputs) endpoint. | 
**type** | **openai_api_run_tool_call_object_TYPE_e** | The type of tool call the output is required for. For now, this is always &#x60;function&#x60;. | 
**function** | [**run_tool_call_object_function_t**](run_tool_call_object_function.md) \* |  | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


