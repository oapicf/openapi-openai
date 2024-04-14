# MessageContentTextAnnotationsFileCitationObjectFileCitation


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**file_id** | **str** | The ID of the specific File the citation is from. | 
**quote** | **str** | The specific quote in the file. | 

## Example

```python
from openapiopenai.models.message_content_text_annotations_file_citation_object_file_citation import MessageContentTextAnnotationsFileCitationObjectFileCitation

# TODO update the JSON string below
json = "{}"
# create an instance of MessageContentTextAnnotationsFileCitationObjectFileCitation from a JSON string
message_content_text_annotations_file_citation_object_file_citation_instance = MessageContentTextAnnotationsFileCitationObjectFileCitation.from_json(json)
# print the JSON string representation of the object
print(MessageContentTextAnnotationsFileCitationObjectFileCitation.to_json())

# convert the object into a dict
message_content_text_annotations_file_citation_object_file_citation_dict = message_content_text_annotations_file_citation_object_file_citation_instance.to_dict()
# create an instance of MessageContentTextAnnotationsFileCitationObjectFileCitation from a dict
message_content_text_annotations_file_citation_object_file_citation_form_dict = message_content_text_annotations_file_citation_object_file_citation.from_dict(message_content_text_annotations_file_citation_object_file_citation_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


