# AssistantFileObject

A list of [Files](/docs/api-reference/files) attached to an `assistant`.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** | The identifier, which can be referenced in API endpoints. | 
**object** | **str** | The object type, which is always &#x60;assistant.file&#x60;. | 
**created_at** | **int** | The Unix timestamp (in seconds) for when the assistant file was created. | 
**assistant_id** | **str** | The assistant ID that the file is attached to. | 

## Example

```python
from openapiopenai.models.assistant_file_object import AssistantFileObject

# TODO update the JSON string below
json = "{}"
# create an instance of AssistantFileObject from a JSON string
assistant_file_object_instance = AssistantFileObject.from_json(json)
# print the JSON string representation of the object
print(AssistantFileObject.to_json())

# convert the object into a dict
assistant_file_object_dict = assistant_file_object_instance.to_dict()
# create an instance of AssistantFileObject from a dict
assistant_file_object_from_dict = AssistantFileObject.from_dict(assistant_file_object_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


