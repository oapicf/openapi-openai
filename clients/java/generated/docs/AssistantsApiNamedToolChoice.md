

# AssistantsApiNamedToolChoice

Specifies a tool the model should use. Use to force the model to call a specific tool.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | The type of the tool. If type is &#x60;function&#x60;, the function name must be set |  |
|**function** | [**ChatCompletionNamedToolChoiceFunction**](ChatCompletionNamedToolChoiceFunction.md) |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| FUNCTION | &quot;function&quot; |
| CODE_INTERPRETER | &quot;code_interpreter&quot; |
| RETRIEVAL | &quot;retrieval&quot; |



