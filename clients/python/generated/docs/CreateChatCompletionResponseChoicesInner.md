# CreateChatCompletionResponseChoicesInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**index** | **int** |  | [optional] 
**message** | [**ChatCompletionResponseMessage**](ChatCompletionResponseMessage.md) |  | [optional] 
**finish_reason** | **str** |  | [optional] 

## Example

```python
from openapiopenai.models.create_chat_completion_response_choices_inner import CreateChatCompletionResponseChoicesInner

# TODO update the JSON string below
json = "{}"
# create an instance of CreateChatCompletionResponseChoicesInner from a JSON string
create_chat_completion_response_choices_inner_instance = CreateChatCompletionResponseChoicesInner.from_json(json)
# print the JSON string representation of the object
print(CreateChatCompletionResponseChoicesInner.to_json())

# convert the object into a dict
create_chat_completion_response_choices_inner_dict = create_chat_completion_response_choices_inner_instance.to_dict()
# create an instance of CreateChatCompletionResponseChoicesInner from a dict
create_chat_completion_response_choices_inner_form_dict = create_chat_completion_response_choices_inner.from_dict(create_chat_completion_response_choices_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


