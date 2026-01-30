# AutoChunkingStrategyRequestParam

The default strategy. This strategy currently uses a `max_chunk_size_tokens` of `800` and `chunk_overlap_tokens` of `400`.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **str** | Always &#x60;auto&#x60;. | 

## Example

```python
from openapiopenai.models.auto_chunking_strategy_request_param import AutoChunkingStrategyRequestParam

# TODO update the JSON string below
json = "{}"
# create an instance of AutoChunkingStrategyRequestParam from a JSON string
auto_chunking_strategy_request_param_instance = AutoChunkingStrategyRequestParam.from_json(json)
# print the JSON string representation of the object
print(AutoChunkingStrategyRequestParam.to_json())

# convert the object into a dict
auto_chunking_strategy_request_param_dict = auto_chunking_strategy_request_param_instance.to_dict()
# create an instance of AutoChunkingStrategyRequestParam from a dict
auto_chunking_strategy_request_param_from_dict = AutoChunkingStrategyRequestParam.from_dict(auto_chunking_strategy_request_param_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


