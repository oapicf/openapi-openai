# StaticChunkingStrategyStatic


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**max_chunk_size_tokens** | **int** | The maximum number of tokens in each chunk. The default value is &#x60;800&#x60;. The minimum value is &#x60;100&#x60; and the maximum value is &#x60;4096&#x60;. | 
**chunk_overlap_tokens** | **int** | The number of tokens that overlap between chunks. The default value is &#x60;400&#x60;.  Note that the overlap must not exceed half of &#x60;max_chunk_size_tokens&#x60;.  | 

## Example

```python
from openapiopenai.models.static_chunking_strategy_static import StaticChunkingStrategyStatic

# TODO update the JSON string below
json = "{}"
# create an instance of StaticChunkingStrategyStatic from a JSON string
static_chunking_strategy_static_instance = StaticChunkingStrategyStatic.from_json(json)
# print the JSON string representation of the object
print(StaticChunkingStrategyStatic.to_json())

# convert the object into a dict
static_chunking_strategy_static_dict = static_chunking_strategy_static_instance.to_dict()
# create an instance of StaticChunkingStrategyStatic from a dict
static_chunking_strategy_static_from_dict = StaticChunkingStrategyStatic.from_dict(static_chunking_strategy_static_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


