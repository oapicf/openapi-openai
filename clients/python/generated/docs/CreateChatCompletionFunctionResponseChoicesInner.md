# CreateChatCompletionFunctionResponseChoicesInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**finish_reason** | **str** | The reason the model stopped generating tokens. This will be &#x60;stop&#x60; if the model hit a natural stop point or a provided stop sequence, &#x60;length&#x60; if the maximum number of tokens specified in the request was reached, &#x60;content_filter&#x60; if content was omitted due to a flag from our content filters, or &#x60;function_call&#x60; if the model called a function.  | 
**index** | **int** | The index of the choice in the list of choices. | 
**message** | [**ChatCompletionResponseMessage**](ChatCompletionResponseMessage.md) |  | 

## Example

```python
from openapiopenai.models.create_chat_completion_function_response_choices_inner import CreateChatCompletionFunctionResponseChoicesInner

# TODO update the JSON string below
json = "{}"
# create an instance of CreateChatCompletionFunctionResponseChoicesInner from a JSON string
create_chat_completion_function_response_choices_inner_instance = CreateChatCompletionFunctionResponseChoicesInner.from_json(json)
# print the JSON string representation of the object
print(CreateChatCompletionFunctionResponseChoicesInner.to_json())

# convert the object into a dict
create_chat_completion_function_response_choices_inner_dict = create_chat_completion_function_response_choices_inner_instance.to_dict()
# create an instance of CreateChatCompletionFunctionResponseChoicesInner from a dict
create_chat_completion_function_response_choices_inner_from_dict = CreateChatCompletionFunctionResponseChoicesInner.from_dict(create_chat_completion_function_response_choices_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


