# MessageContentTextAnnotationsFilePathObject

A URL for the file that's generated when the assistant used the `code_interpreter` tool to generate a file.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **str** | Always &#x60;file_path&#x60;. | 
**text** | **str** | The text in the message content that needs to be replaced. | 
**file_path** | [**MessageContentTextAnnotationsFilePathObjectFilePath**](MessageContentTextAnnotationsFilePathObjectFilePath.md) |  | 
**start_index** | **int** |  | 
**end_index** | **int** |  | 

## Example

```python
from openapiopenai.models.message_content_text_annotations_file_path_object import MessageContentTextAnnotationsFilePathObject

# TODO update the JSON string below
json = "{}"
# create an instance of MessageContentTextAnnotationsFilePathObject from a JSON string
message_content_text_annotations_file_path_object_instance = MessageContentTextAnnotationsFilePathObject.from_json(json)
# print the JSON string representation of the object
print(MessageContentTextAnnotationsFilePathObject.to_json())

# convert the object into a dict
message_content_text_annotations_file_path_object_dict = message_content_text_annotations_file_path_object_instance.to_dict()
# create an instance of MessageContentTextAnnotationsFilePathObject from a dict
message_content_text_annotations_file_path_object_from_dict = MessageContentTextAnnotationsFilePathObject.from_dict(message_content_text_annotations_file_path_object_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


