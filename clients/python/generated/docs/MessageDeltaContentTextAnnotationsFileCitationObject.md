# MessageDeltaContentTextAnnotationsFileCitationObject

A citation within the message that points to a specific quote from a specific File associated with the assistant or the message. Generated when the assistant uses the \"retrieval\" tool to search files.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**index** | **int** | The index of the annotation in the text content part. | 
**type** | **str** | Always &#x60;file_citation&#x60;. | 
**text** | **str** | The text in the message content that needs to be replaced. | [optional] 
**file_citation** | [**MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation**](MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation.md) |  | [optional] 
**start_index** | **int** |  | [optional] 
**end_index** | **int** |  | [optional] 

## Example

```python
from openapiopenai.models.message_delta_content_text_annotations_file_citation_object import MessageDeltaContentTextAnnotationsFileCitationObject

# TODO update the JSON string below
json = "{}"
# create an instance of MessageDeltaContentTextAnnotationsFileCitationObject from a JSON string
message_delta_content_text_annotations_file_citation_object_instance = MessageDeltaContentTextAnnotationsFileCitationObject.from_json(json)
# print the JSON string representation of the object
print(MessageDeltaContentTextAnnotationsFileCitationObject.to_json())

# convert the object into a dict
message_delta_content_text_annotations_file_citation_object_dict = message_delta_content_text_annotations_file_citation_object_instance.to_dict()
# create an instance of MessageDeltaContentTextAnnotationsFileCitationObject from a dict
message_delta_content_text_annotations_file_citation_object_form_dict = message_delta_content_text_annotations_file_citation_object.from_dict(message_delta_content_text_annotations_file_citation_object_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


