# StaticChunkingStrategyRequestParam


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **str** | Always &#x60;static&#x60;. | 
**static** | [**StaticChunkingStrategy**](StaticChunkingStrategy.md) |  | 

## Example

```python
from openapiopenai.models.static_chunking_strategy_request_param import StaticChunkingStrategyRequestParam

# TODO update the JSON string below
json = "{}"
# create an instance of StaticChunkingStrategyRequestParam from a JSON string
static_chunking_strategy_request_param_instance = StaticChunkingStrategyRequestParam.from_json(json)
# print the JSON string representation of the object
print(StaticChunkingStrategyRequestParam.to_json())

# convert the object into a dict
static_chunking_strategy_request_param_dict = static_chunking_strategy_request_param_instance.to_dict()
# create an instance of StaticChunkingStrategyRequestParam from a dict
static_chunking_strategy_request_param_from_dict = StaticChunkingStrategyRequestParam.from_dict(static_chunking_strategy_request_param_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


