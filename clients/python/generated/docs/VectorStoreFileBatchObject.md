# VectorStoreFileBatchObject

A batch of files attached to a vector store.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** | The identifier, which can be referenced in API endpoints. | 
**object** | **str** | The object type, which is always &#x60;vector_store.file_batch&#x60;. | 
**created_at** | **int** | The Unix timestamp (in seconds) for when the vector store files batch was created. | 
**vector_store_id** | **str** | The ID of the [vector store](/docs/api-reference/vector-stores/object) that the [File](/docs/api-reference/files) is attached to. | 
**status** | **str** | The status of the vector store files batch, which can be either &#x60;in_progress&#x60;, &#x60;completed&#x60;, &#x60;cancelled&#x60; or &#x60;failed&#x60;. | 
**file_counts** | [**VectorStoreFileBatchObjectFileCounts**](VectorStoreFileBatchObjectFileCounts.md) |  | 

## Example

```python
from openapiopenai.models.vector_store_file_batch_object import VectorStoreFileBatchObject

# TODO update the JSON string below
json = "{}"
# create an instance of VectorStoreFileBatchObject from a JSON string
vector_store_file_batch_object_instance = VectorStoreFileBatchObject.from_json(json)
# print the JSON string representation of the object
print(VectorStoreFileBatchObject.to_json())

# convert the object into a dict
vector_store_file_batch_object_dict = vector_store_file_batch_object_instance.to_dict()
# create an instance of VectorStoreFileBatchObject from a dict
vector_store_file_batch_object_from_dict = VectorStoreFileBatchObject.from_dict(vector_store_file_batch_object_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


