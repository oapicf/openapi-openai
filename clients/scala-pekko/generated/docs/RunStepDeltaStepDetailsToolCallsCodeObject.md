

# RunStepDeltaStepDetailsToolCallsCodeObject

Details of the Code Interpreter tool call the run step was involved in.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**index** | **Int** | The index of the tool call in the tool calls array. | 
**id** | **String** | The ID of the tool call. |  [optional]
**`type`** | [**`Type`**](#`Type`) | The type of tool call. This is always going to be &#x60;code_interpreter&#x60; for this type of tool call. | 
**codeInterpreter** | [**RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter**](RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter.md) |  |  [optional]


## Enum: `Type`
Allowed values: [code_interpreter]




