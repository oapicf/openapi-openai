# StaticChunkingStrategyResponseParam


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **str** | Always &#x60;static&#x60;. | 
**static** | [**StaticChunkingStrategy**](StaticChunkingStrategy.md) |  | 

## Example

```python
from openapiopenai.models.static_chunking_strategy_response_param import StaticChunkingStrategyResponseParam

# TODO update the JSON string below
json = "{}"
# create an instance of StaticChunkingStrategyResponseParam from a JSON string
static_chunking_strategy_response_param_instance = StaticChunkingStrategyResponseParam.from_json(json)
# print the JSON string representation of the object
print(StaticChunkingStrategyResponseParam.to_json())

# convert the object into a dict
static_chunking_strategy_response_param_dict = static_chunking_strategy_response_param_instance.to_dict()
# create an instance of StaticChunkingStrategyResponseParam from a dict
static_chunking_strategy_response_param_from_dict = StaticChunkingStrategyResponseParam.from_dict(static_chunking_strategy_response_param_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


