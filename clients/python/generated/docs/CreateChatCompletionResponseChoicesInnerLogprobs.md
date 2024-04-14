# CreateChatCompletionResponseChoicesInnerLogprobs

Log probability information for the choice.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**content** | [**List[ChatCompletionTokenLogprob]**](ChatCompletionTokenLogprob.md) | A list of message content tokens with log probability information. | 

## Example

```python
from openapiopenai.models.create_chat_completion_response_choices_inner_logprobs import CreateChatCompletionResponseChoicesInnerLogprobs

# TODO update the JSON string below
json = "{}"
# create an instance of CreateChatCompletionResponseChoicesInnerLogprobs from a JSON string
create_chat_completion_response_choices_inner_logprobs_instance = CreateChatCompletionResponseChoicesInnerLogprobs.from_json(json)
# print the JSON string representation of the object
print(CreateChatCompletionResponseChoicesInnerLogprobs.to_json())

# convert the object into a dict
create_chat_completion_response_choices_inner_logprobs_dict = create_chat_completion_response_choices_inner_logprobs_instance.to_dict()
# create an instance of CreateChatCompletionResponseChoicesInnerLogprobs from a dict
create_chat_completion_response_choices_inner_logprobs_form_dict = create_chat_completion_response_choices_inner_logprobs.from_dict(create_chat_completion_response_choices_inner_logprobs_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


