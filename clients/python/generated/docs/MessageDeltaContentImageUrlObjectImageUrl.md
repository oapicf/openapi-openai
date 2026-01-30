# MessageDeltaContentImageUrlObjectImageUrl


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**url** | **str** | The URL of the image, must be a supported image types: jpeg, jpg, png, gif, webp. | [optional] 
**detail** | **str** | Specifies the detail level of the image. &#x60;low&#x60; uses fewer tokens, you can opt in to high resolution using &#x60;high&#x60;. | [optional] [default to 'auto']

## Example

```python
from openapiopenai.models.message_delta_content_image_url_object_image_url import MessageDeltaContentImageUrlObjectImageUrl

# TODO update the JSON string below
json = "{}"
# create an instance of MessageDeltaContentImageUrlObjectImageUrl from a JSON string
message_delta_content_image_url_object_image_url_instance = MessageDeltaContentImageUrlObjectImageUrl.from_json(json)
# print the JSON string representation of the object
print(MessageDeltaContentImageUrlObjectImageUrl.to_json())

# convert the object into a dict
message_delta_content_image_url_object_image_url_dict = message_delta_content_image_url_object_image_url_instance.to_dict()
# create an instance of MessageDeltaContentImageUrlObjectImageUrl from a dict
message_delta_content_image_url_object_image_url_from_dict = MessageDeltaContentImageUrlObjectImageUrl.from_dict(message_delta_content_image_url_object_image_url_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


