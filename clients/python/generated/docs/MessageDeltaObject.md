# MessageDeltaObject

Represents a message delta i.e. any changed fields on a message during streaming. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** | The identifier of the message, which can be referenced in API endpoints. | 
**object** | **str** | The object type, which is always &#x60;thread.message.delta&#x60;. | 
**delta** | [**MessageDeltaObjectDelta**](MessageDeltaObjectDelta.md) |  | 

## Example

```python
from openapiopenai.models.message_delta_object import MessageDeltaObject

# TODO update the JSON string below
json = "{}"
# create an instance of MessageDeltaObject from a JSON string
message_delta_object_instance = MessageDeltaObject.from_json(json)
# print the JSON string representation of the object
print(MessageDeltaObject.to_json())

# convert the object into a dict
message_delta_object_dict = message_delta_object_instance.to_dict()
# create an instance of MessageDeltaObject from a dict
message_delta_object_form_dict = message_delta_object.from_dict(message_delta_object_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


