# OpenapiOpenai.RunStepDetailsToolCallsObjectToolCallsInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The ID of the tool call object. | 
**type** | **String** | The type of tool call. This is always going to be &#x60;code_interpreter&#x60; for this type of tool call. | 
**codeInterpreter** | [**RunStepDetailsToolCallsCodeObjectCodeInterpreter**](RunStepDetailsToolCallsCodeObjectCodeInterpreter.md) |  | 
**fileSearch** | [**RunStepDetailsToolCallsFileSearchObjectFileSearch**](RunStepDetailsToolCallsFileSearchObjectFileSearch.md) |  | 
**_function** | [**RunStepDetailsToolCallsFunctionObjectFunction**](RunStepDetailsToolCallsFunctionObjectFunction.md) |  | 



## Enum: TypeEnum


* `code_interpreter` (value: `"code_interpreter"`)

* `file_search` (value: `"file_search"`)

* `function` (value: `"function"`)




