

# RunStepDeltaObjectDeltaStepDetails

The details of the run step.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | Always &#x60;message_creation&#x60;. |  |
|**messageCreation** | [**RunStepDeltaStepDetailsMessageCreationObjectMessageCreation**](RunStepDeltaStepDetailsMessageCreationObjectMessageCreation.md) |  |  [optional] |
|**toolCalls** | [**List&lt;RunStepDeltaStepDetailsToolCallsObjectToolCallsInner&gt;**](RunStepDeltaStepDetailsToolCallsObjectToolCallsInner.md) | An array of tool calls the run step was involved in. These can be associated with one of three types of tools: &#x60;code_interpreter&#x60;, &#x60;retrieval&#x60;, or &#x60;function&#x60;.  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| MESSAGE_CREATION | &quot;message_creation&quot; |
| TOOL_CALLS | &quot;tool_calls&quot; |



