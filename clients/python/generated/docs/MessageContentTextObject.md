# MessageContentTextObject

The text content that is part of a message.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **str** | Always &#x60;text&#x60;. | 
**text** | [**MessageContentTextObjectText**](MessageContentTextObjectText.md) |  | 

## Example

```python
from openapiopenai.models.message_content_text_object import MessageContentTextObject

# TODO update the JSON string below
json = "{}"
# create an instance of MessageContentTextObject from a JSON string
message_content_text_object_instance = MessageContentTextObject.from_json(json)
# print the JSON string representation of the object
print(MessageContentTextObject.to_json())

# convert the object into a dict
message_content_text_object_dict = message_content_text_object_instance.to_dict()
# create an instance of MessageContentTextObject from a dict
message_content_text_object_form_dict = message_content_text_object.from_dict(message_content_text_object_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


