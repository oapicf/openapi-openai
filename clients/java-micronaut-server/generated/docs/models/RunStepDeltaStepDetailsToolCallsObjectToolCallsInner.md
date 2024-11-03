

# RunStepDeltaStepDetailsToolCallsObjectToolCallsInner

The class is defined in **[RunStepDeltaStepDetailsToolCallsObjectToolCallsInner.java](../../src/main/java/org/openapitools/model/RunStepDeltaStepDetailsToolCallsObjectToolCallsInner.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**index** | `Integer` | The index of the tool call in the tool calls array. | 
**id** | `String` | The ID of the tool call object. |  [optional property]
**type** | [**TypeEnum**](#TypeEnum) | The type of tool call. This is always going to be &#x60;code_interpreter&#x60; for this type of tool call. | 
**codeInterpreter** | [`RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter`](RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter.md) |  |  [optional property]
**retrieval** | `Object` | For now, this is always going to be an empty object. |  [optional property]
**function** | [`RunStepDeltaStepDetailsToolCallsFunctionObjectFunction`](RunStepDeltaStepDetailsToolCallsFunctionObjectFunction.md) |  |  [optional property]



## TypeEnum

Name | Value
---- | -----
CODE_INTERPRETER | `"code_interpreter"`
RETRIEVAL | `"retrieval"`
FUNCTION | `"function"`





