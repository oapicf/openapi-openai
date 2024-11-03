# ChatCompletionRequestMessageContentPartImageImageUrl


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**url** | **str** | Either a URL of the image or the base64 encoded image data. | 
**detail** | **str** | Specifies the detail level of the image. Learn more in the [Vision guide](/docs/guides/vision/low-or-high-fidelity-image-understanding). | [optional] [default to 'auto']

## Example

```python
from openapiopenai.models.chat_completion_request_message_content_part_image_image_url import ChatCompletionRequestMessageContentPartImageImageUrl

# TODO update the JSON string below
json = "{}"
# create an instance of ChatCompletionRequestMessageContentPartImageImageUrl from a JSON string
chat_completion_request_message_content_part_image_image_url_instance = ChatCompletionRequestMessageContentPartImageImageUrl.from_json(json)
# print the JSON string representation of the object
print(ChatCompletionRequestMessageContentPartImageImageUrl.to_json())

# convert the object into a dict
chat_completion_request_message_content_part_image_image_url_dict = chat_completion_request_message_content_part_image_image_url_instance.to_dict()
# create an instance of ChatCompletionRequestMessageContentPartImageImageUrl from a dict
chat_completion_request_message_content_part_image_image_url_from_dict = ChatCompletionRequestMessageContentPartImageImageUrl.from_dict(chat_completion_request_message_content_part_image_image_url_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


