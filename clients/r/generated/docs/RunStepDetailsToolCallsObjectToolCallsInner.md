# openapi::RunStepDetailsToolCallsObjectToolCallsInner


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **character** | The ID of the tool call object. | 
**type** | **character** | The type of tool call. This is always going to be &#x60;code_interpreter&#x60; for this type of tool call. | [Enum: [code_interpreter, file_search, function]] 
**code_interpreter** | [**RunStepDetailsToolCallsCodeObjectCodeInterpreter**](RunStepDetailsToolCallsCodeObject_code_interpreter.md) |  | 
**file_search** | [**RunStepDetailsToolCallsFileSearchObjectFileSearch**](RunStepDetailsToolCallsFileSearchObject_file_search.md) |  | 
**function** | [**RunStepDetailsToolCallsFunctionObjectFunction**](RunStepDetailsToolCallsFunctionObject_function.md) |  | 


