# openapi::RunStepDeltaStepDetailsToolCallsCodeObject

Details of the Code Interpreter tool call the run step was involved in.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**index** | **integer** | The index of the tool call in the tool calls array. | 
**id** | **character** | The ID of the tool call. | [optional] 
**type** | **character** | The type of tool call. This is always going to be &#x60;code_interpreter&#x60; for this type of tool call. | [Enum: [code_interpreter]] 
**code_interpreter** | [**RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter**](RunStepDeltaStepDetailsToolCallsCodeObject_code_interpreter.md) |  | [optional] 


