
# Table `RunStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner`
(mapped from: RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**type** | type | text NOT NULL |  | [**type**](#Type) | Always &#x60;logs&#x60;. | 
**logs** | logs | text NOT NULL |  | **kotlin.String** | The text output from the Code Interpreter tool call. | 
**image** | image | long NOT NULL |  | [**RunStepDetailsToolCallsCodeOutputImageObjectImage**](RunStepDetailsToolCallsCodeOutputImageObjectImage.md) |  |  [foreignkey]





