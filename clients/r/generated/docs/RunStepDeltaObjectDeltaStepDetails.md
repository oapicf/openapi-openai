# openapi::RunStepDeltaObjectDeltaStepDetails

The details of the run step.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **character** | Always &#x60;message_creation&#x60;. | [Enum: [message_creation, tool_calls]] 
**message_creation** | [**RunStepDeltaStepDetailsMessageCreationObjectMessageCreation**](RunStepDeltaStepDetailsMessageCreationObject_message_creation.md) |  | [optional] 
**tool_calls** | [**array[RunStepDeltaStepDetailsToolCallsObjectToolCallsInner]**](RunStepDeltaStepDetailsToolCallsObject_tool_calls_inner.md) | An array of tool calls the run step was involved in. These can be associated with one of three types of tools: &#x60;code_interpreter&#x60;, &#x60;retrieval&#x60;, or &#x60;function&#x60;.  | [optional] 


