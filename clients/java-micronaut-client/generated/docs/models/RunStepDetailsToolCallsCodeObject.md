

# RunStepDetailsToolCallsCodeObject

Details of the Code Interpreter tool call the run step was involved in.

The class is defined in **[RunStepDetailsToolCallsCodeObject.java](../../src/main/java/org/openapitools/model/RunStepDetailsToolCallsCodeObject.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | `String` | The ID of the tool call. | 
**type** | [**TypeEnum**](#TypeEnum) | The type of tool call. This is always going to be &#x60;code_interpreter&#x60; for this type of tool call. | 
**codeInterpreter** | [`RunStepDetailsToolCallsCodeObjectCodeInterpreter`](RunStepDetailsToolCallsCodeObjectCodeInterpreter.md) |  | 


## TypeEnum

Name | Value
---- | -----
CODE_INTERPRETER | `"code_interpreter"`



