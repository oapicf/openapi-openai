# ListMessageFilesResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**object** | **str** |  | 
**data** | [**List[MessageFileObject]**](MessageFileObject.md) |  | 
**first_id** | **str** |  | 
**last_id** | **str** |  | 
**has_more** | **bool** |  | 

## Example

```python
from openapiopenai.models.list_message_files_response import ListMessageFilesResponse

# TODO update the JSON string below
json = "{}"
# create an instance of ListMessageFilesResponse from a JSON string
list_message_files_response_instance = ListMessageFilesResponse.from_json(json)
# print the JSON string representation of the object
print(ListMessageFilesResponse.to_json())

# convert the object into a dict
list_message_files_response_dict = list_message_files_response_instance.to_dict()
# create an instance of ListMessageFilesResponse from a dict
list_message_files_response_form_dict = list_message_files_response.from_dict(list_message_files_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


