# StaticChunkingStrategyStatic

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**max_chunk_size_tokens** | **i32** | The maximum number of tokens in each chunk. The default value is `800`. The minimum value is `100` and the maximum value is `4096`. | 
**chunk_overlap_tokens** | **i32** | The number of tokens that overlap between chunks. The default value is `400`.  Note that the overlap must not exceed half of `max_chunk_size_tokens`.  | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


