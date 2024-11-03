# ChatCompletionNamedToolChoice

Specifies a tool the model should use. Use to force the model to call a specific function.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **str** | The type of the tool. Currently, only &#x60;function&#x60; is supported. | 
**function** | [**ChatCompletionNamedToolChoiceFunction**](ChatCompletionNamedToolChoiceFunction.md) |  | 

## Example

```python
from openapiopenai.models.chat_completion_named_tool_choice import ChatCompletionNamedToolChoice

# TODO update the JSON string below
json = "{}"
# create an instance of ChatCompletionNamedToolChoice from a JSON string
chat_completion_named_tool_choice_instance = ChatCompletionNamedToolChoice.from_json(json)
# print the JSON string representation of the object
print(ChatCompletionNamedToolChoice.to_json())

# convert the object into a dict
chat_completion_named_tool_choice_dict = chat_completion_named_tool_choice_instance.to_dict()
# create an instance of ChatCompletionNamedToolChoice from a dict
chat_completion_named_tool_choice_from_dict = ChatCompletionNamedToolChoice.from_dict(chat_completion_named_tool_choice_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


