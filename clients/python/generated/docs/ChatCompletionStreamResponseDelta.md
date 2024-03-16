# ChatCompletionStreamResponseDelta


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**role** | **str** | The role of the author of this message. | [optional] 
**content** | **str** | The contents of the chunk message. | [optional] 
**function_call** | [**ChatCompletionRequestMessageFunctionCall**](ChatCompletionRequestMessageFunctionCall.md) |  | [optional] 

## Example

```python
from openapiopenai.models.chat_completion_stream_response_delta import ChatCompletionStreamResponseDelta

# TODO update the JSON string below
json = "{}"
# create an instance of ChatCompletionStreamResponseDelta from a JSON string
chat_completion_stream_response_delta_instance = ChatCompletionStreamResponseDelta.from_json(json)
# print the JSON string representation of the object
print(ChatCompletionStreamResponseDelta.to_json())

# convert the object into a dict
chat_completion_stream_response_delta_dict = chat_completion_stream_response_delta_instance.to_dict()
# create an instance of ChatCompletionStreamResponseDelta from a dict
chat_completion_stream_response_delta_form_dict = chat_completion_stream_response_delta.from_dict(chat_completion_stream_response_delta_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


