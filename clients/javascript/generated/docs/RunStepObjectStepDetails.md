# OpenapiOpenai.RunStepObjectStepDetails

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | Always &#x60;message_creation&#x60;. | 
**messageCreation** | [**RunStepDetailsMessageCreationObjectMessageCreation**](RunStepDetailsMessageCreationObjectMessageCreation.md) |  | 
**toolCalls** | [**[RunStepDetailsToolCallsObjectToolCallsInner]**](RunStepDetailsToolCallsObjectToolCallsInner.md) | An array of tool calls the run step was involved in. These can be associated with one of three types of tools: &#x60;code_interpreter&#x60;, &#x60;file_search&#x60;, or &#x60;function&#x60;.  | 



## Enum: TypeEnum


* `message_creation` (value: `"message_creation"`)

* `tool_calls` (value: `"tool_calls"`)




