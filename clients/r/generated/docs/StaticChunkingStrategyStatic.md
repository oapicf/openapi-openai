# openapi::StaticChunkingStrategyStatic


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**max_chunk_size_tokens** | **integer** | The maximum number of tokens in each chunk. The default value is &#x60;800&#x60;. The minimum value is &#x60;100&#x60; and the maximum value is &#x60;4096&#x60;. | [Max: 4096] [Min: 100] 
**chunk_overlap_tokens** | **integer** | The number of tokens that overlap between chunks. The default value is &#x60;400&#x60;.  Note that the overlap must not exceed half of &#x60;max_chunk_size_tokens&#x60;.  | 


