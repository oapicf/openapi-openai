# OpenapiOpenai.RunStepDetailsToolCallsObjectToolCallsInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The ID of the tool call object. | 
**type** | **String** | The type of tool call. This is always going to be &#x60;code_interpreter&#x60; for this type of tool call. | 
**codeInterpreter** | [**RunStepDetailsToolCallsCodeObjectCodeInterpreter**](RunStepDetailsToolCallsCodeObjectCodeInterpreter.md) |  | 
**retrieval** | **Object** | For now, this is always going to be an empty object. | 
**_function** | [**RunStepDetailsToolCallsFunctionObjectFunction**](RunStepDetailsToolCallsFunctionObjectFunction.md) |  | 



## Enum: TypeEnum


* `code_interpreter` (value: `"code_interpreter"`)

* `retrieval` (value: `"retrieval"`)

* `function` (value: `"function"`)




