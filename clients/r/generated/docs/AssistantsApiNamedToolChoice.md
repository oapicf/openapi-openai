# openapi::AssistantsApiNamedToolChoice

Specifies a tool the model should use. Use to force the model to call a specific tool.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **character** | The type of the tool. If type is &#x60;function&#x60;, the function name must be set | [Enum: [function, code_interpreter, retrieval]] 
**function** | [**ChatCompletionNamedToolChoiceFunction**](ChatCompletionNamedToolChoice_function.md) |  | [optional] 


