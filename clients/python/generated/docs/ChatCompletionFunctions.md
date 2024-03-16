# ChatCompletionFunctions


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** | The name of the function to be called. Must be a-z, A-Z, 0-9, or contain underscores and dashes, with a maximum length of 64. | 
**description** | **str** | The description of what the function does. | [optional] 
**parameters** | **Dict[str, object]** | The parameters the functions accepts, described as a JSON Schema object. See the [guide](/docs/guides/gpt/function-calling) for examples, and the [JSON Schema reference](https://json-schema.org/understanding-json-schema/) for documentation about the format. | [optional] 

## Example

```python
from openapiopenai.models.chat_completion_functions import ChatCompletionFunctions

# TODO update the JSON string below
json = "{}"
# create an instance of ChatCompletionFunctions from a JSON string
chat_completion_functions_instance = ChatCompletionFunctions.from_json(json)
# print the JSON string representation of the object
print(ChatCompletionFunctions.to_json())

# convert the object into a dict
chat_completion_functions_dict = chat_completion_functions_instance.to_dict()
# create an instance of ChatCompletionFunctions from a dict
chat_completion_functions_form_dict = chat_completion_functions.from_dict(chat_completion_functions_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


