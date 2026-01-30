# StaticChunkingStrategy


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **str** | Always &#x60;static&#x60;. | 
**static** | [**StaticChunkingStrategyStatic**](StaticChunkingStrategyStatic.md) |  | 

## Example

```python
from openapiopenai.models.static_chunking_strategy import StaticChunkingStrategy

# TODO update the JSON string below
json = "{}"
# create an instance of StaticChunkingStrategy from a JSON string
static_chunking_strategy_instance = StaticChunkingStrategy.from_json(json)
# print the JSON string representation of the object
print(StaticChunkingStrategy.to_json())

# convert the object into a dict
static_chunking_strategy_dict = static_chunking_strategy_instance.to_dict()
# create an instance of StaticChunkingStrategy from a dict
static_chunking_strategy_from_dict = StaticChunkingStrategy.from_dict(static_chunking_strategy_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


