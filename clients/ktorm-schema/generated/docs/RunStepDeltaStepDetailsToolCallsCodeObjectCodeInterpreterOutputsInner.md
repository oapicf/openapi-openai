
# Table `RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter_outputs_inner`
(mapped from: RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**index** | index | int NOT NULL |  | **kotlin.Int** | The index of the output in the outputs array. | 
**type** | type | text NOT NULL |  | [**type**](#Type) | Always &#x60;logs&#x60;. | 
**logs** | logs | text |  | **kotlin.String** | The text output from the Code Interpreter tool call. |  [optional]
**image** | image | long |  | [**RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage**](RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage.md) |  |  [optional] [foreignkey]






