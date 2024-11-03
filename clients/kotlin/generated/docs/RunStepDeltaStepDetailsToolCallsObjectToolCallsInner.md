
# RunStepDeltaStepDetailsToolCallsObjectToolCallsInner

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **index** | **kotlin.Int** | The index of the tool call in the tool calls array. |  |
| **type** | [**inline**](#Type) | The type of tool call. This is always going to be &#x60;code_interpreter&#x60; for this type of tool call. |  |
| **id** | **kotlin.String** | The ID of the tool call object. |  [optional] |
| **codeInterpreter** | [**RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter**](RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter.md) |  |  [optional] |
| **retrieval** | [**kotlin.Any**](.md) | For now, this is always going to be an empty object. |  [optional] |
| **function** | [**RunStepDeltaStepDetailsToolCallsFunctionObjectFunction**](RunStepDeltaStepDetailsToolCallsFunctionObjectFunction.md) |  |  [optional] |


<a id="Type"></a>
## Enum: type
| Name | Value |
| ---- | ----- |
| type | code_interpreter, retrieval, function |



