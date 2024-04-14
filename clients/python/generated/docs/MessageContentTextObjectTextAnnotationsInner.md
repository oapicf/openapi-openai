# MessageContentTextObjectTextAnnotationsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **str** | Always &#x60;file_citation&#x60;. | 
**text** | **str** | The text in the message content that needs to be replaced. | 
**file_citation** | [**MessageContentTextAnnotationsFileCitationObjectFileCitation**](MessageContentTextAnnotationsFileCitationObjectFileCitation.md) |  | 
**start_index** | **int** |  | 
**end_index** | **int** |  | 
**file_path** | [**MessageContentTextAnnotationsFilePathObjectFilePath**](MessageContentTextAnnotationsFilePathObjectFilePath.md) |  | 

## Example

```python
from openapiopenai.models.message_content_text_object_text_annotations_inner import MessageContentTextObjectTextAnnotationsInner

# TODO update the JSON string below
json = "{}"
# create an instance of MessageContentTextObjectTextAnnotationsInner from a JSON string
message_content_text_object_text_annotations_inner_instance = MessageContentTextObjectTextAnnotationsInner.from_json(json)
# print the JSON string representation of the object
print(MessageContentTextObjectTextAnnotationsInner.to_json())

# convert the object into a dict
message_content_text_object_text_annotations_inner_dict = message_content_text_object_text_annotations_inner_instance.to_dict()
# create an instance of MessageContentTextObjectTextAnnotationsInner from a dict
message_content_text_object_text_annotations_inner_form_dict = message_content_text_object_text_annotations_inner.from_dict(message_content_text_object_text_annotations_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


