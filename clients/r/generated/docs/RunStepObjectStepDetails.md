# openapi::RunStepObjectStepDetails

The details of the run step.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **character** | Always &#x60;message_creation&#x60;. | [Enum: [message_creation, tool_calls]] 
**message_creation** | [**RunStepDetailsMessageCreationObjectMessageCreation**](RunStepDetailsMessageCreationObject_message_creation.md) |  | 
**tool_calls** | [**array[RunStepDetailsToolCallsObjectToolCallsInner]**](RunStepDetailsToolCallsObject_tool_calls_inner.md) | An array of tool calls the run step was involved in. These can be associated with one of three types of tools: &#x60;code_interpreter&#x60;, &#x60;file_search&#x60;, or &#x60;function&#x60;.  | 


