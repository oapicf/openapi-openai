# MessageContentImageUrlObject

References an image URL in the content of a message.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **str** | The type of the content part. | 
**image_url** | [**MessageContentImageUrlObjectImageUrl**](MessageContentImageUrlObjectImageUrl.md) |  | 

## Example

```python
from openapiopenai.models.message_content_image_url_object import MessageContentImageUrlObject

# TODO update the JSON string below
json = "{}"
# create an instance of MessageContentImageUrlObject from a JSON string
message_content_image_url_object_instance = MessageContentImageUrlObject.from_json(json)
# print the JSON string representation of the object
print(MessageContentImageUrlObject.to_json())

# convert the object into a dict
message_content_image_url_object_dict = message_content_image_url_object_instance.to_dict()
# create an instance of MessageContentImageUrlObject from a dict
message_content_image_url_object_from_dict = MessageContentImageUrlObject.from_dict(message_content_image_url_object_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


