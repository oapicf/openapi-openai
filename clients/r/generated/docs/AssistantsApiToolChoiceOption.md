# openapi::AssistantsApiToolChoiceOption

Controls which (if any) tool is called by the model. `none` means the model will not call any tools and instead generates a message. `auto` is the default value and means the model can pick between generating a message or calling a tool. Specifying a particular tool like `{\"type\": \"TOOL_TYPE\"}` or `{\"type\": \"function\", \"function\": {\"name\": \"my_function\"}}` forces the model to call that tool. 

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **character** | The type of the tool. If type is &#x60;function&#x60;, the function name must be set | [Enum: [function, code_interpreter, retrieval]] 
**function** | [**ChatCompletionNamedToolChoiceFunction**](ChatCompletionNamedToolChoice_function.md) |  | [optional] 


