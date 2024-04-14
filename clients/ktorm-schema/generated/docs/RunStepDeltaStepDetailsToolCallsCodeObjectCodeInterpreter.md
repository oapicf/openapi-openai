
# Table `RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter`
(mapped from: RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**input** | input | text |  | **kotlin.String** | The input to the Code Interpreter tool call. |  [optional]
**outputs** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner&gt;**](RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner.md) | The outputs from the Code Interpreter tool call. Code Interpreter can output one or more items, including text (&#x60;logs&#x60;) or images (&#x60;image&#x60;). Each of these are represented by a different object type. |  [optional]



# **Table `RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterRunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner`**
(mapped from: RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterRunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
runStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter | runStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter | long | | kotlin.Long | Primary Key | *one*
runStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner | runStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner | long | | kotlin.Long | Foreign Key | *many*



