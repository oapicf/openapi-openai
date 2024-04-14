
# Table `RunStepDetailsToolCallsObject_tool_calls_inner`
(mapped from: RunStepDetailsToolCallsObjectToolCallsInner)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | text NOT NULL PRIMARY KEY |  | **kotlin.String** | The ID of the tool call object. | 
**type** | type | text NOT NULL |  | [**type**](#Type) | The type of tool call. This is always going to be &#x60;code_interpreter&#x60; for this type of tool call. | 
**codeInterpreter** | code_interpreter | long NOT NULL |  | [**RunStepDetailsToolCallsCodeObjectCodeInterpreter**](RunStepDetailsToolCallsCodeObjectCodeInterpreter.md) |  |  [foreignkey]
**retrieval** | retrieval | blob NOT NULL |  | [**kotlin.Any**](.md) | For now, this is always going to be an empty object. | 
**function** | function | long NOT NULL |  | [**RunStepDetailsToolCallsFunctionObjectFunction**](RunStepDetailsToolCallsFunctionObjectFunction.md) |  |  [foreignkey]







