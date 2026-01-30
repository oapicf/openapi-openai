

# AssistantsNamedToolChoice

Specifies a tool the model should use. Use to force the model to call a specific tool.

The class is defined in **[AssistantsNamedToolChoice.java](../../src/main/java/org/openapitools/model/AssistantsNamedToolChoice.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**TypeEnum**](#TypeEnum) | The type of the tool. If type is &#x60;function&#x60;, the function name must be set | 
**function** | [`AssistantsNamedToolChoiceFunction`](AssistantsNamedToolChoiceFunction.md) |  |  [optional property]

## TypeEnum

Name | Value
---- | -----
FUNCTION | `"function"`
CODE_INTERPRETER | `"code_interpreter"`
FILE_SEARCH | `"file_search"`



