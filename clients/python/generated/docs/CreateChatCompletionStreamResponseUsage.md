# CreateChatCompletionStreamResponseUsage

An optional field that will only be present when you set `stream_options: {\"include_usage\": true}` in your request. When present, it contains a null value except for the last chunk which contains the token usage statistics for the entire request. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**completion_tokens** | **int** | Number of tokens in the generated completion. | 
**prompt_tokens** | **int** | Number of tokens in the prompt. | 
**total_tokens** | **int** | Total number of tokens used in the request (prompt + completion). | 

## Example

```python
from openapiopenai.models.create_chat_completion_stream_response_usage import CreateChatCompletionStreamResponseUsage

# TODO update the JSON string below
json = "{}"
# create an instance of CreateChatCompletionStreamResponseUsage from a JSON string
create_chat_completion_stream_response_usage_instance = CreateChatCompletionStreamResponseUsage.from_json(json)
# print the JSON string representation of the object
print(CreateChatCompletionStreamResponseUsage.to_json())

# convert the object into a dict
create_chat_completion_stream_response_usage_dict = create_chat_completion_stream_response_usage_instance.to_dict()
# create an instance of CreateChatCompletionStreamResponseUsage from a dict
create_chat_completion_stream_response_usage_from_dict = CreateChatCompletionStreamResponseUsage.from_dict(create_chat_completion_stream_response_usage_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


