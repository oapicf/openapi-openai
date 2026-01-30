# MessageContentImageUrlObjectImageUrl


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**url** | **str** | The external URL of the image, must be a supported image types: jpeg, jpg, png, gif, webp. | 
**detail** | **str** | Specifies the detail level of the image. &#x60;low&#x60; uses fewer tokens, you can opt in to high resolution using &#x60;high&#x60;. Default value is &#x60;auto&#x60; | [optional] [default to 'auto']

## Example

```python
from openapiopenai.models.message_content_image_url_object_image_url import MessageContentImageUrlObjectImageUrl

# TODO update the JSON string below
json = "{}"
# create an instance of MessageContentImageUrlObjectImageUrl from a JSON string
message_content_image_url_object_image_url_instance = MessageContentImageUrlObjectImageUrl.from_json(json)
# print the JSON string representation of the object
print(MessageContentImageUrlObjectImageUrl.to_json())

# convert the object into a dict
message_content_image_url_object_image_url_dict = message_content_image_url_object_image_url_instance.to_dict()
# create an instance of MessageContentImageUrlObjectImageUrl from a dict
message_content_image_url_object_image_url_from_dict = MessageContentImageUrlObjectImageUrl.from_dict(message_content_image_url_object_image_url_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


