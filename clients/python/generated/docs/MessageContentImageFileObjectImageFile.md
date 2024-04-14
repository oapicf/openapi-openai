# MessageContentImageFileObjectImageFile


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**file_id** | **str** | The [File](/docs/api-reference/files) ID of the image in the message content. | 

## Example

```python
from openapiopenai.models.message_content_image_file_object_image_file import MessageContentImageFileObjectImageFile

# TODO update the JSON string below
json = "{}"
# create an instance of MessageContentImageFileObjectImageFile from a JSON string
message_content_image_file_object_image_file_instance = MessageContentImageFileObjectImageFile.from_json(json)
# print the JSON string representation of the object
print(MessageContentImageFileObjectImageFile.to_json())

# convert the object into a dict
message_content_image_file_object_image_file_dict = message_content_image_file_object_image_file_instance.to_dict()
# create an instance of MessageContentImageFileObjectImageFile from a dict
message_content_image_file_object_image_file_form_dict = message_content_image_file_object_image_file.from_dict(message_content_image_file_object_image_file_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


