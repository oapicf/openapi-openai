
# Table `RunStepDetailsToolCallsObject`
(mapped from: RunStepDetailsToolCallsObject)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**type** | type | text NOT NULL |  | [**type**](#Type) | Always &#x60;tool_calls&#x60;. | 
**toolCalls** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;RunStepDetailsToolCallsObjectToolCallsInner&gt;**](RunStepDetailsToolCallsObjectToolCallsInner.md) | An array of tool calls the run step was involved in. These can be associated with one of three types of tools: &#x60;code_interpreter&#x60;, &#x60;retrieval&#x60;, or &#x60;function&#x60;.  | 



# **Table `RunStepDetailsToolCallsObjectRunStepDetailsToolCallsObjectToolCallsInner`**
(mapped from: RunStepDetailsToolCallsObjectRunStepDetailsToolCallsObjectToolCallsInner)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
runStepDetailsToolCallsObject | runStepDetailsToolCallsObject | long | | kotlin.Long | Primary Key | *one*
runStepDetailsToolCallsObjectToolCallsInner | runStepDetailsToolCallsObjectToolCallsInner | long | | kotlin.Long | Foreign Key | *many*



