# ChatCompletionRequestUserMessageContentPart


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **str** | The type of the content part. | 
**text** | **str** | The text content. | 
**image_url** | [**ChatCompletionRequestMessageContentPartImageImageUrl**](ChatCompletionRequestMessageContentPartImageImageUrl.md) |  | 
**input_audio** | [**ChatCompletionRequestMessageContentPartAudioInputAudio**](ChatCompletionRequestMessageContentPartAudioInputAudio.md) |  | 

## Example

```python
from openapiopenai.models.chat_completion_request_user_message_content_part import ChatCompletionRequestUserMessageContentPart

# TODO update the JSON string below
json = "{}"
# create an instance of ChatCompletionRequestUserMessageContentPart from a JSON string
chat_completion_request_user_message_content_part_instance = ChatCompletionRequestUserMessageContentPart.from_json(json)
# print the JSON string representation of the object
print(ChatCompletionRequestUserMessageContentPart.to_json())

# convert the object into a dict
chat_completion_request_user_message_content_part_dict = chat_completion_request_user_message_content_part_instance.to_dict()
# create an instance of ChatCompletionRequestUserMessageContentPart from a dict
chat_completion_request_user_message_content_part_from_dict = ChatCompletionRequestUserMessageContentPart.from_dict(chat_completion_request_user_message_content_part_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


