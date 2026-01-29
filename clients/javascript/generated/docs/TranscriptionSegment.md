# OpenapiOpenai.TranscriptionSegment

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Number** | Unique identifier of the segment. | 
**seek** | **Number** | Seek offset of the segment. | 
**start** | **Number** | Start time of the segment in seconds. | 
**end** | **Number** | End time of the segment in seconds. | 
**text** | **String** | Text content of the segment. | 
**tokens** | **[Number]** | Array of token IDs for the text content. | 
**temperature** | **Number** | Temperature parameter used for generating the segment. | 
**avgLogprob** | **Number** | Average logprob of the segment. If the value is lower than -1, consider the logprobs failed. | 
**compressionRatio** | **Number** | Compression ratio of the segment. If the value is greater than 2.4, consider the compression failed. | 
**noSpeechProb** | **Number** | Probability of no speech in the segment. If the value is higher than 1.0 and the &#x60;avg_logprob&#x60; is below -1, consider this segment silent. | 


