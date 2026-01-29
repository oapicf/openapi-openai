# MessageDeltaContentTextObject

The text content that is part of a message.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**index** | **int** | The index of the content part in the message. | 
**type** | **str** | Always &#x60;text&#x60;. | 
**text** | [**MessageDeltaContentTextObjectText**](MessageDeltaContentTextObjectText.md) |  | [optional] 

## Example

```python
from openapiopenai.models.message_delta_content_text_object import MessageDeltaContentTextObject

# TODO update the JSON string below
json = "{}"
# create an instance of MessageDeltaContentTextObject from a JSON string
message_delta_content_text_object_instance = MessageDeltaContentTextObject.from_json(json)
# print the JSON string representation of the object
print(MessageDeltaContentTextObject.to_json())

# convert the object into a dict
message_delta_content_text_object_dict = message_delta_content_text_object_instance.to_dict()
# create an instance of MessageDeltaContentTextObject from a dict
message_delta_content_text_object_from_dict = MessageDeltaContentTextObject.from_dict(message_delta_content_text_object_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


