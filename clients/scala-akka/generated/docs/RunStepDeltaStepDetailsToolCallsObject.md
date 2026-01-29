

# RunStepDeltaStepDetailsToolCallsObject

Details of the tool call.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**`type`** | [**`Type`**](#`Type`) | Always &#x60;tool_calls&#x60;. | 
**toolCalls** | [**Seq&lt;RunStepDeltaStepDetailsToolCallsObjectToolCallsInner&gt;**](RunStepDeltaStepDetailsToolCallsObjectToolCallsInner.md) | An array of tool calls the run step was involved in. These can be associated with one of three types of tools: &#x60;code_interpreter&#x60;, &#x60;retrieval&#x60;, or &#x60;function&#x60;.  |  [optional]


## Enum: `Type`
Allowed values: [tool_calls]




