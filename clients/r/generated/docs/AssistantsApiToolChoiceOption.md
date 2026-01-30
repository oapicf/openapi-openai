# openapi::AssistantsApiToolChoiceOption

Controls which (if any) tool is called by the model. `none` means the model will not call any tools and instead generates a message. `auto` is the default value and means the model can pick between generating a message or calling one or more tools. `required` means the model must call one or more tools before responding to the user. Specifying a particular tool like `{\"type\": \"file_search\"}` or `{\"type\": \"function\", \"function\": {\"name\": \"my_function\"}}` forces the model to call that tool. 

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **character** | The type of the tool. If type is &#x60;function&#x60;, the function name must be set | [Enum: [function, code_interpreter, file_search]] 
**function** | [**AssistantsNamedToolChoiceFunction**](AssistantsNamedToolChoice_function.md) |  | [optional] 


