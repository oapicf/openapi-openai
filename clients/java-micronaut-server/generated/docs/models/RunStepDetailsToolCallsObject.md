

# RunStepDetailsToolCallsObject

Details of the tool call.

The class is defined in **[RunStepDetailsToolCallsObject.java](../../src/main/java/org/openapitools/model/RunStepDetailsToolCallsObject.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**TypeEnum**](#TypeEnum) | Always &#x60;tool_calls&#x60;. | 
**toolCalls** | [`List&lt;RunStepDetailsToolCallsObjectToolCallsInner&gt;`](RunStepDetailsToolCallsObjectToolCallsInner.md) | An array of tool calls the run step was involved in. These can be associated with one of three types of tools: &#x60;code_interpreter&#x60;, &#x60;file_search&#x60;, or &#x60;function&#x60;.  | 

## TypeEnum

Name | Value
---- | -----
TOOL_CALLS | `"tool_calls"`



