
# Table `RunStepDeltaObject_delta_step_details`
(mapped from: RunStepDeltaObjectDeltaStepDetails)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**type** | type | text NOT NULL |  | [**type**](#Type) | Always &#x60;message_creation&#x60;. | 
**messageCreation** | message_creation | long |  | [**RunStepDeltaStepDetailsMessageCreationObjectMessageCreation**](RunStepDeltaStepDetailsMessageCreationObjectMessageCreation.md) |  |  [optional] [foreignkey]
**toolCalls** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;RunStepDeltaStepDetailsToolCallsObjectToolCallsInner&gt;**](RunStepDeltaStepDetailsToolCallsObjectToolCallsInner.md) | An array of tool calls the run step was involved in. These can be associated with one of three types of tools: &#x60;code_interpreter&#x60;, &#x60;retrieval&#x60;, or &#x60;function&#x60;.  |  [optional]




# **Table `RunStepDeltaObjectDeltaStepDetailsRunStepDeltaStepDetailsToolCallsObjectToolCallsInner`**
(mapped from: RunStepDeltaObjectDeltaStepDetailsRunStepDeltaStepDetailsToolCallsObjectToolCallsInner)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
runStepDeltaObjectDeltaStepDetails | runStepDeltaObjectDeltaStepDetails | long | | kotlin.Long | Primary Key | *one*
runStepDeltaStepDetailsToolCallsObjectToolCallsInner | runStepDeltaStepDetailsToolCallsObjectToolCallsInner | long | | kotlin.Long | Foreign Key | *many*



