# RunStepObject_step_details
## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **type** | **String** | Always &#x60;message_creation&#x60;. | [default to null] |
| **message\_creation** | [**RunStepDetailsMessageCreationObject_message_creation**](RunStepDetailsMessageCreationObject_message_creation.md) |  | [default to null] |
| **tool\_calls** | [**List**](RunStepDetailsToolCallsObject_tool_calls_inner.md) | An array of tool calls the run step was involved in. These can be associated with one of three types of tools: &#x60;code_interpreter&#x60;, &#x60;file_search&#x60;, or &#x60;function&#x60;.  | [default to null] |

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

