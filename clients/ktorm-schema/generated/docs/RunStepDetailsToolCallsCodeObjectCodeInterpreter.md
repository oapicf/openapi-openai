
# Table `RunStepDetailsToolCallsCodeObject_code_interpreter`
(mapped from: RunStepDetailsToolCallsCodeObjectCodeInterpreter)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**input** | input | text NOT NULL |  | **kotlin.String** | The input to the Code Interpreter tool call. | 
**outputs** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner&gt;**](RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner.md) | The outputs from the Code Interpreter tool call. Code Interpreter can output one or more items, including text (&#x60;logs&#x60;) or images (&#x60;image&#x60;). Each of these are represented by a different object type. | 



# **Table `RunStepDetailsToolCallsCodeObjectCodeInterpreterRunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner`**
(mapped from: RunStepDetailsToolCallsCodeObjectCodeInterpreterRunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
runStepDetailsToolCallsCodeObjectCodeInterpreter | runStepDetailsToolCallsCodeObjectCodeInterpreter | long | | kotlin.Long | Primary Key | *one*
runStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner | runStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner | long | | kotlin.Long | Foreign Key | *many*



