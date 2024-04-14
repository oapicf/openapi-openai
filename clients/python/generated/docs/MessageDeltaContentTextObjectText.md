# MessageDeltaContentTextObjectText


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**value** | **str** | The data that makes up the text. | [optional] 
**annotations** | [**List[MessageDeltaContentTextObjectTextAnnotationsInner]**](MessageDeltaContentTextObjectTextAnnotationsInner.md) |  | [optional] 

## Example

```python
from openapiopenai.models.message_delta_content_text_object_text import MessageDeltaContentTextObjectText

# TODO update the JSON string below
json = "{}"
# create an instance of MessageDeltaContentTextObjectText from a JSON string
message_delta_content_text_object_text_instance = MessageDeltaContentTextObjectText.from_json(json)
# print the JSON string representation of the object
print(MessageDeltaContentTextObjectText.to_json())

# convert the object into a dict
message_delta_content_text_object_text_dict = message_delta_content_text_object_text_instance.to_dict()
# create an instance of MessageDeltaContentTextObjectText from a dict
message_delta_content_text_object_text_form_dict = message_delta_content_text_object_text.from_dict(message_delta_content_text_object_text_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


