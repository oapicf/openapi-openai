# MessageContentImageFileObject

References an image [File](/docs/api-reference/files) in the content of a message.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **str** | Always &#x60;image_file&#x60;. | 
**image_file** | [**MessageContentImageFileObjectImageFile**](MessageContentImageFileObjectImageFile.md) |  | 

## Example

```python
from openapiopenai.models.message_content_image_file_object import MessageContentImageFileObject

# TODO update the JSON string below
json = "{}"
# create an instance of MessageContentImageFileObject from a JSON string
message_content_image_file_object_instance = MessageContentImageFileObject.from_json(json)
# print the JSON string representation of the object
print(MessageContentImageFileObject.to_json())

# convert the object into a dict
message_content_image_file_object_dict = message_content_image_file_object_instance.to_dict()
# create an instance of MessageContentImageFileObject from a dict
message_content_image_file_object_form_dict = message_content_image_file_object.from_dict(message_content_image_file_object_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


