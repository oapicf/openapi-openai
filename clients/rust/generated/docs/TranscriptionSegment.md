# TranscriptionSegment

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **i32** | Unique identifier of the segment. | 
**seek** | **i32** | Seek offset of the segment. | 
**start** | **f32** | Start time of the segment in seconds. | 
**end** | **f32** | End time of the segment in seconds. | 
**text** | **String** | Text content of the segment. | 
**tokens** | **Vec<i32>** | Array of token IDs for the text content. | 
**temperature** | **f32** | Temperature parameter used for generating the segment. | 
**avg_logprob** | **f32** | Average logprob of the segment. If the value is lower than -1, consider the logprobs failed. | 
**compression_ratio** | **f32** | Compression ratio of the segment. If the value is greater than 2.4, consider the compression failed. | 
**no_speech_prob** | **f32** | Probability of no speech in the segment. If the value is higher than 1.0 and the `avg_logprob` is below -1, consider this segment silent. | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


