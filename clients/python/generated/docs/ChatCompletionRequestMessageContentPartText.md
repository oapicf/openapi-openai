# ChatCompletionRequestMessageContentPartText


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **str** | The type of the content part. | 
**text** | **str** | The text content. | 

## Example

```python
from openapiopenai.models.chat_completion_request_message_content_part_text import ChatCompletionRequestMessageContentPartText

# TODO update the JSON string below
json = "{}"
# create an instance of ChatCompletionRequestMessageContentPartText from a JSON string
chat_completion_request_message_content_part_text_instance = ChatCompletionRequestMessageContentPartText.from_json(json)
# print the JSON string representation of the object
print(ChatCompletionRequestMessageContentPartText.to_json())

# convert the object into a dict
chat_completion_request_message_content_part_text_dict = chat_completion_request_message_content_part_text_instance.to_dict()
# create an instance of ChatCompletionRequestMessageContentPartText from a dict
chat_completion_request_message_content_part_text_form_dict = chat_completion_request_message_content_part_text.from_dict(chat_completion_request_message_content_part_text_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


