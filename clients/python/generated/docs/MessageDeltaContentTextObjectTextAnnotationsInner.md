# MessageDeltaContentTextObjectTextAnnotationsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**index** | **int** | The index of the annotation in the text content part. | 
**type** | **str** | Always &#x60;file_citation&#x60;. | 
**text** | **str** | The text in the message content that needs to be replaced. | [optional] 
**file_citation** | [**MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation**](MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation.md) |  | [optional] 
**start_index** | **int** |  | [optional] 
**end_index** | **int** |  | [optional] 
**file_path** | [**MessageDeltaContentTextAnnotationsFilePathObjectFilePath**](MessageDeltaContentTextAnnotationsFilePathObjectFilePath.md) |  | [optional] 

## Example

```python
from openapiopenai.models.message_delta_content_text_object_text_annotations_inner import MessageDeltaContentTextObjectTextAnnotationsInner

# TODO update the JSON string below
json = "{}"
# create an instance of MessageDeltaContentTextObjectTextAnnotationsInner from a JSON string
message_delta_content_text_object_text_annotations_inner_instance = MessageDeltaContentTextObjectTextAnnotationsInner.from_json(json)
# print the JSON string representation of the object
print(MessageDeltaContentTextObjectTextAnnotationsInner.to_json())

# convert the object into a dict
message_delta_content_text_object_text_annotations_inner_dict = message_delta_content_text_object_text_annotations_inner_instance.to_dict()
# create an instance of MessageDeltaContentTextObjectTextAnnotationsInner from a dict
message_delta_content_text_object_text_annotations_inner_form_dict = message_delta_content_text_object_text_annotations_inner.from_dict(message_delta_content_text_object_text_annotations_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


