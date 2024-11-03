
# Table `RunStepDeltaStepDetailsToolCallsCodeObject`
(mapped from: RunStepDeltaStepDetailsToolCallsCodeObject)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**index** | index | int NOT NULL |  | **kotlin.Int** | The index of the tool call in the tool calls array. | 
**type** | type | text NOT NULL |  | [**type**](#Type) | The type of tool call. This is always going to be &#x60;code_interpreter&#x60; for this type of tool call. | 
**id** | id | text PRIMARY KEY |  | **kotlin.String** | The ID of the tool call. |  [optional]
**codeInterpreter** | code_interpreter | long |  | [**RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter**](RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter.md) |  |  [optional] [foreignkey]






