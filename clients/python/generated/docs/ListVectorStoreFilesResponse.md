# ListVectorStoreFilesResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**object** | **str** |  | 
**data** | [**List[VectorStoreFileObject]**](VectorStoreFileObject.md) |  | 
**first_id** | **str** |  | 
**last_id** | **str** |  | 
**has_more** | **bool** |  | 

## Example

```python
from openapiopenai.models.list_vector_store_files_response import ListVectorStoreFilesResponse

# TODO update the JSON string below
json = "{}"
# create an instance of ListVectorStoreFilesResponse from a JSON string
list_vector_store_files_response_instance = ListVectorStoreFilesResponse.from_json(json)
# print the JSON string representation of the object
print(ListVectorStoreFilesResponse.to_json())

# convert the object into a dict
list_vector_store_files_response_dict = list_vector_store_files_response_instance.to_dict()
# create an instance of ListVectorStoreFilesResponse from a dict
list_vector_store_files_response_from_dict = ListVectorStoreFilesResponse.from_dict(list_vector_store_files_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


