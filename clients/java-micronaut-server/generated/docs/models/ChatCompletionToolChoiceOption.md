

# ChatCompletionToolChoiceOption

Controls which (if any) function is called by the model. `none` means the model will not call a function and instead generates a message. `auto` means the model can pick between generating a message or calling a function. Specifying a particular function via `{\"type\": \"function\", \"function\": {\"name\": \"my_function\"}}` forces the model to call that function.  `none` is the default when no functions are present. `auto` is the default if functions are present. 

The class is defined in **[ChatCompletionToolChoiceOption.java](../../src/main/java/org/openapitools/model/ChatCompletionToolChoiceOption.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**TypeEnum**](#TypeEnum) | The type of the tool. Currently, only &#x60;function&#x60; is supported. | 
**function** | [`ChatCompletionNamedToolChoiceFunction`](ChatCompletionNamedToolChoiceFunction.md) |  | 

## TypeEnum

Name | Value
---- | -----
FUNCTION | `"function"`



