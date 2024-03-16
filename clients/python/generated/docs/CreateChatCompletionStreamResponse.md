# CreateChatCompletionStreamResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** |  | 
**object** | **str** |  | 
**created** | **int** |  | 
**model** | **str** |  | 
**choices** | [**List[CreateChatCompletionStreamResponseChoicesInner]**](CreateChatCompletionStreamResponseChoicesInner.md) |  | 

## Example

```python
from openapiopenai.models.create_chat_completion_stream_response import CreateChatCompletionStreamResponse

# TODO update the JSON string below
json = "{}"
# create an instance of CreateChatCompletionStreamResponse from a JSON string
create_chat_completion_stream_response_instance = CreateChatCompletionStreamResponse.from_json(json)
# print the JSON string representation of the object
print(CreateChatCompletionStreamResponse.to_json())

# convert the object into a dict
create_chat_completion_stream_response_dict = create_chat_completion_stream_response_instance.to_dict()
# create an instance of CreateChatCompletionStreamResponse from a dict
create_chat_completion_stream_response_form_dict = create_chat_completion_stream_response.from_dict(create_chat_completion_stream_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


