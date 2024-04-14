

# AssistantsApiToolChoiceOption

Controls which (if any) tool is called by the model. `none` means the model will not call any tools and instead generates a message. `auto` is the default value and means the model can pick between generating a message or calling a tool. Specifying a particular tool like `{\"type\": \"TOOL_TYPE\"}` or `{\"type\": \"function\", \"function\": {\"name\": \"my_function\"}}` forces the model to call that tool. 

The class is defined in **[AssistantsApiToolChoiceOption.java](../../src/main/java/org/openapitools/model/AssistantsApiToolChoiceOption.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**TypeEnum**](#TypeEnum) | The type of the tool. If type is &#x60;function&#x60;, the function name must be set | 
**function** | [`ChatCompletionNamedToolChoiceFunction`](ChatCompletionNamedToolChoiceFunction.md) |  |  [optional property]

## TypeEnum

Name | Value
---- | -----
FUNCTION | `"function"`
CODE_INTERPRETER | `"code_interpreter"`
RETRIEVAL | `"retrieval"`



