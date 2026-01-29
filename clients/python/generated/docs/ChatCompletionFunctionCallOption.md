# ChatCompletionFunctionCallOption

Specifying a particular function via `{\"name\": \"my_function\"}` forces the model to call that function. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** | The name of the function to call. | 

## Example

```python
from openapiopenai.models.chat_completion_function_call_option import ChatCompletionFunctionCallOption

# TODO update the JSON string below
json = "{}"
# create an instance of ChatCompletionFunctionCallOption from a JSON string
chat_completion_function_call_option_instance = ChatCompletionFunctionCallOption.from_json(json)
# print the JSON string representation of the object
print(ChatCompletionFunctionCallOption.to_json())

# convert the object into a dict
chat_completion_function_call_option_dict = chat_completion_function_call_option_instance.to_dict()
# create an instance of ChatCompletionFunctionCallOption from a dict
chat_completion_function_call_option_from_dict = ChatCompletionFunctionCallOption.from_dict(chat_completion_function_call_option_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


