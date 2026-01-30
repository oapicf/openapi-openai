# ListFilesResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**object** | **str** |  | 
**data** | [**List[OpenAIFile]**](OpenAIFile.md) |  | 
**first_id** | **str** |  | 
**last_id** | **str** |  | 
**has_more** | **bool** |  | 

## Example

```python
from openapiopenai.models.list_files_response import ListFilesResponse

# TODO update the JSON string below
json = "{}"
# create an instance of ListFilesResponse from a JSON string
list_files_response_instance = ListFilesResponse.from_json(json)
# print the JSON string representation of the object
print(ListFilesResponse.to_json())

# convert the object into a dict
list_files_response_dict = list_files_response_instance.to_dict()
# create an instance of ListFilesResponse from a dict
list_files_response_from_dict = ListFilesResponse.from_dict(list_files_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


