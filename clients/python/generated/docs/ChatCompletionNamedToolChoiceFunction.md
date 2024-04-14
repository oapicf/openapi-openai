# ChatCompletionNamedToolChoiceFunction


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** | The name of the function to call. | 

## Example

```python
from openapiopenai.models.chat_completion_named_tool_choice_function import ChatCompletionNamedToolChoiceFunction

# TODO update the JSON string below
json = "{}"
# create an instance of ChatCompletionNamedToolChoiceFunction from a JSON string
chat_completion_named_tool_choice_function_instance = ChatCompletionNamedToolChoiceFunction.from_json(json)
# print the JSON string representation of the object
print(ChatCompletionNamedToolChoiceFunction.to_json())

# convert the object into a dict
chat_completion_named_tool_choice_function_dict = chat_completion_named_tool_choice_function_instance.to_dict()
# create an instance of ChatCompletionNamedToolChoiceFunction from a dict
chat_completion_named_tool_choice_function_form_dict = chat_completion_named_tool_choice_function.from_dict(chat_completion_named_tool_choice_function_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


