# ChatCompletionRequestAssistantMessageContent

The contents of the assistant message. Required unless `tool_calls` or `function_call` is specified. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------

## Example

```python
from openapiopenai.models.chat_completion_request_assistant_message_content import ChatCompletionRequestAssistantMessageContent

# TODO update the JSON string below
json = "{}"
# create an instance of ChatCompletionRequestAssistantMessageContent from a JSON string
chat_completion_request_assistant_message_content_instance = ChatCompletionRequestAssistantMessageContent.from_json(json)
# print the JSON string representation of the object
print(ChatCompletionRequestAssistantMessageContent.to_json())

# convert the object into a dict
chat_completion_request_assistant_message_content_dict = chat_completion_request_assistant_message_content_instance.to_dict()
# create an instance of ChatCompletionRequestAssistantMessageContent from a dict
chat_completion_request_assistant_message_content_from_dict = ChatCompletionRequestAssistantMessageContent.from_dict(chat_completion_request_assistant_message_content_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


