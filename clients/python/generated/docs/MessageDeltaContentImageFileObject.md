# MessageDeltaContentImageFileObject

References an image [File](/docs/api-reference/files) in the content of a message.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**index** | **int** | The index of the content part in the message. | 
**type** | **str** | Always &#x60;image_file&#x60;. | 
**image_file** | [**MessageDeltaContentImageFileObjectImageFile**](MessageDeltaContentImageFileObjectImageFile.md) |  | [optional] 

## Example

```python
from openapiopenai.models.message_delta_content_image_file_object import MessageDeltaContentImageFileObject

# TODO update the JSON string below
json = "{}"
# create an instance of MessageDeltaContentImageFileObject from a JSON string
message_delta_content_image_file_object_instance = MessageDeltaContentImageFileObject.from_json(json)
# print the JSON string representation of the object
print(MessageDeltaContentImageFileObject.to_json())

# convert the object into a dict
message_delta_content_image_file_object_dict = message_delta_content_image_file_object_instance.to_dict()
# create an instance of MessageDeltaContentImageFileObject from a dict
message_delta_content_image_file_object_form_dict = message_delta_content_image_file_object.from_dict(message_delta_content_image_file_object_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


