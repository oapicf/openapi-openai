# ChunkingStrategyRequestParam

The chunking strategy used to chunk the file(s). If not set, will use the `auto` strategy.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **str** | Always &#x60;auto&#x60;. | 
**static** | [**StaticChunkingStrategy**](StaticChunkingStrategy.md) |  | 

## Example

```python
from openapiopenai.models.chunking_strategy_request_param import ChunkingStrategyRequestParam

# TODO update the JSON string below
json = "{}"
# create an instance of ChunkingStrategyRequestParam from a JSON string
chunking_strategy_request_param_instance = ChunkingStrategyRequestParam.from_json(json)
# print the JSON string representation of the object
print(ChunkingStrategyRequestParam.to_json())

# convert the object into a dict
chunking_strategy_request_param_dict = chunking_strategy_request_param_instance.to_dict()
# create an instance of ChunkingStrategyRequestParam from a dict
chunking_strategy_request_param_from_dict = ChunkingStrategyRequestParam.from_dict(chunking_strategy_request_param_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


