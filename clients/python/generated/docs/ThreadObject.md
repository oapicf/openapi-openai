# ThreadObject

Represents a thread that contains [messages](/docs/api-reference/messages).

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** | The identifier, which can be referenced in API endpoints. | 
**object** | **str** | The object type, which is always &#x60;thread&#x60;. | 
**created_at** | **int** | The Unix timestamp (in seconds) for when the thread was created. | 
**tool_resources** | [**ModifyThreadRequestToolResources**](ModifyThreadRequestToolResources.md) |  | 
**metadata** | **object** | Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.  | 

## Example

```python
from openapiopenai.models.thread_object import ThreadObject

# TODO update the JSON string below
json = "{}"
# create an instance of ThreadObject from a JSON string
thread_object_instance = ThreadObject.from_json(json)
# print the JSON string representation of the object
print(ThreadObject.to_json())

# convert the object into a dict
thread_object_dict = thread_object_instance.to_dict()
# create an instance of ThreadObject from a dict
thread_object_from_dict = ThreadObject.from_dict(thread_object_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


