# DeleteFileResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** |  | 
**object** | **str** |  | 
**deleted** | **bool** |  | 

## Example

```python
from openapiopenai.models.delete_file_response import DeleteFileResponse

# TODO update the JSON string below
json = "{}"
# create an instance of DeleteFileResponse from a JSON string
delete_file_response_instance = DeleteFileResponse.from_json(json)
# print the JSON string representation of the object
print(DeleteFileResponse.to_json())

# convert the object into a dict
delete_file_response_dict = delete_file_response_instance.to_dict()
# create an instance of DeleteFileResponse from a dict
delete_file_response_form_dict = delete_file_response.from_dict(delete_file_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


