# VectorStoreFileObjectLastError

The last error associated with this vector store file. Will be `null` if there are no errors.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **str** | One of &#x60;server_error&#x60; or &#x60;rate_limit_exceeded&#x60;. | 
**message** | **str** | A human-readable description of the error. | 

## Example

```python
from openapiopenai.models.vector_store_file_object_last_error import VectorStoreFileObjectLastError

# TODO update the JSON string below
json = "{}"
# create an instance of VectorStoreFileObjectLastError from a JSON string
vector_store_file_object_last_error_instance = VectorStoreFileObjectLastError.from_json(json)
# print the JSON string representation of the object
print(VectorStoreFileObjectLastError.to_json())

# convert the object into a dict
vector_store_file_object_last_error_dict = vector_store_file_object_last_error_instance.to_dict()
# create an instance of VectorStoreFileObjectLastError from a dict
vector_store_file_object_last_error_from_dict = VectorStoreFileObjectLastError.from_dict(vector_store_file_object_last_error_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


