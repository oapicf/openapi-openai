# DeleteVectorStoreFileResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** |  | 
**deleted** | **bool** |  | 
**object** | **str** |  | 

## Example

```python
from openapiopenai.models.delete_vector_store_file_response import DeleteVectorStoreFileResponse

# TODO update the JSON string below
json = "{}"
# create an instance of DeleteVectorStoreFileResponse from a JSON string
delete_vector_store_file_response_instance = DeleteVectorStoreFileResponse.from_json(json)
# print the JSON string representation of the object
print(DeleteVectorStoreFileResponse.to_json())

# convert the object into a dict
delete_vector_store_file_response_dict = delete_vector_store_file_response_instance.to_dict()
# create an instance of DeleteVectorStoreFileResponse from a dict
delete_vector_store_file_response_from_dict = DeleteVectorStoreFileResponse.from_dict(delete_vector_store_file_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


