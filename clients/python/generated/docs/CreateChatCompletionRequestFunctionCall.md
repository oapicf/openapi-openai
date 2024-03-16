# CreateChatCompletionRequestFunctionCall

Controls how the model responds to function calls. \"none\" means the model does not call a function, and responds to the end-user. \"auto\" means the model can pick between an end-user or calling a function.  Specifying a particular function via `{\"name\":\\ \"my_function\"}` forces the model to call that function. \"none\" is the default when no functions are present. \"auto\" is the default if functions are present.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** | The name of the function to call. | 

## Example

```python
from openapiopenai.models.create_chat_completion_request_function_call import CreateChatCompletionRequestFunctionCall

# TODO update the JSON string below
json = "{}"
# create an instance of CreateChatCompletionRequestFunctionCall from a JSON string
create_chat_completion_request_function_call_instance = CreateChatCompletionRequestFunctionCall.from_json(json)
# print the JSON string representation of the object
print(CreateChatCompletionRequestFunctionCall.to_json())

# convert the object into a dict
create_chat_completion_request_function_call_dict = create_chat_completion_request_function_call_instance.to_dict()
# create an instance of CreateChatCompletionRequestFunctionCall from a dict
create_chat_completion_request_function_call_form_dict = create_chat_completion_request_function_call.from_dict(create_chat_completion_request_function_call_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


