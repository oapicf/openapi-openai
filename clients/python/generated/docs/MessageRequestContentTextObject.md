# MessageRequestContentTextObject

The text content that is part of a message.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **str** | Always &#x60;text&#x60;. | 
**text** | **str** | Text content to be sent to the model | 

## Example

```python
from openapiopenai.models.message_request_content_text_object import MessageRequestContentTextObject

# TODO update the JSON string below
json = "{}"
# create an instance of MessageRequestContentTextObject from a JSON string
message_request_content_text_object_instance = MessageRequestContentTextObject.from_json(json)
# print the JSON string representation of the object
print(MessageRequestContentTextObject.to_json())

# convert the object into a dict
message_request_content_text_object_dict = message_request_content_text_object_instance.to_dict()
# create an instance of MessageRequestContentTextObject from a dict
message_request_content_text_object_from_dict = MessageRequestContentTextObject.from_dict(message_request_content_text_object_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


