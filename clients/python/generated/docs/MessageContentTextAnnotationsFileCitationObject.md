# MessageContentTextAnnotationsFileCitationObject

A citation within the message that points to a specific quote from a specific File associated with the assistant or the message. Generated when the assistant uses the \"file_search\" tool to search files.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **str** | Always &#x60;file_citation&#x60;. | 
**text** | **str** | The text in the message content that needs to be replaced. | 
**file_citation** | [**MessageContentTextAnnotationsFileCitationObjectFileCitation**](MessageContentTextAnnotationsFileCitationObjectFileCitation.md) |  | 
**start_index** | **int** |  | 
**end_index** | **int** |  | 

## Example

```python
from openapiopenai.models.message_content_text_annotations_file_citation_object import MessageContentTextAnnotationsFileCitationObject

# TODO update the JSON string below
json = "{}"
# create an instance of MessageContentTextAnnotationsFileCitationObject from a JSON string
message_content_text_annotations_file_citation_object_instance = MessageContentTextAnnotationsFileCitationObject.from_json(json)
# print the JSON string representation of the object
print(MessageContentTextAnnotationsFileCitationObject.to_json())

# convert the object into a dict
message_content_text_annotations_file_citation_object_dict = message_content_text_annotations_file_citation_object_instance.to_dict()
# create an instance of MessageContentTextAnnotationsFileCitationObject from a dict
message_content_text_annotations_file_citation_object_from_dict = MessageContentTextAnnotationsFileCitationObject.from_dict(message_content_text_annotations_file_citation_object_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


