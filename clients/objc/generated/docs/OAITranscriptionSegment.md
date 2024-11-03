# OAITranscriptionSegment

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**_id** | **NSNumber*** | Unique identifier of the segment. | 
**seek** | **NSNumber*** | Seek offset of the segment. | 
**start** | **NSNumber*** | Start time of the segment in seconds. | 
**end** | **NSNumber*** | End time of the segment in seconds. | 
**text** | **NSString*** | Text content of the segment. | 
**tokens** | **NSArray&lt;NSNumber*&gt;*** | Array of token IDs for the text content. | 
**temperature** | **NSNumber*** | Temperature parameter used for generating the segment. | 
**avgLogprob** | **NSNumber*** | Average logprob of the segment. If the value is lower than -1, consider the logprobs failed. | 
**compressionRatio** | **NSNumber*** | Compression ratio of the segment. If the value is greater than 2.4, consider the compression failed. | 
**noSpeechProb** | **NSNumber*** | Probability of no speech in the segment. If the value is higher than 1.0 and the &#x60;avg_logprob&#x60; is below -1, consider this segment silent. | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


