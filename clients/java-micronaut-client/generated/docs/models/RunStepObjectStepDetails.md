

# RunStepObjectStepDetails

The details of the run step.

The class is defined in **[RunStepObjectStepDetails.java](../../src/main/java/org/openapitools/model/RunStepObjectStepDetails.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**TypeEnum**](#TypeEnum) | Always &#x60;message_creation&#x60;. | 
**messageCreation** | [`RunStepDetailsMessageCreationObjectMessageCreation`](RunStepDetailsMessageCreationObjectMessageCreation.md) |  | 
**toolCalls** | [`List&lt;RunStepDetailsToolCallsObjectToolCallsInner&gt;`](RunStepDetailsToolCallsObjectToolCallsInner.md) | An array of tool calls the run step was involved in. These can be associated with one of three types of tools: &#x60;code_interpreter&#x60;, &#x60;retrieval&#x60;, or &#x60;function&#x60;.  | 

## TypeEnum

Name | Value
---- | -----
MESSAGE_CREATION | `"message_creation"`
TOOL_CALLS | `"tool_calls"`




