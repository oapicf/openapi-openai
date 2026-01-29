
# Table `RunStepObject_step_details`
(mapped from: RunStepObjectStepDetails)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**type** | type | text NOT NULL |  | [**type**](#Type) | Always &#x60;message_creation&#x60;. | 
**messageCreation** | message_creation | long NOT NULL |  | [**RunStepDetailsMessageCreationObjectMessageCreation**](RunStepDetailsMessageCreationObjectMessageCreation.md) |  |  [foreignkey]
**toolCalls** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;RunStepDetailsToolCallsObjectToolCallsInner&gt;**](RunStepDetailsToolCallsObjectToolCallsInner.md) | An array of tool calls the run step was involved in. These can be associated with one of three types of tools: &#x60;code_interpreter&#x60;, &#x60;retrieval&#x60;, or &#x60;function&#x60;.  | 




# **Table `RunStepObjectStepDetailsRunStepDetailsToolCallsObjectToolCallsInner`**
(mapped from: RunStepObjectStepDetailsRunStepDetailsToolCallsObjectToolCallsInner)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
runStepObjectStepDetails | runStepObjectStepDetails | long | | kotlin.Long | Primary Key | *one*
runStepDetailsToolCallsObjectToolCallsInner | runStepDetailsToolCallsObjectToolCallsInner | long | | kotlin.Long | Foreign Key | *many*



