

# RunStepDeltaObjectDeltaStepDetails

The details of the run step.

The class is defined in **[RunStepDeltaObjectDeltaStepDetails.java](../../src/main/java/org/openapitools/model/RunStepDeltaObjectDeltaStepDetails.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**TypeEnum**](#TypeEnum) | Always &#x60;message_creation&#x60;. | 
**messageCreation** | [`RunStepDeltaStepDetailsMessageCreationObjectMessageCreation`](RunStepDeltaStepDetailsMessageCreationObjectMessageCreation.md) |  |  [optional property]
**toolCalls** | [`List&lt;RunStepDeltaStepDetailsToolCallsObjectToolCallsInner&gt;`](RunStepDeltaStepDetailsToolCallsObjectToolCallsInner.md) | An array of tool calls the run step was involved in. These can be associated with one of three types of tools: &#x60;code_interpreter&#x60;, &#x60;file_search&#x60;, or &#x60;function&#x60;.  |  [optional property]

## TypeEnum

Name | Value
---- | -----
MESSAGE_CREATION | `"message_creation"`
TOOL_CALLS | `"tool_calls"`




