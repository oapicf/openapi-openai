# CreateChatCompletionResponse

Represents a chat completion response returned by model, based on the provided input.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** | A unique identifier for the chat completion. | 
**choices** | [**List[CreateChatCompletionResponseChoicesInner]**](CreateChatCompletionResponseChoicesInner.md) | A list of chat completion choices. Can be more than one if &#x60;n&#x60; is greater than 1. | 
**created** | **int** | The Unix timestamp (in seconds) of when the chat completion was created. | 
**model** | **str** | The model used for the chat completion. | 
**system_fingerprint** | **str** | This fingerprint represents the backend configuration that the model runs with.  Can be used in conjunction with the &#x60;seed&#x60; request parameter to understand when backend changes have been made that might impact determinism.  | [optional] 
**object** | **str** | The object type, which is always &#x60;chat.completion&#x60;. | 
**usage** | [**CompletionUsage**](CompletionUsage.md) |  | [optional] 

## Example

```python
from openapiopenai.models.create_chat_completion_response import CreateChatCompletionResponse

# TODO update the JSON string below
json = "{}"
# create an instance of CreateChatCompletionResponse from a JSON string
create_chat_completion_response_instance = CreateChatCompletionResponse.from_json(json)
# print the JSON string representation of the object
print(CreateChatCompletionResponse.to_json())

# convert the object into a dict
create_chat_completion_response_dict = create_chat_completion_response_instance.to_dict()
# create an instance of CreateChatCompletionResponse from a dict
create_chat_completion_response_form_dict = create_chat_completion_response.from_dict(create_chat_completion_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


