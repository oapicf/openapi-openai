# MessageContentTextObjectText


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**value** | **str** | The data that makes up the text. | 
**annotations** | [**List[MessageContentTextObjectTextAnnotationsInner]**](MessageContentTextObjectTextAnnotationsInner.md) |  | 

## Example

```python
from openapiopenai.models.message_content_text_object_text import MessageContentTextObjectText

# TODO update the JSON string below
json = "{}"
# create an instance of MessageContentTextObjectText from a JSON string
message_content_text_object_text_instance = MessageContentTextObjectText.from_json(json)
# print the JSON string representation of the object
print(MessageContentTextObjectText.to_json())

# convert the object into a dict
message_content_text_object_text_dict = message_content_text_object_text_instance.to_dict()
# create an instance of MessageContentTextObjectText from a dict
message_content_text_object_text_form_dict = message_content_text_object_text.from_dict(message_content_text_object_text_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


