# CreateChatCompletionRequestResponseFormat

An object specifying the format that the model must output. Compatible with [GPT-4 Turbo](/docs/models/gpt-4-and-gpt-4-turbo) and all GPT-3.5 Turbo models newer than `gpt-3.5-turbo-1106`.  Setting to `{ \"type\": \"json_object\" }` enables JSON mode, which guarantees the message the model generates is valid JSON.  **Important:** when using JSON mode, you **must** also instruct the model to produce JSON yourself via a system or user message. Without this, the model may generate an unending stream of whitespace until the generation reaches the token limit, resulting in a long-running and seemingly \"stuck\" request. Also note that the message content may be partially cut off if `finish_reason=\"length\"`, which indicates the generation exceeded `max_tokens` or the conversation exceeded the max context length. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **str** | Must be one of &#x60;text&#x60; or &#x60;json_object&#x60;. | [optional] [default to 'text']

## Example

```python
from openapiopenai.models.create_chat_completion_request_response_format import CreateChatCompletionRequestResponseFormat

# TODO update the JSON string below
json = "{}"
# create an instance of CreateChatCompletionRequestResponseFormat from a JSON string
create_chat_completion_request_response_format_instance = CreateChatCompletionRequestResponseFormat.from_json(json)
# print the JSON string representation of the object
print(CreateChatCompletionRequestResponseFormat.to_json())

# convert the object into a dict
create_chat_completion_request_response_format_dict = create_chat_completion_request_response_format_instance.to_dict()
# create an instance of CreateChatCompletionRequestResponseFormat from a dict
create_chat_completion_request_response_format_from_dict = CreateChatCompletionRequestResponseFormat.from_dict(create_chat_completion_request_response_format_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


