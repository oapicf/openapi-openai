
# RunStepDetailsToolCallsObjectToolCallsInner

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **kotlin.String** | The ID of the tool call object. | 
**type** | [**inline**](#Type) | The type of tool call. This is always going to be &#x60;code_interpreter&#x60; for this type of tool call. | 
**codeInterpreter** | [**RunStepDetailsToolCallsCodeObjectCodeInterpreter**](RunStepDetailsToolCallsCodeObjectCodeInterpreter.md) |  | 
**retrieval** | [**kotlin.Any**](.md) | For now, this is always going to be an empty object. | 
**function** | [**RunStepDetailsToolCallsFunctionObjectFunction**](RunStepDetailsToolCallsFunctionObjectFunction.md) |  | 


<a id="Type"></a>
## Enum: type
Name | Value
---- | -----
type | code_interpreter, retrieval, function



