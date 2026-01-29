
# Table `RunStepDetailsToolCallsCodeObject`
(mapped from: RunStepDetailsToolCallsCodeObject)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | text NOT NULL PRIMARY KEY |  | **kotlin.String** | The ID of the tool call. | 
**type** | type | text NOT NULL |  | [**type**](#Type) | The type of tool call. This is always going to be &#x60;code_interpreter&#x60; for this type of tool call. | 
**codeInterpreter** | code_interpreter | long NOT NULL |  | [**RunStepDetailsToolCallsCodeObjectCodeInterpreter**](RunStepDetailsToolCallsCodeObjectCodeInterpreter.md) |  |  [foreignkey]





