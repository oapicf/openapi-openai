# ChatCompletionRequestMessageContentPartImage


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **str** | The type of the content part. | 
**image_url** | [**ChatCompletionRequestMessageContentPartImageImageUrl**](ChatCompletionRequestMessageContentPartImageImageUrl.md) |  | 

## Example

```python
from openapiopenai.models.chat_completion_request_message_content_part_image import ChatCompletionRequestMessageContentPartImage

# TODO update the JSON string below
json = "{}"
# create an instance of ChatCompletionRequestMessageContentPartImage from a JSON string
chat_completion_request_message_content_part_image_instance = ChatCompletionRequestMessageContentPartImage.from_json(json)
# print the JSON string representation of the object
print(ChatCompletionRequestMessageContentPartImage.to_json())

# convert the object into a dict
chat_completion_request_message_content_part_image_dict = chat_completion_request_message_content_part_image_instance.to_dict()
# create an instance of ChatCompletionRequestMessageContentPartImage from a dict
chat_completion_request_message_content_part_image_form_dict = chat_completion_request_message_content_part_image.from_dict(chat_completion_request_message_content_part_image_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


