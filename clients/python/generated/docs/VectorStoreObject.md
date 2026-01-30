# VectorStoreObject

A vector store is a collection of processed files can be used by the `file_search` tool.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** | The identifier, which can be referenced in API endpoints. | 
**object** | **str** | The object type, which is always &#x60;vector_store&#x60;. | 
**created_at** | **int** | The Unix timestamp (in seconds) for when the vector store was created. | 
**name** | **str** | The name of the vector store. | 
**usage_bytes** | **int** | The total number of bytes used by the files in the vector store. | 
**file_counts** | [**VectorStoreObjectFileCounts**](VectorStoreObjectFileCounts.md) |  | 
**status** | **str** | The status of the vector store, which can be either &#x60;expired&#x60;, &#x60;in_progress&#x60;, or &#x60;completed&#x60;. A status of &#x60;completed&#x60; indicates that the vector store is ready for use. | 
**expires_after** | [**VectorStoreExpirationAfter**](VectorStoreExpirationAfter.md) |  | [optional] 
**expires_at** | **int** | The Unix timestamp (in seconds) for when the vector store will expire. | [optional] 
**last_active_at** | **int** | The Unix timestamp (in seconds) for when the vector store was last active. | 
**metadata** | **object** | Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.  | 

## Example

```python
from openapiopenai.models.vector_store_object import VectorStoreObject

# TODO update the JSON string below
json = "{}"
# create an instance of VectorStoreObject from a JSON string
vector_store_object_instance = VectorStoreObject.from_json(json)
# print the JSON string representation of the object
print(VectorStoreObject.to_json())

# convert the object into a dict
vector_store_object_dict = vector_store_object_instance.to_dict()
# create an instance of VectorStoreObject from a dict
vector_store_object_from_dict = VectorStoreObject.from_dict(vector_store_object_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


