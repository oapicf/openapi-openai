# ModifyAssistantRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**model** | **str** |  | [optional] 
**name** | **str** | The name of the assistant. The maximum length is 256 characters.  | [optional] 
**description** | **str** | The description of the assistant. The maximum length is 512 characters.  | [optional] 
**instructions** | **str** | The system instructions that the assistant uses. The maximum length is 256,000 characters.  | [optional] 
**tools** | [**List[AssistantObjectToolsInner]**](AssistantObjectToolsInner.md) | A list of tool enabled on the assistant. There can be a maximum of 128 tools per assistant. Tools can be of types &#x60;code_interpreter&#x60;, &#x60;retrieval&#x60;, or &#x60;function&#x60;.  | [optional] [default to []]
**file_ids** | **List[str]** | A list of [File](/docs/api-reference/files) IDs attached to this assistant. There can be a maximum of 20 files attached to the assistant. Files are ordered by their creation date in ascending order. If a file was previously attached to the list but does not show up in the list, it will be deleted from the assistant.  | [optional] [default to []]
**metadata** | **object** | Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long.  | [optional] 

## Example

```python
from openapiopenai.models.modify_assistant_request import ModifyAssistantRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ModifyAssistantRequest from a JSON string
modify_assistant_request_instance = ModifyAssistantRequest.from_json(json)
# print the JSON string representation of the object
print(ModifyAssistantRequest.to_json())

# convert the object into a dict
modify_assistant_request_dict = modify_assistant_request_instance.to_dict()
# create an instance of ModifyAssistantRequest from a dict
modify_assistant_request_from_dict = ModifyAssistantRequest.from_dict(modify_assistant_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


