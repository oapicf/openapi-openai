

# AssistantsApiNamedToolChoice

Specifies a tool the model should use. Use to force the model to call a specific tool.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**`type`** | [**`Type`**](#`Type`) | The type of the tool. If type is &#x60;function&#x60;, the function name must be set | 
**function** | [**ChatCompletionNamedToolChoiceFunction**](ChatCompletionNamedToolChoiceFunction.md) |  |  [optional]


## Enum: `Type`
Allowed values: [function, code_interpreter, retrieval]




