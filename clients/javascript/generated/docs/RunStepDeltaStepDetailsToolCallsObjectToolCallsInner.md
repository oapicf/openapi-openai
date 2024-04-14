# OpenapiOpenai.RunStepDeltaStepDetailsToolCallsObjectToolCallsInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**index** | **Number** | The index of the tool call in the tool calls array. | 
**id** | **String** | The ID of the tool call object. | [optional] 
**type** | **String** | The type of tool call. This is always going to be &#x60;code_interpreter&#x60; for this type of tool call. | 
**codeInterpreter** | [**RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter**](RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter.md) |  | [optional] 
**retrieval** | **Object** | For now, this is always going to be an empty object. | [optional] 
**_function** | [**RunStepDeltaStepDetailsToolCallsFunctionObjectFunction**](RunStepDeltaStepDetailsToolCallsFunctionObjectFunction.md) |  | [optional] 



## Enum: TypeEnum


* `code_interpreter` (value: `"code_interpreter"`)

* `retrieval` (value: `"retrieval"`)

* `function` (value: `"function"`)




