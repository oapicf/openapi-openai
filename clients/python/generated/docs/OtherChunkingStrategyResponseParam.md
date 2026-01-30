# OtherChunkingStrategyResponseParam

This is returned when the chunking strategy is unknown. Typically, this is because the file was indexed before the `chunking_strategy` concept was introduced in the API.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **str** | Always &#x60;other&#x60;. | 

## Example

```python
from openapiopenai.models.other_chunking_strategy_response_param import OtherChunkingStrategyResponseParam

# TODO update the JSON string below
json = "{}"
# create an instance of OtherChunkingStrategyResponseParam from a JSON string
other_chunking_strategy_response_param_instance = OtherChunkingStrategyResponseParam.from_json(json)
# print the JSON string representation of the object
print(OtherChunkingStrategyResponseParam.to_json())

# convert the object into a dict
other_chunking_strategy_response_param_dict = other_chunking_strategy_response_param_instance.to_dict()
# create an instance of OtherChunkingStrategyResponseParam from a dict
other_chunking_strategy_response_param_from_dict = OtherChunkingStrategyResponseParam.from_dict(other_chunking_strategy_response_param_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


