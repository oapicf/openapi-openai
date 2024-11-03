# ListAssistantFilesResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**object** | **str** |  | 
**data** | [**List[AssistantFileObject]**](AssistantFileObject.md) |  | 
**first_id** | **str** |  | 
**last_id** | **str** |  | 
**has_more** | **bool** |  | 

## Example

```python
from openapiopenai.models.list_assistant_files_response import ListAssistantFilesResponse

# TODO update the JSON string below
json = "{}"
# create an instance of ListAssistantFilesResponse from a JSON string
list_assistant_files_response_instance = ListAssistantFilesResponse.from_json(json)
# print the JSON string representation of the object
print(ListAssistantFilesResponse.to_json())

# convert the object into a dict
list_assistant_files_response_dict = list_assistant_files_response_instance.to_dict()
# create an instance of ListAssistantFilesResponse from a dict
list_assistant_files_response_from_dict = ListAssistantFilesResponse.from_dict(list_assistant_files_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


