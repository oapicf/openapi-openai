# VectorStoreFileObjectChunkingStrategy

The strategy used to chunk the file.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **str** | Always &#x60;static&#x60;. | 
**static** | [**StaticChunkingStrategy**](StaticChunkingStrategy.md) |  | 

## Example

```python
from openapiopenai.models.vector_store_file_object_chunking_strategy import VectorStoreFileObjectChunkingStrategy

# TODO update the JSON string below
json = "{}"
# create an instance of VectorStoreFileObjectChunkingStrategy from a JSON string
vector_store_file_object_chunking_strategy_instance = VectorStoreFileObjectChunkingStrategy.from_json(json)
# print the JSON string representation of the object
print(VectorStoreFileObjectChunkingStrategy.to_json())

# convert the object into a dict
vector_store_file_object_chunking_strategy_dict = vector_store_file_object_chunking_strategy_instance.to_dict()
# create an instance of VectorStoreFileObjectChunkingStrategy from a dict
vector_store_file_object_chunking_strategy_from_dict = VectorStoreFileObjectChunkingStrategy.from_dict(vector_store_file_object_chunking_strategy_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


