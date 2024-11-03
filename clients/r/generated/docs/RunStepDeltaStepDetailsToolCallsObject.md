# openapi::RunStepDeltaStepDetailsToolCallsObject

Details of the tool call.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **character** | Always &#x60;tool_calls&#x60;. | [Enum: [tool_calls]] 
**tool_calls** | [**array[RunStepDeltaStepDetailsToolCallsObjectToolCallsInner]**](RunStepDeltaStepDetailsToolCallsObject_tool_calls_inner.md) | An array of tool calls the run step was involved in. These can be associated with one of three types of tools: &#x60;code_interpreter&#x60;, &#x60;retrieval&#x60;, or &#x60;function&#x60;.  | [optional] 


