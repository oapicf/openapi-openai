# MessageDeltaContentRefusalObject

The refusal content that is part of a message.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**index** | **int** | The index of the refusal part in the message. | 
**type** | **str** | Always &#x60;refusal&#x60;. | 
**refusal** | **str** |  | [optional] 

## Example

```python
from openapiopenai.models.message_delta_content_refusal_object import MessageDeltaContentRefusalObject

# TODO update the JSON string below
json = "{}"
# create an instance of MessageDeltaContentRefusalObject from a JSON string
message_delta_content_refusal_object_instance = MessageDeltaContentRefusalObject.from_json(json)
# print the JSON string representation of the object
print(MessageDeltaContentRefusalObject.to_json())

# convert the object into a dict
message_delta_content_refusal_object_dict = message_delta_content_refusal_object_instance.to_dict()
# create an instance of MessageDeltaContentRefusalObject from a dict
message_delta_content_refusal_object_from_dict = MessageDeltaContentRefusalObject.from_dict(message_delta_content_refusal_object_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


