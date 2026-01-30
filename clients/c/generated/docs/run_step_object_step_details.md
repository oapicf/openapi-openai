# run_step_object_step_details_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **openai_api_run_step_object_step_details_TYPE_e** | Always &#x60;message_creation&#x60;. | 
**message_creation** | [**run_step_details_message_creation_object_message_creation_t**](run_step_details_message_creation_object_message_creation.md) \* |  | 
**tool_calls** | [**list_t**](run_step_details_tool_calls_object_tool_calls_inner.md) \* | An array of tool calls the run step was involved in. These can be associated with one of three types of tools: &#x60;code_interpreter&#x60;, &#x60;file_search&#x60;, or &#x60;function&#x60;.  | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


