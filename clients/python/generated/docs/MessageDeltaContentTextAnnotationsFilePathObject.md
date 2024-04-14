# MessageDeltaContentTextAnnotationsFilePathObject

A URL for the file that's generated when the assistant used the `code_interpreter` tool to generate a file.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**index** | **int** | The index of the annotation in the text content part. | 
**type** | **str** | Always &#x60;file_path&#x60;. | 
**text** | **str** | The text in the message content that needs to be replaced. | [optional] 
**file_path** | [**MessageDeltaContentTextAnnotationsFilePathObjectFilePath**](MessageDeltaContentTextAnnotationsFilePathObjectFilePath.md) |  | [optional] 
**start_index** | **int** |  | [optional] 
**end_index** | **int** |  | [optional] 

## Example

```python
from openapiopenai.models.message_delta_content_text_annotations_file_path_object import MessageDeltaContentTextAnnotationsFilePathObject

# TODO update the JSON string below
json = "{}"
# create an instance of MessageDeltaContentTextAnnotationsFilePathObject from a JSON string
message_delta_content_text_annotations_file_path_object_instance = MessageDeltaContentTextAnnotationsFilePathObject.from_json(json)
# print the JSON string representation of the object
print(MessageDeltaContentTextAnnotationsFilePathObject.to_json())

# convert the object into a dict
message_delta_content_text_annotations_file_path_object_dict = message_delta_content_text_annotations_file_path_object_instance.to_dict()
# create an instance of MessageDeltaContentTextAnnotationsFilePathObject from a dict
message_delta_content_text_annotations_file_path_object_form_dict = message_delta_content_text_annotations_file_path_object.from_dict(message_delta_content_text_annotations_file_path_object_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


