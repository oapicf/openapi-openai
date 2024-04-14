
# Table `RunObject_required_action_submit_tool_outputs`
(mapped from: RunObjectRequiredActionSubmitToolOutputs)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**toolCalls** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;RunToolCallObject&gt;**](RunToolCallObject.md) | A list of the relevant tool calls. | 


# **Table `RunObjectRequiredActionSubmitToolOutputsRunToolCallObject`**
(mapped from: RunObjectRequiredActionSubmitToolOutputsRunToolCallObject)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
runObjectRequiredActionSubmitToolOutputs | runObjectRequiredActionSubmitToolOutputs | long | | kotlin.Long | Primary Key | *one*
runToolCallObject | runToolCallObject | long | | kotlin.Long | Foreign Key | *many*



