

# RunStepDeltaStepDetailsToolCallsObjectToolCallsInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**index** | **Integer** | The index of the tool call in the tool calls array. |  |
|**id** | **String** | The ID of the tool call object. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | The type of tool call. This is always going to be &#x60;code_interpreter&#x60; for this type of tool call. |  |
|**codeInterpreter** | [**RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter**](RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter.md) |  |  [optional] |
|**fileSearch** | **Object** | For now, this is always going to be an empty object. |  |
|**function** | [**RunStepDeltaStepDetailsToolCallsFunctionObjectFunction**](RunStepDeltaStepDetailsToolCallsFunctionObjectFunction.md) |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| CODE_INTERPRETER | &quot;code_interpreter&quot; |
| FILE_SEARCH | &quot;file_search&quot; |
| FUNCTION | &quot;function&quot; |



