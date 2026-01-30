# CreateChatCompletionStreamResponse

Represents a streamed chunk of a chat completion response returned by model, based on the provided input.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** | A unique identifier for the chat completion. Each chunk has the same ID. | 
**choices** | [**List[CreateChatCompletionStreamResponseChoicesInner]**](CreateChatCompletionStreamResponseChoicesInner.md) | A list of chat completion choices. Can contain more than one elements if &#x60;n&#x60; is greater than 1. Can also be empty for the last chunk if you set &#x60;stream_options: {\&quot;include_usage\&quot;: true}&#x60;.  | 
**created** | **int** | The Unix timestamp (in seconds) of when the chat completion was created. Each chunk has the same timestamp. | 
**model** | **str** | The model to generate the completion. | 
**service_tier** | **str** | The service tier used for processing the request. This field is only included if the &#x60;service_tier&#x60; parameter is specified in the request. | [optional] 
**system_fingerprint** | **str** | This fingerprint represents the backend configuration that the model runs with. Can be used in conjunction with the &#x60;seed&#x60; request parameter to understand when backend changes have been made that might impact determinism.  | [optional] 
**object** | **str** | The object type, which is always &#x60;chat.completion.chunk&#x60;. | 
**usage** | [**CreateChatCompletionStreamResponseUsage**](CreateChatCompletionStreamResponseUsage.md) |  | [optional] 

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
create_chat_completion_stream_response_from_dict = CreateChatCompletionStreamResponse.from_dict(create_chat_completion_stream_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


