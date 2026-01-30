# MessageDeltaContentImageUrlObject

References an image URL in the content of a message.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**index** | **int** | The index of the content part in the message. | 
**type** | **str** | Always &#x60;image_url&#x60;. | 
**image_url** | [**MessageDeltaContentImageUrlObjectImageUrl**](MessageDeltaContentImageUrlObjectImageUrl.md) |  | [optional] 

## Example

```python
from openapiopenai.models.message_delta_content_image_url_object import MessageDeltaContentImageUrlObject

# TODO update the JSON string below
json = "{}"
# create an instance of MessageDeltaContentImageUrlObject from a JSON string
message_delta_content_image_url_object_instance = MessageDeltaContentImageUrlObject.from_json(json)
# print the JSON string representation of the object
print(MessageDeltaContentImageUrlObject.to_json())

# convert the object into a dict
message_delta_content_image_url_object_dict = message_delta_content_image_url_object_instance.to_dict()
# create an instance of MessageDeltaContentImageUrlObject from a dict
message_delta_content_image_url_object_from_dict = MessageDeltaContentImageUrlObject.from_dict(message_delta_content_image_url_object_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


