# CreateVectorStoreRequestChunkingStrategy

The chunking strategy used to chunk the file(s). If not set, will use the `auto` strategy. Only applicable if `file_ids` is non-empty.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **str** | Always &#x60;auto&#x60;. | 
**static** | [**StaticChunkingStrategy**](StaticChunkingStrategy.md) |  | 

## Example

```python
from openapiopenai.models.create_vector_store_request_chunking_strategy import CreateVectorStoreRequestChunkingStrategy

# TODO update the JSON string below
json = "{}"
# create an instance of CreateVectorStoreRequestChunkingStrategy from a JSON string
create_vector_store_request_chunking_strategy_instance = CreateVectorStoreRequestChunkingStrategy.from_json(json)
# print the JSON string representation of the object
print(CreateVectorStoreRequestChunkingStrategy.to_json())

# convert the object into a dict
create_vector_store_request_chunking_strategy_dict = create_vector_store_request_chunking_strategy_instance.to_dict()
# create an instance of CreateVectorStoreRequestChunkingStrategy from a dict
create_vector_store_request_chunking_strategy_from_dict = CreateVectorStoreRequestChunkingStrategy.from_dict(create_vector_store_request_chunking_strategy_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


