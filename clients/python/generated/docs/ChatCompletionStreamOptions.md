# ChatCompletionStreamOptions

Options for streaming response. Only set this when you set `stream: true`. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**include_usage** | **bool** | If set, an additional chunk will be streamed before the &#x60;data: [DONE]&#x60; message. The &#x60;usage&#x60; field on this chunk shows the token usage statistics for the entire request, and the &#x60;choices&#x60; field will always be an empty array. All other chunks will also include a &#x60;usage&#x60; field, but with a null value.  | [optional] 

## Example

```python
from openapiopenai.models.chat_completion_stream_options import ChatCompletionStreamOptions

# TODO update the JSON string below
json = "{}"
# create an instance of ChatCompletionStreamOptions from a JSON string
chat_completion_stream_options_instance = ChatCompletionStreamOptions.from_json(json)
# print the JSON string representation of the object
print(ChatCompletionStreamOptions.to_json())

# convert the object into a dict
chat_completion_stream_options_dict = chat_completion_stream_options_instance.to_dict()
# create an instance of ChatCompletionStreamOptions from a dict
chat_completion_stream_options_from_dict = ChatCompletionStreamOptions.from_dict(chat_completion_stream_options_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


