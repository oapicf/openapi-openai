# MessageDeltaObjectDelta

The delta containing the fields that have changed on the Message.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**role** | **str** | The entity that produced the message. One of &#x60;user&#x60; or &#x60;assistant&#x60;. | [optional] 
**content** | [**List[MessageDeltaObjectDeltaContentInner]**](MessageDeltaObjectDeltaContentInner.md) | The content of the message in array of text and/or images. | [optional] 
**file_ids** | **List[str]** | A list of [file](/docs/api-reference/files) IDs that the assistant should use. Useful for tools like retrieval and code_interpreter that can access files. A maximum of 10 files can be attached to a message. | [optional] [default to []]

## Example

```python
from openapiopenai.models.message_delta_object_delta import MessageDeltaObjectDelta

# TODO update the JSON string below
json = "{}"
# create an instance of MessageDeltaObjectDelta from a JSON string
message_delta_object_delta_instance = MessageDeltaObjectDelta.from_json(json)
# print the JSON string representation of the object
print(MessageDeltaObjectDelta.to_json())

# convert the object into a dict
message_delta_object_delta_dict = message_delta_object_delta_instance.to_dict()
# create an instance of MessageDeltaObjectDelta from a dict
message_delta_object_delta_form_dict = message_delta_object_delta.from_dict(message_delta_object_delta_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


