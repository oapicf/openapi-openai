# RUN_STEP_DELTA_OBJECT_DELTA_STEP_DETAILS

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**STRING_32**](STRING_32.md) | Always &#x60;message_creation&#x60;. | [default to null]
**message_creation** | [**RUN_STEP_DELTA_STEP_DETAILS_MESSAGE_CREATION_OBJECT_MESSAGE_CREATION**](RunStepDeltaStepDetailsMessageCreationObject_message_creation.md) |  | [optional] [default to null]
**tool_calls** | [**LIST [RUN_STEP_DELTA_STEP_DETAILS_TOOL_CALLS_OBJECT_TOOL_CALLS_INNER]**](RunStepDeltaStepDetailsToolCallsObject_tool_calls_inner.md) | An array of tool calls the run step was involved in. These can be associated with one of three types of tools: &#x60;code_interpreter&#x60;, &#x60;retrieval&#x60;, or &#x60;function&#x60;.  | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


