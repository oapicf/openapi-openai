# ChatCompletionToolChoiceOption

Controls which (if any) function is called by the model. `none` means the model will not call a function and instead generates a message. `auto` means the model can pick between generating a message or calling a function. Specifying a particular function via `{\"type\": \"function\", \"function\": {\"name\": \"my_function\"}}` forces the model to call that function.  `none` is the default when no functions are present. `auto` is the default if functions are present. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **str** | The type of the tool. Currently, only &#x60;function&#x60; is supported. | 
**function** | [**ChatCompletionNamedToolChoiceFunction**](ChatCompletionNamedToolChoiceFunction.md) |  | 

## Example

```python
from openapiopenai.models.chat_completion_tool_choice_option import ChatCompletionToolChoiceOption

# TODO update the JSON string below
json = "{}"
# create an instance of ChatCompletionToolChoiceOption from a JSON string
chat_completion_tool_choice_option_instance = ChatCompletionToolChoiceOption.from_json(json)
# print the JSON string representation of the object
print(ChatCompletionToolChoiceOption.to_json())

# convert the object into a dict
chat_completion_tool_choice_option_dict = chat_completion_tool_choice_option_instance.to_dict()
# create an instance of ChatCompletionToolChoiceOption from a dict
chat_completion_tool_choice_option_from_dict = ChatCompletionToolChoiceOption.from_dict(chat_completion_tool_choice_option_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


