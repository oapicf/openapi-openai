# MessageFileObject

A list of files attached to a `message`.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** | The identifier, which can be referenced in API endpoints. | 
**object** | **str** | The object type, which is always &#x60;thread.message.file&#x60;. | 
**created_at** | **int** | The Unix timestamp (in seconds) for when the message file was created. | 
**message_id** | **str** | The ID of the [message](/docs/api-reference/messages) that the [File](/docs/api-reference/files) is attached to. | 

## Example

```python
from openapiopenai.models.message_file_object import MessageFileObject

# TODO update the JSON string below
json = "{}"
# create an instance of MessageFileObject from a JSON string
message_file_object_instance = MessageFileObject.from_json(json)
# print the JSON string representation of the object
print(MessageFileObject.to_json())

# convert the object into a dict
message_file_object_dict = message_file_object_instance.to_dict()
# create an instance of MessageFileObject from a dict
message_file_object_from_dict = MessageFileObject.from_dict(message_file_object_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


