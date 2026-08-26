

# RunStepDetailsToolCallsObject

Details of the tool call.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | Always &#x60;tool_calls&#x60;. |  |
|**toolCalls** | [**List&lt;RunStepDetailsToolCallsObjectToolCallsInner&gt;**](RunStepDetailsToolCallsObjectToolCallsInner.md) | An array of tool calls the run step was involved in. These can be associated with one of three types of tools: &#x60;code_interpreter&#x60;, &#x60;file_search&#x60;, or &#x60;function&#x60;.  |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| TOOL_CALLS | &quot;tool_calls&quot; |



