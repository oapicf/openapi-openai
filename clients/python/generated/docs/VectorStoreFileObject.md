# VectorStoreFileObject

A list of files attached to a vector store.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** | The identifier, which can be referenced in API endpoints. | 
**object** | **str** | The object type, which is always &#x60;vector_store.file&#x60;. | 
**usage_bytes** | **int** | The total vector store usage in bytes. Note that this may be different from the original file size. | 
**created_at** | **int** | The Unix timestamp (in seconds) for when the vector store file was created. | 
**vector_store_id** | **str** | The ID of the [vector store](/docs/api-reference/vector-stores/object) that the [File](/docs/api-reference/files) is attached to. | 
**status** | **str** | The status of the vector store file, which can be either &#x60;in_progress&#x60;, &#x60;completed&#x60;, &#x60;cancelled&#x60;, or &#x60;failed&#x60;. The status &#x60;completed&#x60; indicates that the vector store file is ready for use. | 
**last_error** | [**VectorStoreFileObjectLastError**](VectorStoreFileObjectLastError.md) |  | 
**chunking_strategy** | [**VectorStoreFileObjectChunkingStrategy**](VectorStoreFileObjectChunkingStrategy.md) |  | [optional] 

## Example

```python
from openapiopenai.models.vector_store_file_object import VectorStoreFileObject

# TODO update the JSON string below
json = "{}"
# create an instance of VectorStoreFileObject from a JSON string
vector_store_file_object_instance = VectorStoreFileObject.from_json(json)
# print the JSON string representation of the object
print(VectorStoreFileObject.to_json())

# convert the object into a dict
vector_store_file_object_dict = vector_store_file_object_instance.to_dict()
# create an instance of VectorStoreFileObject from a dict
vector_store_file_object_from_dict = VectorStoreFileObject.from_dict(vector_store_file_object_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


