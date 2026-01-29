# MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**file_id** | **str** | The ID of the specific File the citation is from. | [optional] 
**quote** | **str** | The specific quote in the file. | [optional] 

## Example

```python
from openapiopenai.models.message_delta_content_text_annotations_file_citation_object_file_citation import MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation

# TODO update the JSON string below
json = "{}"
# create an instance of MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation from a JSON string
message_delta_content_text_annotations_file_citation_object_file_citation_instance = MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation.from_json(json)
# print the JSON string representation of the object
print(MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation.to_json())

# convert the object into a dict
message_delta_content_text_annotations_file_citation_object_file_citation_dict = message_delta_content_text_annotations_file_citation_object_file_citation_instance.to_dict()
# create an instance of MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation from a dict
message_delta_content_text_annotations_file_citation_object_file_citation_from_dict = MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation.from_dict(message_delta_content_text_annotations_file_citation_object_file_citation_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


