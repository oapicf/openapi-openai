# TranscriptionSegment

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Int** | Unique identifier of the segment. | 
**seek** | **Int** | Seek offset of the segment. | 
**start** | **Float** | Start time of the segment in seconds. | 
**end** | **Float** | End time of the segment in seconds. | 
**text** | **String** | Text content of the segment. | 
**tokens** | **[Int]** | Array of token IDs for the text content. | 
**temperature** | **Float** | Temperature parameter used for generating the segment. | 
**avgLogprob** | **Float** | Average logprob of the segment. If the value is lower than -1, consider the logprobs failed. | 
**compressionRatio** | **Float** | Compression ratio of the segment. If the value is greater than 2.4, consider the compression failed. | 
**noSpeechProb** | **Float** | Probability of no speech in the segment. If the value is higher than 1.0 and the &#x60;avg_logprob&#x60; is below -1, consider this segment silent. | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


