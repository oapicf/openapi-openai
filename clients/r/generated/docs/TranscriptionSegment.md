# openapi::TranscriptionSegment


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **integer** | Unique identifier of the segment. | 
**seek** | **integer** | Seek offset of the segment. | 
**start** | **numeric** | Start time of the segment in seconds. | 
**end** | **numeric** | End time of the segment in seconds. | 
**text** | **character** | Text content of the segment. | 
**tokens** | **array[integer]** | Array of token IDs for the text content. | 
**temperature** | **numeric** | Temperature parameter used for generating the segment. | 
**avg_logprob** | **numeric** | Average logprob of the segment. If the value is lower than -1, consider the logprobs failed. | 
**compression_ratio** | **numeric** | Compression ratio of the segment. If the value is greater than 2.4, consider the compression failed. | 
**no_speech_prob** | **numeric** | Probability of no speech in the segment. If the value is higher than 1.0 and the &#x60;avg_logprob&#x60; is below -1, consider this segment silent. | 


