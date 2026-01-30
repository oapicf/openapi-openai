

# RunStepDetailsToolCallsObjectToolCallsInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The ID of the tool call object. |  |
|**type** | [**TypeEnum**](#TypeEnum) | The type of tool call. This is always going to be &#x60;code_interpreter&#x60; for this type of tool call. |  |
|**codeInterpreter** | [**RunStepDetailsToolCallsCodeObjectCodeInterpreter**](RunStepDetailsToolCallsCodeObjectCodeInterpreter.md) |  |  |
|**fileSearch** | [**RunStepDetailsToolCallsFileSearchObjectFileSearch**](RunStepDetailsToolCallsFileSearchObjectFileSearch.md) |  |  |
|**function** | [**RunStepDetailsToolCallsFunctionObjectFunction**](RunStepDetailsToolCallsFunctionObjectFunction.md) |  |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| CODE_INTERPRETER | &quot;code_interpreter&quot; |
| FILE_SEARCH | &quot;file_search&quot; |
| FUNCTION | &quot;function&quot; |



