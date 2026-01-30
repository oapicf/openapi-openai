# MessageContentImageFileObjectImageFile


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**file_id** | **str** | The [File](/docs/api-reference/files) ID of the image in the message content. Set &#x60;purpose&#x3D;\&quot;vision\&quot;&#x60; when uploading the File if you need to later display the file content. | 
**detail** | **str** | Specifies the detail level of the image if specified by the user. &#x60;low&#x60; uses fewer tokens, you can opt in to high resolution using &#x60;high&#x60;. | [optional] [default to 'auto']

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
message_content_image_file_object_image_file_from_dict = MessageContentImageFileObjectImageFile.from_dict(message_content_image_file_object_image_file_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


