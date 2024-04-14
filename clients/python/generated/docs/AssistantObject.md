# AssistantObject

Represents an `assistant` that can call the model and use tools.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** | The identifier, which can be referenced in API endpoints. | 
**object** | **str** | The object type, which is always &#x60;assistant&#x60;. | 
**created_at** | **int** | The Unix timestamp (in seconds) for when the assistant was created. | 
**name** | **str** | The name of the assistant. The maximum length is 256 characters.  | 
**description** | **str** | The description of the assistant. The maximum length is 512 characters.  | 
**model** | **str** | ID of the model to use. You can use the [List models](/docs/api-reference/models/list) API to see all of your available models, or see our [Model overview](/docs/models/overview) for descriptions of them.  | 
**instructions** | **str** | The system instructions that the assistant uses. The maximum length is 256,000 characters.  | 
**tools** | [**List[AssistantObjectToolsInner]**](AssistantObjectToolsInner.md) | A list of tool enabled on the assistant. There can be a maximum of 128 tools per assistant. Tools can be of types &#x60;code_interpreter&#x60;, &#x60;retrieval&#x60;, or &#x60;function&#x60;.  | [default to []]
**file_ids** | **List[str]** | A list of [file](/docs/api-reference/files) IDs attached to this assistant. There can be a maximum of 20 files attached to the assistant. Files are ordered by their creation date in ascending order.  | [default to []]
**metadata** | **object** | Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long.  | 

## Example

```python
from openapiopenai.models.assistant_object import AssistantObject

# TODO update the JSON string below
json = "{}"
# create an instance of AssistantObject from a JSON string
assistant_object_instance = AssistantObject.from_json(json)
# print the JSON string representation of the object
print(AssistantObject.to_json())

# convert the object into a dict
assistant_object_dict = assistant_object_instance.to_dict()
# create an instance of AssistantObject from a dict
assistant_object_form_dict = assistant_object.from_dict(assistant_object_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


