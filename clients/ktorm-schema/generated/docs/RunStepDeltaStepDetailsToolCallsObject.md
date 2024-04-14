
# Table `RunStepDeltaStepDetailsToolCallsObject`
(mapped from: RunStepDeltaStepDetailsToolCallsObject)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**type** | type | text NOT NULL |  | [**type**](#Type) | Always &#x60;tool_calls&#x60;. | 
**toolCalls** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;RunStepDeltaStepDetailsToolCallsObjectToolCallsInner&gt;**](RunStepDeltaStepDetailsToolCallsObjectToolCallsInner.md) | An array of tool calls the run step was involved in. These can be associated with one of three types of tools: &#x60;code_interpreter&#x60;, &#x60;retrieval&#x60;, or &#x60;function&#x60;.  |  [optional]



# **Table `RunStepDeltaStepDetailsToolCallsObjectRunStepDeltaStepDetailsToolCallsObjectToolCallsInner`**
(mapped from: RunStepDeltaStepDetailsToolCallsObjectRunStepDeltaStepDetailsToolCallsObjectToolCallsInner)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
runStepDeltaStepDetailsToolCallsObject | runStepDeltaStepDetailsToolCallsObject | long | | kotlin.Long | Primary Key | *one*
runStepDeltaStepDetailsToolCallsObjectToolCallsInner | runStepDeltaStepDetailsToolCallsObjectToolCallsInner | long | | kotlin.Long | Foreign Key | *many*



